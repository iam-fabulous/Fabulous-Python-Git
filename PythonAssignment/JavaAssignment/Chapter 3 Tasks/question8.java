import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int product = 1;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.println("Program to calculate sum, average, product, smallest, and largest between four numbers!");

        for (int count = 0; count < 4; count++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            
            sum += number;
            
            product *= number;

            
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

                average = (double) sum / 4;

        
        System.out.println("The Sum of the numbers is: " + sum);
        System.out.println("The Average of the numbers is: " + average);
        System.out.println("The Product of the numbers is: " + product);
        System.out.println("The Smallest of the numbers is: " + smallest);
        System.out.println("The Largest of the numbers is: " + largest);


    }
}