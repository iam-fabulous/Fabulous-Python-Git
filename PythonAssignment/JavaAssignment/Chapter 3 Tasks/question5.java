import java.util.Scanner;

public class question5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter First number: ");
        int number1 = scanner.nextInt();

        
        System.out.print("Enter Second number: ");
        int number2 = scanner.nextInt();

       
        if (number1 == number2) {
            System.out.println(number1 + " is equal to " + number2);
        } else {
            System.out.println(number1 + " is not equal to " + number2);
        }

               if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else {
            System.out.println(number1 + " is less than " + number2);
        }

               if (number1 >= number2) {
            System.out.println(number1 + " is greater than or equal to " + number2);
        } else {
            System.out.println(number1 + " is less than or equal to " + number2);
        }


    }
}