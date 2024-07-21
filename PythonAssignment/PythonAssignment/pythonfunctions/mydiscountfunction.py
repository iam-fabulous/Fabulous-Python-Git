def my_discount(price, discount):
"""Calculate and display discounted price"""
	discount /= 100
	result= price * discount
	price -= result
	return price


discount = my_discount(150, 15)
print(discount)