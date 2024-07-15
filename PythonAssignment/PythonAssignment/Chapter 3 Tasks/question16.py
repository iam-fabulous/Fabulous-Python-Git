firstnumber = 0
secondnumber = 0

for count in range(10):
    number = int(input(f'Enter number {count + 1}: '))
    
    if number > firstnumber:
        secondnumber = firstnumber 
        firstnumber = number  
    elif number > secondnumber:
        secondnumber = number  
print('The two largest numbers are: ', firstnumber, ' and ', secondnumber)