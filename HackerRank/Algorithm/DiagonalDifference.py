#!/bin/python

import sys


n = int(raw_input().strip())
a = []
for a_i in xrange(n):
    a_temp = map(int,raw_input().strip().split(' '))
    a.append(a_temp)
sum_of_primary_diagonal=0
sum_of_secondary_diagonal=0
j=0
for x in a:
    sum_of_primary_diagonal+=x[j]
    j+=1
k=n
for y in a:
    sum_of_secondary_diagonal+=y[k-1]
    k-=1
print abs(sum_of_primary_diagonal-sum_of_secondary_diagonal)
    
