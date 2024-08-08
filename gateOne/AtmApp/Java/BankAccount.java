
public class BankAccount{
	private String name;
	private int accountNumber;
	private String pin;
	private double balance;

	public BankAccount(String name, String pin){
		this.name = name;
		this.pin = pin;
		this.balance = 0.0;
	}

	
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountNumber(){
		return accountNumber;
	}

	public void setPin(String pin){
		this.pin = pin;
	}

	public String getPin(){
		return pin;
	}

	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
			balance += depositAmount;
		}
	}

	public double getBalance(String pin){
		if(pin == this.pin)return balance; 
		return 0.0;
	}

	public double withdraw( double withdrawAmount){
		if(withdrawAmount < balance){
		balance -= withdrawAmount;
		}
	return balance;
	}

}