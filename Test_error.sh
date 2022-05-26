#!/bin/bash

if diff cat<./cat  cat <cat.c
then
echo "test Success"
else
echo "test Failed"
fi

if diff cat > test 2>&1 cat 0>test 2>&1 
then
echo "Test error Succes"
else
echo "Test error Failed"
fi

