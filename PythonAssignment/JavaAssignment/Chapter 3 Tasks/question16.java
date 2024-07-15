import java.util.Scanner;

public class question16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.MIN_VALUE;
        int secondNumber = Integer.MIN_VALUE;

        System.out.println("Enter 10 numbers:");

        for (int count = 0; count < 10; count++) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int number = scanner.nextInt();

            if (number > firstNumber) {
                secondNumber = firstNumber; 
                firstNumber = number; 
            } else if (number > secondNumber) {
                secondNumber = number; 
            }
        }

        System.out.println("The two largest numbers are: " + firstNumber + " and " + secondNumber);


    }
}