a0,a1,a2 = raw_input().split(' ')
alice_marks = [int(a0),int(a1),int(a2)]
b0,b1,b2 = raw_input().split(' ')
bob_marks = [int(b0),int(b1),int(b2)]
#print bob_marks
a=0
b=0
for x in range(0,3):
    if alice_marks[x]>bob_marks[x]:
        a+=1
    elif alice_marks[x]<bob_marks[x]:
        b+=1
    else:
        continue
print a,b
    
        
