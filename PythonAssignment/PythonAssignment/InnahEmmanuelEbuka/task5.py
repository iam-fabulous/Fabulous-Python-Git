#Application that reads an integer and adds all the digits in the integer
#step1 - initialize number to be zero
#step2 - initialize sum to be zero
#step3 - initialize remainder to be zero
#step4 - collect number form user
#step5 - if number is not greaterthan zero or number is not lessthan 1000, print invalid input
#step6 - else, using a loop to start from 1 and stop at number(length)
#step7 - remainder = number modulo 10
#step8 - number = number divided by 10
#step9 - sum = sum + remainder
#step10 - output the result, sum

number = 0
remainder = 0
sum = 0
numbers = int(input('Enter a number between 0 - 1000: '))
if numbers > 0 and numbers < 1000:
	number = str(numbers)
	for count in number:
		remainder = numbers % 10
		numbers //= 10
		sum += remainder
	print('The sum of all digits is: ', sum)
else:
	print('invalid input!')
	