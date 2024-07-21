def only_floats(a, b):
	result = " "
	if(type(a)== float) and (type(b)== float):
		result = 2
	elif (type(a)== float) or (type(b)== float):
		result = 1
	else:
		result = 0
	return result

number = only_floats(1.8, 0.9)
print(number)