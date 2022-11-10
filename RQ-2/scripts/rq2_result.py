import pandas as pd
import os, re, argparse
import csv

def collect_toga_stats(base_dir, subject,writer):
    fail_catch_re = re.compile(r"fail\(.*\).*}\s*catch", re.MULTILINE|re.DOTALL)
    test_regex=re.compile(r"Tests run:.*Failures.*Errors.*Skipped.*", re.MULTILINE|re.DOTALL)
    oracle_preds = pd.read_csv(base_dir+"/toga_output/oracle_preds.csv")

    test_name=oracle_preds['test_name']
    test_prefix=oracle_preds['test_prefix']
    loc=oracle_preds['bug_num']
    assert_pred=oracle_preds['assert_pred']
    except_pred=oracle_preds['except_pred']


    total_exception_prefix=0
    total_assertion_prefix=0
    exception_misclassification=0
    exception_correct_classification=0
    assertion_misclassification=0
    empty_prediction=0
    total_assertion_generated=0

    for test_name,test_prefix,loc,assert_pred,except_pred in zip(test_name,test_prefix,loc,assert_pred,except_pred):
        exception_prefix = re.search(fail_catch_re, test_prefix)
        if exception_prefix:
            total_exception_prefix=total_exception_prefix+1
            if int(except_pred)==0:
                exception_misclassification=exception_misclassification+1
            else:
                exception_correct_classification=exception_correct_classification+1
        else:
            total_assertion_prefix=total_assertion_prefix+1
            if int(except_pred)==1:
                assertion_misclassification=assertion_misclassification+1

            if  "assert" not in str(assert_pred):
                empty_prediction=empty_prediction+1
            else:
                total_assertion_generated=total_assertion_generated+1

    assert((empty_prediction+total_assertion_generated)==total_assertion_prefix)
    total_inputs=total_exception_prefix+total_assertion_prefix
    assertion_misclassification_rate = round((assertion_misclassification/total_assertion_prefix)*100)
    empty_prediction_rate = round(((empty_prediction - assertion_misclassification)/total_assertion_prefix)*100)
    assertion_generation_rate = round((total_assertion_generated/total_assertion_prefix)*100)

    EMCR= round((exception_misclassification/total_exception_prefix)*100)

    #now collect the false positive assertion count
    total_false_positive_assertion=0
    total_compilation_err=0
    for path, subdirs, files in os.walk(base_dir):
        for name in files:
            if name.endswith("toga-compilation_error.txt"):
                compilation_errors = os.path.join(path, name)
                with open(compilation_errors, 'r') as f:
                    lines = f.readlines()
                    for line in lines:
                        if line.startswith("[ERROR] "):
                            total_compilation_err+=1

            if name.endswith("pom.xml"):
                pom_path = os.path.join(path, name)
                target_dir = pom_path.replace("pom.xml",'/target/surefire-reports')

                for path_, subdirs_, files_ in os.walk(target_dir):
                    for name_ in files_:
                        if name_.endswith(".txt"):
                            test_class = os.path.join(path_, name_)
                            with open(test_class, 'r') as f:
                                lines = f.readlines()
                                for line in lines:
                                    found_count = re.search(test_regex,line)
                                    if found_count:
                                        total_false_positive_assertion+=int(re.findall('\d*\.?\d+',line)[1])

    fparate= round(((total_false_positive_assertion+total_compilation_err)/total_assertion_generated)*100)
    writer.writerow([subject,total_inputs,total_assertion_prefix,str(assertion_misclassification_rate)+"\%",str(empty_prediction_rate)+"\%",str(assertion_generation_rate)+"\%",str(fparate)+"\%",total_exception_prefix,str(EMCR)+"\% \\\\"])

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('-i', '--base_dir')
    args = parser.parse_args()

    if args.base_dir.endswith('/'):
        args.base_dir = args.base_dir[:-1]

    toga_summary = open(args.base_dir+"/results/rq2.csv", 'w')
    writer = csv.writer(toga_summary)
    writer.writerow(["Artifact", "Total_Test_Prefix", "Total_Assertion_Prefix", "misclassification for assertion prefix", "No Assertion", "Total Assertion Generated", "False Positive", "Total Exception Prefix", "Misclassification"])

    for subject_name in os.listdir(args.base_dir+"/evosuite-artifacts"):
            if os.path.isdir(os.path.join(args.base_dir+"/evosuite-artifacts",subject_name)):
                collect_toga_stats(os.path.join(args.base_dir+"/evosuite-artifacts", subject_name),subject_name,writer)

    toga_summary.close()

