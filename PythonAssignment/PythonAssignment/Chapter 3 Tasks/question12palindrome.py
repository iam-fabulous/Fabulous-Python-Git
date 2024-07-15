number = int(input('Enter a five digit number: '))

if number <=9999 or number > 99999:
	print('invalid input')
	number = int(input('Enter a five digit number: '))

firstnumber = number // 10000
secondnumber = (number // 1000) % 10
thirdnumber = (number // 100) % 10
fourthnumber = (number // 10) % 10
fifthnumber = number % 10

if firstnumber == fifthnumber and secondnumber == fourthnumber:
	print('The Number ', number, 'is a Palindrome')
else:
	print('The Number ', number, 'is not a Palindrome')