import pandas as pd
import os, re, csv, argparse, sys
import csv

total_failure=0

def collect_toga_stats(base_dir, subject,writer):
    global total_failure
    total_failure_in_subject=0

    fail_catch_re = re.compile(r"fail\(.*\).*}\s*catch", re.MULTILINE|re.DOTALL)
    oracle_preds = pd.read_csv(base_dir+"/toga_output/oracle_preds.csv")

    test_name=oracle_preds['test_name']
    test_prefix=oracle_preds['test_prefix']
    loc=oracle_preds['bug_num']
    assert_pred=oracle_preds['assert_pred']
    except_pred=oracle_preds['except_pred']


    total_assertTure=0
    total_assertFalse=0
    total_assertNotNull=0
    total_assertNull=0
    total_assertEquals=0
    total=0


    total_assertTrue_fp=0
    total_assertFalse_fp=0
    total_assertNotNull_fp=0
    total_assertNull_fp=0
    total_assertEquals_fp=0

    for test_name,test_prefix,loc,assert_pred,except_pred in zip(test_name,test_prefix,loc,assert_pred,except_pred):
            exception_prefix = re.search(fail_catch_re, test_prefix)
            if not exception_prefix:
                if  "assert" in str(assert_pred):
                    total+=1
                    if "assertTrue" in str(assert_pred):
                        total_assertTure=total_assertTure+1
                    if "assertFalse" in str(assert_pred):
                        total_assertFalse=total_assertFalse+1
                    if "assertNotNull" in str(assert_pred):
                        total_assertNotNull=total_assertNotNull+1
                    if "assertNull" in str(assert_pred):
                        total_assertNull=total_assertNull+1
                    if "assertEquals" in str(assert_pred):
                        total_assertEquals=total_assertEquals+1

    got_failure=False

    for path, subdirs, files in os.walk(base_dir):
        for name in files:
            if name.endswith("pom.xml"):
                pom_path = os.path.join(path, name)
                target_dir = pom_path.replace("pom.xml",'/target/surefire-reports')
                src_dir = pom_path.replace("pom.xml",'src/test/java/')

                for path_, subdirs_, files_ in os.walk(target_dir):
                    for name_ in files_:
                        if name_.endswith("_ESTest.txt"):
                            test_class = os.path.join(path_, name_)
                            with open(test_class, 'r') as f:
                                lines = f.readlines()
                                for line in lines:
                                    if "java.lang.AssertionError" in line and "Tests run:" not in line:
                                        got_failure=True
                                    if "_ESTest.test" in line and got_failure:
                                        test_file_location=line[line.index("at")+3:line.index("_ESTest.test")]
                                        test_file_location=src_dir+test_file_location.replace(".","/")+"_ESTest.java"
                                        test_name = line[line.index("_ESTest.test")+8:line.index("(")]
                                        got_failure=False
                                        total_failure+=1
                                        total_failure_in_subject+=1


                                        found=False
                                        assertfound=False
                                        with open(test_file_location, 'r') as tc:
                                            tc_lines = tc.readlines()
                                            for tc_line in tc_lines:
                                                if "public void "+test_name+"()" in tc_line:
                                                    found=True
                                                if found and "assertEquals" in tc_line:
                                                    total_assertEquals_fp+=1
                                                    assertfound=True
                                                    break
                                                if found and "assertTrue" in tc_line:
                                                    total_assertTrue_fp+=1
                                                    assertfound=True
                                                    break
                                                if found and "assertFalse" in tc_line:
                                                    total_assertFalse_fp+=1
                                                    assertfound=True
                                                    break
                                                if found and "assertNull" in tc_line:
                                                    total_assertNull_fp+=1
                                                    assertfound=True
                                                    break
                                                if found and "assertNotNull" in tc_line:
                                                    total_assertNotNull_fp+=1
                                                    assertfound=True
                                                    break
                                        if not assertfound:
                                            assert 1==2
                                        tc.close()
                            f.close()

    writer.writerow([subject,total_assertTure,total_assertFalse,total_assertNotNull,total_assertNull,total_assertEquals,total_failure_in_subject,total_assertEquals_fp,total_assertTrue_fp,total_assertFalse_fp,total_assertNull_fp,total_assertNotNull_fp])

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('-i', '--base_dir')
    args = parser.parse_args()

    if args.base_dir.endswith('/'):
        args.base_dir = args.base_dir[:-1]

    toga_summary = open(args.base_dir+"/results/type_wise_assertion.csv", 'w')
    writer = csv.writer(toga_summary)
    writer.writerow(["Artifact", "total_assertTure", "total_assertFalse", "total_assertNotNull", "total_assertNull", "total_assertEquals","total_failure_in_subject","total_assertEquals_fp","total_assertTrue_fp","total_assertFalse_fp","total_assertNull_fp","total_assertNotNull_fp"])
    total_false_postive=0
    for subject_name in os.listdir(args.base_dir+"/evosuite-artifacts"):
        if os.path.isdir(os.path.join(args.base_dir+"/evosuite-artifacts",subject_name)):
            collect_toga_stats(os.path.join(args.base_dir+"/evosuite-artifacts", subject_name),subject_name,writer)

    toga_summary.close()
    print(total_failure)
