#Application to convert minutes to years and days
#step1 - initialize years to be zero
#step2 - initialize days to be zero
#step3 - initialize minutes to be zero
#step4 - collect value for minutes from user
#Step4 - years = minutes x 0.0000019013
#step5 - days = minutes / 1440
#step6 - output result, days and years

years = 0
days = 0
minutes = 0

minutes = int(input('Enter number of minutes to be convertd to minutes and days'))
years = minutes * 0.0000019013
days = minutes / 1440

print(years,'years and ', days, 'days')