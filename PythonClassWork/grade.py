grade = int(input('Enter Score to get Grade: '))

if(grade >= 75 and grade <= 100):
	print('Student Grade is: A')
elif(grade > 64 and grade < 75):
	print('Student Grade is: B')
elif(grade > 54 and grade < 65):
	print('Student Grade is: C')
elif(grade > 44 and grade < 55):
	print('Student Grade is: D')
elif(grade > 34 and grade < 45):
	print('Student Grade is: E')
elif(grade >= 0 and grade <= 35):
	print('Student Grade is: F')
else:
	print('Invalid score')