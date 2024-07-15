import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int passes = 0;
        int fails = 0;

        System.out.println("Application to collect results of students!");
        System.out.println("Enter '1' for Pass!");
        System.out.println("Enter '2' for Fail!");
        System.out.println("Enter '-99' to Exit!");
        System.out.print("Enter Result: ");
        result = scanner.nextInt();

        while (result != -99) {
            if (result == 1) {
                passes++;
            } else if (result == 2) {
                fails++;
            } else {
                System.out.println("Invalid input!!!");
            }
            System.out.print("Enter '-99' to exit!\nEnter Result: ");
            result = scanner.nextInt();
        }

        System.out.println("Number of Results Passed is: " + passes);
        System.out.println("Number of Results Failed is: " + fails);

        if (passes > 8) {
            System.out.println("Bonus to Instructor!!!");
        }


    }
}