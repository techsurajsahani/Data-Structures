thisset = {"apple", "banana", "cherry"}

thisset.add("orange")

print(thisset)

thisset = {"apple", "banana", "cherry"}
tropical = {"pineapple", "mango", "papaya"}

thisset.update(tropical)

print(thisset)

thisset = {"apple", "banana", "cherry"}
mylist = ["kiwi", "orange"]
mytuple=("Suraj Sahani","Divya")
mydict={
    1:"Komal",
    2:"Sayali"
}

thisset.update(mylist)
thisset.update(mytuple)
thisset.update(mydict)

print(thisset)