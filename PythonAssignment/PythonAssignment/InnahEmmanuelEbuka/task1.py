#psuedo code for application to calculaute the Area and Volume of a Cylinder
#step1 - initialize radius
#step2 - initialize length
#step3 - intitialize area
#step4 - initialize volume
#step5 - collect value for radius from user
#step6 - collect value for length from user
#step7 - to get the result of area = 3.142 x (radius)^2
#step8 - to get the value of volume = area x length
#step9 - output the result of area and the result of volume


radius = 0
length = 0
area = 0
volume = 0

radius = float(input('Enter the value for radius: '))
length = float(input('Enter the value for length: '))

area = 3.142 * (radius ** 2)
volume = area * length

print('The value for Area is: ', area)
print('The value for Volume is: ', volume)