import java.util.Random;
import java.util.ArrayList;
public class Bank{
	private String bankName;
	private ArrayList<BankAccount> accounts = new ArrayList<>();
	
	public Bank(String bankName){
		this.bankName = bankName;
	}

	public BankAccount createAccount(String name, String pin){
		BankAccount account  = new BankAccount(name,pin);
		int accountNumber = generateAccountNumber();
		account.setAccountNumber(accountNumber);
		accounts.add(account);
		System.out.println("=============================================");
		System.out.printf("%30s%n", "New Account Details!!!");
		System.out.println("=============================================");
		System.out.printf("%s%10s%n", "Account_name: ", account.getName());
		System.out.printf("%s%10s%n", "Account_number: ",account.getAccountNumber());
		System.out.printf("%s%10s%n%n","balance: ", account.getBalance());
		System.out.println("=============================================");
		System.out.printf("%10s%n", "your account has been created successfully!!!");
		System.out.printf("%10s%n", "Thanks for choosing Guarantee Trust Bank!");
		System.out.printf("%s%n%n", "=============================================");
		return account;
		
		
	}

	public void deposit(int accountNumber, double amount){
			if(amount < 0){
				System.out.println("Invalid Input");
			}
		for(BankAccount account: accounts){
			if(account.getAccountNumber() == accountNumber){
				account.deposit(amount);
			}
			else{
			System.out.println("invalid account number!");
			}
		}
	}

	public void withdraw(int accountNumber, double amount,String pin){
		for(BankAccount account: accounts){
			if(account.getAccountNumber() == accountNumber && account.getPin().equals(pin)) account.withdraw(amount);
		}
	}
		

	public double getBalance(int accountNumber){
		for(BankAccount account: accounts){
			if(account.getAccountNumber() == accountNumber){ 
				return account.getBalance();
			}
		}
	return 0.0;
	}
	
	public void transfer(int senderAccountNumber, int receiverAccountNumber, double amount, String pin){
		for(BankAccount account: accounts){
			if(account.getAccountNumber() == senderAccountNumber && account.getPin().equals(pin)) account.withdraw(amount);
			if(account.getAccountNumber() == receiverAccountNumber) account.deposit(amount);
		}		
	}
	private int generateAccountNumber(){
		Random generate = new Random();
		int accountNumber = generate.nextInt(1000000);
	return accountNumber;
	}

	public void changePin(int accountNumber, String oldPin, String newPin){
		for(BankAccount account: accounts){
			if(account.getAccountNumber() == accountNumber && account.getPin().equals(oldPin)) account.setPin(newPin);
		}
	}


}