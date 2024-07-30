def reverse(number):
# Return the reversal of an integer
	number2 = str(number)
	length = len(number2)
	reverse = ' '
	remainder = 0
	temp = 0
	for count in range(length):
		temp = number % 10
		reverse += str(temp)
		remainder = number // 10
		temp = remainder % 10
		reverse += str(temp)

	return reverse

number = 456
reverse_num = reverse(number)
print(reverse_num)
