text = input('inter your text:') # get the text from user.
characters = "1234567890~!@#$%^&*()_+=/':;}{[]}-?.,<>`" # the special character and digits to remove form text

print(f"your text befor: \n  {text}") #print the text with special character and digits.

i = 0 # for count the while loop.
while i < len(characters): 
    text = text.replace(characters[i],"") # go through the 
    i+=1
print(f"your text after:\n  {text}") # print the text with out special character and digits.