import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random randInt = new Random();
		int randomnumber = randInt.nextInt(1, 1000);
	
int number = 0;
String playAgain = " ";
System.out.println("A random number is generated!");
System.out.println("You have five Trials!!!");

while(!playAgain.equals("no")){

	for(int counter = 1; counter <= 5; counter++){
		
		System.out.println("Guess the number: ");
		number = input.nextInt();
		if (number > randomnumber)
			System.out.println("Too High. Try Again");
		if (number < randomnumber)
			System.out.println("Too Low. Try Again");
		if (number == randomnumber){
			System.out.println("Congratulations. You Guessed The Number!");
			break;
			}
		counter += 1;

		}
	System.out.println("Do you want to keep playing?(Enter yes or no): ") ;
	playAgain = input.next();
	}



	}
}