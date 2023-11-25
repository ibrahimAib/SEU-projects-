# import math
# print("Enter 5 number:")

# # arrays = {int(input("nuber 1:")),int(input("nuber 2:"))}



# # sum_var = sum(arrays, 0)
# # print("sum of nuber is :",(sum_var))

# nubers = [9, 9, 3, 5,  2]
# numbers_average = sum(nubers)/len(nubers)
# print(min(3,8))
# print(max(3,8))
# print(len(nubers))
# print(numbers_average)
text1 = input('inter your text:')
text = text1
print(type(text))
characters = "1234567890~!@#$%^&*()_+=/':;}{[]}-?.,<>`"

i = 0
while i < len(characters):
    text = text.replace(characters[i],"")
    i+=1
print(text)