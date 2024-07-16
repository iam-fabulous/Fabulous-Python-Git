from random import randint

counter = 0
random_number = randint(1,1000)
print(random_number)

print('A random number is generated!')
print('You have five Trials!!!')
flag = "yes"
while flag in ["yes"] :

	for number1 in range(5) :
		number = int(input("Guess the number: "))
		if number > random_number:
			print("Too High. Try Again")
		if number < random_number:
			print("Too Low. Try Again")
		if number == random_number:
			print("Congratulations. You Guessed The Number!")

		if counter > 10:
			print("You're Resilient. Well-Done!!!",counter)

		if number1 == 4:
			print("Unfortunately! You've Exhausted your trials!!!")	
		counter += 1
	
			
	flag= input('Do you want to keep playing?(Enter yes or no): ') 

	