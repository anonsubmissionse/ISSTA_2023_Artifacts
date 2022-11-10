#!/bin/bash

base_dir=$PWD
subjects=()
for dir in "$base_dir"/*/; do subjects+=("$dir"); done

for subject in "${subjects[@]}"
do
  echo $subject
  cd $subject
  mvn kupusoglu.orhan:sloc-maven-plugin:sloc -Dsave=true
done