#psuedo code for application to Convert Feet to Meters!
#step1 - initialize feet to be zero
#step2 - initialize meters to be zero
#step3 - initialize one_foot to be 0.305
#step4 - collect number from user in feets
#step5 - to get the value for meters , = feet x one_foot
#step6 - output the result, meter.

feet = 0
meter = 0
one_foot = 0.305
feet = int(input('Enter the number in feets: '))
meter = feet * one_foot
print('The conversion of your input to meters is: ', meter)