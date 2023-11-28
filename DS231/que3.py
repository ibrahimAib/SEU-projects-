# get the text from user.
text = input('inter your text:')

# the special character and digits to remove form text
characters = "1234567890~!@#$%^&*()_+=/':;}{[]}-?.,<>`" 

#print the text with special character and digits.
print(f"your text befor: \n  {text}") 

# for counting the while loop.
i = 0 

""" The "replace()" method checks if the first parameter exists in the text, and if it does it will replace it with the second parameter.
so, in our case every "while loop cycle" will check and replace the Forbidden character by its index."""
while i < len(characters): 
    text = text.replace(characters[i],"") 
    i+=1

# print the text without special character and digits.
print(f"your text after:\n  {text}") 

