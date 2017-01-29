#!/bin/bash

#param 1 remote
#param 2 branch


git pull ${1-"origin"} ${2-master}