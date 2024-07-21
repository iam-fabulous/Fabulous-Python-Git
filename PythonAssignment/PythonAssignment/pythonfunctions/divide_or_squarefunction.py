def divide_or_square(number):
"""returns the square root of the number if it is divisible by 5, returns its remainder if it is not divisible by 5"""
	if number % 5 == 0:
		number **= 0.5
	else:
		number %= 5
	return number

number = divide_or_square(7)
print(number)