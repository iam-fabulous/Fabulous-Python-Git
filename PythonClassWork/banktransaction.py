deposit = 0
withdraw = 0
counter = 0
amount = 0


print('Welcome to Fabulous Bank')
print('What transaction would you like to perform?')
print('Enter 1 to Deposit')
print('Enter 2 to Withdraw')
print('Enter 3 to Balance')
print('Enter 99 to Exit')
transaction = int(input())
while transaction != 99:
	match transaction:
		case 1:
			deposit = int(input('Enter amount to deposit: '))
			if deposit < 0:
				print('Invalid Deposit Amount!')
				print('Your account balance is: ', amount)
			else:
				amount += deposit
				print('Your account balance is: ', amount)
		case 2:
			withdraw = int(input('Enter amount to withdraw: '))
			if withdraw < 0:
				print('Invalid Withdraw Amount!')
				print('Your account balance is: ', amount)
			else:
				amount -= withdraw
				print('Your account balance is: ', amount)
		case 3:
			print('Your account balance is: ', amount)
		case _:
			print('invalid input')
	print('=======================')
	print('Enter 1 to Deposit')
	print('Enter 2 to Withdraw')
	print('Enter 3 to Balance')
	print('Enter 99 to Exit')
	transaction = int(input())
counter+=1