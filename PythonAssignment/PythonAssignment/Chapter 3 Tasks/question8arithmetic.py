sum = 0
average = 0
product = 1
print('Program to claculate sum, average, product, smallest and largest between four numbers!')


for count in range(4):
	number = int(input('Enter number: '))

	smallest = number
	largest = number
	sum += number
	product *= number
	if number >= largest:
		largest = number
	elif number <= smallest:
		smallest = number
	


average = sum / 4
print('The Sum of the numbers is: ', sum)
print('The Average of the numbers is: ', average)
print('The Product of the numbers is: ', product)
print('The Smallest of the numbers is: ', smallest)
print('The Largest of the numbers is: ', largest)