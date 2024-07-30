#A program that recieves two integral numbers in string form, computes the sum and returns the result in a string.

def sum_string(first_number, second_number):

	sum = 0

	first_number = int(first_number)
	second_number = int(second_number)

	if first_number < 0 and second_number < 0:
		return('both numbers are not integral numbers')
	elif first_number < 0 and second_number > 0:
		return('first number is not an integral number')
	elif first_number > 0 and second_number < 0:
		return('second number is not an integral number')
	else:
		sum = first_number + second_number
	sum = str(sum)
	return sum


number1 = '24'
number2 = '12'
sum = sum_string(number1, number2)
print(sum)