def check_number_type(number):

#function that can accept an integer 
#number as input and display "It is an even
#number" if the number is even, or "It is an odd
#number" if it is an odd number.
	if number % 2 == 0:
		return "it is an even number"
	else:
		return "it is an odd number"

number = 123
number_type = check_number_type(number)
print(number_type)