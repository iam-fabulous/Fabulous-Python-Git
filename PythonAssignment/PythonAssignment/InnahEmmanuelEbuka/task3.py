#psuedo code for application to Convert pounds into kilograms!
#step1 - initialize pounds to be zero
#step2 - initialize kilograms to be zero
#step3 - initialize one_pound to be 0.454
#step4 - collect number from user in pounds
#step5 - to get the value for kilogram , = pounds x one_pound
#step6 - output the result, kilogram.

pound = 0
kilogram = 0
one_pound = 0.454
pound = int(input('Enter the number in pounds: '))
kilogram = pound * one_pound
print('The conversion of your input to kilograms is: ', kilogram,'kg')