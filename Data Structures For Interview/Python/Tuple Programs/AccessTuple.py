mytuple=(1,2,3,4,5,6,7,8,9,10)
print(mytuple[2])
print(mytuple[-1])
print(mytuple[2:5])
print(mytuple[:5])
print(mytuple[2:])
print(mytuple[-4:-1])

if 11 not in mytuple:
    mytuple.append(11)

print(mytuple)