number_of_stairs=int(raw_input())
y=1
for x in range(number_of_stairs):
	if y!=number_of_stairs:
            print " "*(number_of_stairs-y-1),
	print "#"*(y)
	y+=1
    
