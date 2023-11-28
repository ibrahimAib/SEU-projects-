import random as ran # importing the module.
characters = list('ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoPqrstuvwxyz123456789!@#$%^&*') # list of characters to choose from.
password = '' # variable to save the password in.
for i in range(18):
    password += ran.choice(characters) # it chooses a random character from our list "characters" and adds it to the "password" variable.

print(f"the generated password: {password}") # print the generated password















# characters = list('ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoPqrstuvwxyz123456789!@#$%^&*')
# passd1 = str(ran.choices(characters, k=18))
# passd2 = passd1.replace("'","")
# passd3 = passd2.replace(",","")
# passd4 = passd3.replace("[","")
# passd5 = passd4.replace("]","")
# password = passd5.replace(" ","")
# print("Generated password from my code:\n", password)

# print("")

