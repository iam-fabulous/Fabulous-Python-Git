import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Application to check if a card is VALID or INVALID..!!!");
      
        boolean Flag=false;
	String cardNumber;
	String cardLength = " ";
	String cardType = " ";
	System.out.print("Enter card number: ");
	cardNumber = input.nextLine();

		while(!Flag){

			if(cardNumber.length() > 12 && cardNumber.length() < 17){
                                Flag=true;
			}
            		else{
				System.out.println("Invalid Card Input! must be between 13 and 16 digits!");
				System.out.print("Enter a valid card number: ");
            			cardNumber = input.nextLine();
            		}
			
		}
	}
}