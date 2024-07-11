import java.util.Scanner;
	public class bankTransaction{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
int deposit = 0;
int withdraw = 0;
int counter = 0;
int amount = 0;


System.out.println("Welcome to Fabulous Bank");
System.out.println("What transaction would you like to perform?");
System.out.println("Enter 1 to Deposit");
System.out.println("Enter 2 to Withdraw");
System.out.println("Enter 3 to Balance");
System.out.println("Enter 99 to Exit");
int transaction = input.nextInt();
while(transaction != 99){
	switch (transaction){
		case 1:
			System.out.print("Enter amount to deposit: ");
			deposit = input.nextInt();
			if(deposit < 0){
				System.out.print("Invalid deposit amount!");
				System.out.printf("Your account balance is: %d%n", amount);
				}
			else{
				amount += deposit;
				System.out.printf("Your account balance is: %d%n", amount);
			}
		break;
		case 2:
			System.out.print("Enter amount to withdraw: ");
			withdraw = input.nextInt();
			if(withdraw < 0){
				System.out.print("Invalid deposit amount!");
				System.out.printf("Your account balance is: %d%n", amount);
				}
			else{
				amount -= withdraw;
				System.out.printf("Your account balance is: %d%n", amount);
			}
		break;
		case 3:
			System.out.printf("Your account balance is: %d%n", amount);
		break;
		default:
			System.out.println("invalid input");
	}
	System.out.println("=======================");
	System.out.println("Enter 1 to Deposit");
	System.out.println("Enter 2 to Withdraw");
	System.out.println("Enter 3 to Balance");
	System.out.println("Enter 99 to Exit");
	transaction = input.nextInt();

counter++;
		}

	}
}