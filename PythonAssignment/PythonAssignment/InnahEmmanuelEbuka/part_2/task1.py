#A program to check the number of letters and digits in a user_input

letter = 0
digits = 0
user_input = input("Enter a combination of letters and numbers: ")
#length = len(user_input)
for count in user_input:
	if count == str(count):
		letter += 1
	elif count == int(count):
		digits += 1
print("LETTERS are : ", letter, "DIGITS are: ", digits)