for row in range(10):
	for column in range(10):
		print('<' if row % 2 == 1 else '>', end='')
print()

#When row is an even number it prints '>' 10 times
#When row is an odd number it prints '<' 10 times
#end='' makes the column to print on the same line.
#the print() is not indented, :: it does'nt have an efect in the code
#if indented then after column is done it moves to the next line!