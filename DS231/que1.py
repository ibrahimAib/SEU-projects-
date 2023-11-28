numbers =[int(input("1:> ")), 
          int(input("2:> ")),
          int(input("3:> ")),
          int(input("4:> ")),
          int(input("5:> "))] # get the numbers from user.
print("_____________________")
Sum = sum(numbers,0) #sum the numbers
average = sum(numbers)/len(numbers) # get the average by dividing the sum of the numbers by their number.
minimum = min(numbers) # get the minimum
maximum = max(numbers) # get the maximum

print(f"Your numbers: {numbers}\nSum: {Sum}\naverage: {average}\nminimum: {minimum}\nmaximum: {maximum}") # print all the results.

