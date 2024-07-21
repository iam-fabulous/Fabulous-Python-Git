def biggest_odd(number):
""" Takes astring of numbers and returns the biggest odd number in the list"""
	for count in number:
		number = int(count)
		result = number
		if number > result and number / 2 < 0 :
			result = number
	return result

big_odd = biggest_odd('234567')
print(big_odd)