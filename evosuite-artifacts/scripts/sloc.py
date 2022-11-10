import os, re, sys
def count_test(path,subject):
    source_sloc=0
    test_sloc=0
    javadoc=0
    for path, subdirs, files in os.walk(path):
        for name in files:
            if name.endswith("pom.xml"):
                sloc = os.path.join(path, 'sloc.txt')
                try:
                    with open(sloc, 'r') as f:
                        lines = f.readlines()
                        for line in lines:
                            if "| test     |" in line:
                                test_sloc+=int(re.findall('\d*\.?\d+',line)[3])
                            if "| src      |" in line:
                                source_sloc+=int(re.findall('\d*\.?\d+',line)[3])
                                javadoc+=int(re.findall('\d*\.?\d+',line)[1])
                except:
                    print("")


    string = "{subject} , {source_sloc} , {javadoc} , {test_sloc}".format(subject = subject, source_sloc = source_sloc, javadoc=javadoc, test_sloc=test_sloc)
    print(string)

if __name__ == "__main__":
    count_test(sys.argv[1], sys.argv[2])


