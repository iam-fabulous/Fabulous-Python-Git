multiply = 0
for table in range(2, 14):
	for times in range(1, 13):
		multiply = table * times
		print(f"| {times:<2} * {table:<6} = {multiply:<5}", end='  ')
	print()
	