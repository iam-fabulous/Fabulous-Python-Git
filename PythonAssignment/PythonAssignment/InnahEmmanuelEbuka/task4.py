#psuedo code to Computes gravity and total!
#step1 - initialize sub_total
#step2 - initialize gravity_rate
#step3 - initialize total
#step4 - initialize gravity
#step5 - collect value for sub_total from the user
#step6 - collect value for gravity_rate from the user
#step7 - to get gravity, = gravity_rate / sub_total 
#step8 - to get total, = sub_total + gravity
#step9 -  output the result for gratvity
#step10 - output the result for total

sub_total = 0
gravity_rate = 0
total = 0
gravity = 0

print('Application to compute the values for Total and Gravity')
sub_total = int(input('Enter value for sub_total: '))
gravity_rate = int(input('Enter value for gravity_rate: '))
gravity = gravity_rate / sub_total
total = sub_total + gravity
print('The result for Gravity is: ', gravity)
print('The result for Total is: ', total)