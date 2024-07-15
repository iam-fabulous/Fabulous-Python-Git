import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double percentage = 0.07; 
        double tempValue = 0;
        double investmentProfit = 0;

        System.out.println("Program to calculate annual investment return!!!");
        System.out.println("Annual Investment Return is: 7%");

        System.out.print("Enter Deposit Amount: ");
        double deposit = scanner.nextDouble();

        System.out.print("Enter number of years for investment return: ");
        int numberOfYears = scanner.nextInt();

        tempValue = Math.pow((1 + percentage), numberOfYears);
        investmentProfit = deposit * tempValue;

        System.out.println("Your investment Return for " + numberOfYears + " years is: " + investmentProfit);

        
    }
}