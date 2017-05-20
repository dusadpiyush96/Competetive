number_of_elements=int(raw_input())
arr=raw_input().split()
numbers=[int(x) for x in arr]
number_of_positive=0
number_of_negative=0
number_of_zeros=0
for x in numbers:
	if x<0:
		number_of_negative+=1
	elif x>0:
		number_of_positive+=1
	else:
		number_of_zeros+=1
print "%f" %(float(number_of_positive)/number_of_elements)
print "%f" %(float(number_of_negative)/number_of_elements)
print "%f" %(float(number_of_zeros)/number_of_elements)