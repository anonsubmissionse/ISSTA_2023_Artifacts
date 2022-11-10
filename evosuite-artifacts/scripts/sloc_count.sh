#!/bin/bash

base_dir=$PWD
subjects=()
for dir in "$base_dir"/*/; do subjects+=("$dir"); done

for subject in "${subjects[@]}"
do
  echo $subject
  python $base_dir/scripts/sloc.py $subject "$(basename "${subject}")" >>table1_sloc_count.txt
done