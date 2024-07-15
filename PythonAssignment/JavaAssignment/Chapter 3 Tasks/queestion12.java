import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int number = scanner.nextInt();

        
        if (number <= 9999 || number > 99999) {
            System.out.println("Invalid input");
            System.out.print("Enter a five digit number: ");
            number = scanner.nextInt();
        }

        int firstNumber = number / 10000;
        int secondNumber = (number / 1000) % 10;
        int thirdNumber = (number / 100) % 10;
        int fourthNumber = (number / 10) % 10;
        int fifthNumber = number % 10;

        if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
            System.out.println("The Number " + number + " is a Palindrome");
        } else {
            System.out.println("The Number " + number + " is not a Palindrome");
        }

        scanner.close();
    }
}