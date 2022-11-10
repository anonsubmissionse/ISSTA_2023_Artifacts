import os, re, sys
def count_test(path,subject):
    total_passed_tests=0
    total_failed_tests=0
    total_skipped_tests=0
    test_regex=re.compile(r"Tests run:.*Failures.*Errors.*Skipped.*", re.MULTILINE|re.DOTALL)

    for path, subdirs, files in os.walk(path):

        for name in files:

            if name.endswith("pom.xml"):
                target_dir = path+'/target/surefire-reports'
                for path_, subdirs_, files_ in os.walk(target_dir):
                    for name_ in files_:
                        if name_.endswith(".txt"):
                            test_class = os.path.join(path_, name_)

                            with open(test_class, 'r') as f:
                                lines = f.readlines()
                                for line in lines:
                                    found_count = re.search(test_regex,line)
                                    if found_count:
                                        total_passed_tests+=int(re.findall('\d*\.?\d+',line)[0])
                                        total_failed_tests+=int(re.findall('\d*\.?\d+',line)[1])
                                        total_skipped_tests+=int(re.findall('\d*\.?\d+',line)[2])


    string=subject,"&",total_passed_tests,"&",total_failed_tests,"&",total_skipped_tests
    print(string)

if __name__ == "__main__":
    count_test(sys.argv[1], sys.argv[2])


