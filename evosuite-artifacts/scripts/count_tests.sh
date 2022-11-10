#!/bin/bash

base_dir=$PWD
subjects=()
for dir in "$base_dir"/*/; do subjects+=("$dir"); done

for subject in "${subjects[@]}"
do
  echo $subject
  python $base_dir/scripts/test_count.py $subject "$(basename "${subject}")" >>table1_tests_count.txt
done