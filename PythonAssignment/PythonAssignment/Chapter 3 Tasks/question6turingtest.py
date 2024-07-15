response = input('What is your problem? \n')

response = input('Have you had this problem before? (yes or no) \n')

match response:
	case 'yes':
		print('Well, You have it again!')

	case 'no':
		print('Well, You have it now!')