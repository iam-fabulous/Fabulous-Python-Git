def equal_string(firststring, secondstring):
""" Takes two strings and compares if the strings are equal"""
	if len(set(firststring)) == len(set(secondstring)):
		return True
	else:
		return False

compare = equal_string('2468', '2468')
print(compare)