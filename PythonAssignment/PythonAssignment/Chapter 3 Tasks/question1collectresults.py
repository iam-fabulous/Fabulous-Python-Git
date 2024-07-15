result = 0
passes = 0
fails = 0

print('Application to collect results of students!')
result = int(input(' Enter "1" for Pass! \n Enter "2" for Fail! \n Enter "-99" to Exit! \n Enter Result: '))
while result != -99:
	if result == 1:
		passes += 1
	elif result == 2:
		fails += 1
	else:
		print("Invalid input!!!")
	result = int(input(' Enter "-99" to exit! \n Enter Result: '))
print('Number of Results Passed is: ', passes)
print('Number of Results Failed is: ', fails)

if passes > 8:
	print('Bonus to Instructor!!!')