
from datetime import datetime, timedelta

OVULATION_PERIOD1 = timedelta(days=11)
OVULATION_PERIOD2 = timedelta(days=15)
FIRST_FREE_PERIOD1 = timedelta(days=6)
FIRST_FREE_PERIOD2 = timedelta(days=4)
SECOND_FREE_PERIOD1 = timedelta(days=16)
SECOND_FREE_PERIOD2 = timedelta(days=21)

check = 99
while check != 0:
	print('===============================================================')
	print('***************Welcome to Selfcare Health App!!!***************')
	print('===============================================================')
	print("Keep track of your cycle with ease!!!");
	print("	1 - I don't know my Cycle!");
	print("	2 - My Ovulation Period");
	print("	    My Safe Period");
	print("	    My next Period");
	print("	    My Window Period");
	print("	0 - to exit app!");
	print("Press a number to perform Calculations: ");
	check = int(input())
	match check:
		case 1:
			print("""
		How can I track my menstrual cycle?
	To find out what's typical for you, start keeping a record 
	of your menstrual cycle on a calendar. 

	Begin by tracking your start date every month for several 
	months in a row to identify the regularity of your periods.

	If you're worried about your periods, also track the following every month:

	* End date. How long does your period typically last? Is it 
	longer or shorter than usual?

	* Flow. Record the heaviness of your bleeding. Does it seem lighter
	or heavier than usual? How often do you need to change your tampon or pad? 
	Have you passed any blood clots?
	Bleeding changes. Are you bleeding in between periods?

	* Pain. Describe any pain you have with your period. Does the pain
	feel worse than usual? It is not unusual to have some cramping or 
	pain with your periods.

	* Other changes. Have you noticed any changes in your mood or behavior? 
	Did anything new happen around the time you noticed changes in your periods?
			""")

			print("Press 1 to continue or 0 to exit.")
			check = int(input())
		case 2:
			print('===============================================================')
			print('		Use this date (format: dd-mm-yyyy')
			print('===============================================================')
			print("Keep track of your cycle with ease!!!");
			
			start_date = (input("What is the start date of your period: "))
			start_date_formatted = datetime.strptime(start_date, '%d-%m-%Y')

			menstrual_cycle = int(input("What is your menstrual cycle: "))
			menstrual_cycle = timedelta(days=menstrual_cycle)
			
			next_period = start_date_formatted + menstrual_cycle
			ovulation_period1 = start_date_formatted + OVULATION_PERIOD1
			ovulation_period2 = start_date_formatted + OVULATION_PERIOD2

			first_free_period1 = start_date_formatted + FIRST_FREE_PERIOD1
			first_free_period2 = first_free_period1 + FIRST_FREE_PERIOD2

			second_free_period1 = start_date_formatted + SECOND_FREE_PERIOD1
			second_free_period2 = start_date_formatted + SECOND_FREE_PERIOD2

			print("===============================================================")
			print(next_period.strftime('%B %d, %Y'))
			print("Your Ovulation period is btw: " , ovulation_period1.strftime('%B %d, %Y') , " and "  ,ovulation_period2.strftime('%B %d, %Y'));
			print("Your First Safe period is btw: " , first_free_period1.strftime('%B %d, %Y') , " and "  ,first_free_period2.strftime('%B %d, %Y'));
			print("Your Second Safe period is btw: " , second_free_period1.strftime('%B %d, %Y'),  " and " , second_free_period2.strftime('%B %d, %Y'));
			print("===============================================================")
			print('Press 1 to continue or 0 to exit.: ')
			check = int(input())
		case _:
			print('Press 1 to continue or 0 to exit.: ')
			check = int(input())

