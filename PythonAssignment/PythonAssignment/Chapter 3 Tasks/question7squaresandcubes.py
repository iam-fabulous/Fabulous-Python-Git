
print('numbers' "\t" 'squares' "\t" '  cubes')

for row in range(6):
	print(f'{row:>7d}', end=' ')
	
	for column in range(1):
		column = row
		column **= 3
		row **= 2
		print(f'{row:>7d}', end=' ')
		print(f'{column:>7d}', end=' ')
			
	print()
		