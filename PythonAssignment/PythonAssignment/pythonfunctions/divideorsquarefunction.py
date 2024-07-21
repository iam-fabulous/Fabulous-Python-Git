def divide_or_square(number):

	if number % 5 == 0:
		number **= 0.5
	else:
		number %= 5
	return number

number = divide_or_square(10)
print(number)