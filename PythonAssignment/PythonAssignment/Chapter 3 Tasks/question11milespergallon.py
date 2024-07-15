milesdriven = 0
totalmilesdriven = 0
gallonsused = 0
totalgallonsused = 0
overallmilespergallon = 0
tankmilespergallon = 0
tempvalue = 0

gallonsused = float(input("Enter the gallons used (-1 to end): "))

while gallonsused != -1:
	
	milesdriven = int(input('Enters the miles driven: '))
	tempvalue = print('The miles/gallon for this tank was: ', milesdriven/gallonsused)
	totalmilesdriven += milesdriven
	totalgallonsused += gallonsused

	gallonsused = float(input("Enter the gallons used (-1 to end): "))

overallmilespergallon = totalmilesdriven / totalgallonsused

print('The overall average miles/gallon was: ', overallmilespergallon)