percentage = 0.07
tempvalue = 0
investentprofit = 0


print('Program to calculate annual investment return!!!\nAnnual Investment Return is: 7%')
deposit = int(input('Enter Deposit Amount: '))
numberofyears = int(input('Enter number of years for investment return: '))

tempvalue = (1 + percentage) ** numberofyears

investmentprofit = deposit * tempvalue

print('Your investment Return for', numberofyears,'years is: ', investmentprofit)