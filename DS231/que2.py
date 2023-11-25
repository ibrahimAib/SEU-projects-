import random as ran # importing the module
characters = list('ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoPqrstuvwxyz123456789!@#$%^&*') # list of characters to choose from.
password = '' # variable to save the password
for i in range(18): # for loop to loop 18 times to choose 18 character
    password += ran.choice(characters) # choose a random character from our list "characters" and add it to "password" variable.

print(password) # print the generated password















# characters = list('ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoPqrstuvwxyz123456789!@#$%^&*')
# passd1 = str(ran.choices(characters, k=18))
# passd2 = passd1.replace("'","")
# passd3 = passd2.replace(",","")
# passd4 = passd3.replace("[","")
# passd5 = passd4.replace("]","")
# password = passd5.replace(" ","")
# print("Generated password from my code:\n", password)

# print("")

