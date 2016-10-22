#!/bin/sh
mkdir out >/dev/null 2>&1 
time javac src/main/java/com/example/*.java src/main/java/com/example/gen/*.java -d out
