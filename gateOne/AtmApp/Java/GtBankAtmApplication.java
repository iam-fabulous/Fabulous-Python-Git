import java.util.Random;
import java.util.Scanner;
public class GtBankAtmApplication{
	public static void main(String[] args) {
		newMain();

	}



	public static void newMain(){
	Bank bank = new Bank("GTBank");
	Scanner input = new Scanner(System.in);

	System.out.println("Welcome to Guarantee Trust Bank!!!");
	System.out.println("What transaction would you like to perform?");
	System.out.println("Enter 1 to Create Account");
	System.out.println("Enter 2 to Deposit Money");
	System.out.println("Enter 3 to Withdraw Money");
	System.out.println("Enter 4 to Check Account Balance");
	System.out.println("Enter 5 to Transfer Money");
	System.out.println("Enter 6 to Change Pin");
	System.out.println("Enter 99 to Cancel");
	boolean Flag = false;
	String pin = " ";
	String deposit = " ";
	int transaction = input.nextInt();
	while(transaction != 99){
		switch(transaction){
			case 1: 
				System.out.print("Enter your First_name:  ");
				String firstName = input.next();
				System.out.print("Enter your Last_name:  ");
				String lastName = input.next();
				System.out.print("Create a Pin(Enter a four digit Pin:  ");
				pin = input.next();
				while(!Flag){//second while_loop
					if(pin.length() == 4){
						
                               			Flag=true;
						bank.createAccount(firstName +" "+ lastName, pin);
						System.out.println("Would you like to make a deposit");
						System.out.println("Press 1 to deposit.");
						System.out.println("Press 0 to goto Main_menu.");
						deposit = input.next();
						switch(deposit){
							case "0":
								newMain();
								break;
							case "1":
								System.out.println("======================================");
								System.out.print("Enter Account number: ");
								int acctNumber = input.nextInt();
								System.out.print("Enter Deposit amount: ");
								double amount = input.nextInt();
								bank.deposit(acctNumber, amount);
								System.out.println("======================================");
								System.out.println("Amount deposited successfully!!!");
								System.out.println("======================================");
								newMain();
								break;
							default:
								newMain();
						}//close deposit switch						
			
					}//close the pin if statement
            				else{
						System.out.println("Invalid Input! must be four digits only!!!");
						System.out.print("Enter a four digit Pin:  ");
            					
            				}//close the pin else
				pin = input.next();
				}//second while_loop
			break;
			case 2:
				System.out.println("======================================");
				System.out.print("Enter Account number: ");
				int acctNumberDeposit = input.nextInt();
				System.out.print("Enter Deposit amount: ");
				double amountDeposit = input.nextInt();
				bank.deposit(acctNumberDeposit, amountDeposit);
				System.out.println("======================================");
				System.out.println("Amount deposited successfully!!!");
				System.out.println("======================================");
				newMain();
			break;
			case 3:
				System.out.println("======================================");
				System.out.print("Enter Account number: ");
				int acctNumberWithdraw = input.nextInt();
				System.out.print("Enter amount to withdraw: ");
				double amountWithdraw = input.nextInt();
				System.out.print("Enter your pin: ");
				String withdrawPin = input.next();
				bank.withdraw(acctNumberWithdraw, amountWithdraw, withdrawPin);
				System.out.println("======================================");
				System.out.printf("$%5.2f%s%n", amountWithdraw, " withdrawn successfully!!!");
				System.out.println("======================================");
				newMain();

			break;
			case 4:
				System.out.println("======================================");
				System.out.print("Enter Account number: ");
				int acctNumberBalance = input.nextInt();
				System.out.print("Enter your pin: ");
				String withdrawPinBalance = input.next();
				double balance = bank.getBalance(acctNumberBalance, withdrawPinBalance);
				System.out.println("======================================");
				System.out.printf("%s$%5.2f%n", "your balance is: ", balance);
				System.out.println("======================================");
				newMain();

			break;
			case 5:
				System.out.println("======================================");
				System.out.print("Enter Sender_Account number: ");
				int senderAcctNumber = input.nextInt();
				System.out.print("Enter Receiver_Account number: ");
				int receiverAcctNumber = input.nextInt();
				System.out.print("Enter Amount to transfer: ");
				int transferAmount = input.nextInt();
				System.out.print("Enter your pin: ");
				String transferPin = input.next();
				bank.transfer(senderAcctNumber, receiverAcctNumber,transferAmount, transferPin);
				System.out.println("======================================");
				System.out.printf("#%5.2f%s%n",transferAmount, "transfered Successfully!!! ");
				System.out.println("======================================");
				newMain();
			break;
			case 6:
				System.out.println("======================================");
				System.out.print("Enter Account number: ");
				int accountNumber = input.nextInt();
				System.out.print("Enter Old Pin: ");
				String oldPin = input.next();
				System.out.print("Enter New Pin: ");
				String newPin = input.next();
				bank.changePin(accountNumber, oldPin, newPin);
				System.out.println("======================================");
				System.out.printf("%s#%5.2f%n", "Pin Successfully changed to: ", newPin);
				System.out.println("======================================");
				newMain();

			break;
			case 99:
				System.out.print("Are you sure want to Exit?...Enter 1 for 'yes' or 2 for 'no'");
				String check = input.next();
					if(check == "1")transaction = 99;
					else newMain();
				
			default:
				newMain();
	


			}//switch_case

		}//Main While




	}


}
