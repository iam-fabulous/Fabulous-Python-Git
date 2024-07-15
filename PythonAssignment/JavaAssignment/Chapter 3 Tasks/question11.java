import java.util.Scanner;

public class question11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double milesDriven = 0;
        double totalMilesDriven = 0;
        double gallonsUsed = 0;
        double totalGallonsUsed = 0;
        double overallMilesPerGallon = 0;
        double tankMilesPerGallon = 0;

        System.out.println("Program to calculate miles per gallon for each tank!");
        
        System.out.print("Enter the gallons used (-1 to end): ");
        gallonsUsed = scanner.nextDouble();

        while (gallonsUsed != -1) {
            System.out.print("Enter the miles driven: ");
            milesDriven = scanner.nextDouble();

            tankMilesPerGallon = milesDriven / gallonsUsed;
            System.out.println("The miles/gallon for this tank was: " + tankMilesPerGallon);

            totalMilesDriven += milesDriven;
            totalGallonsUsed += gallonsUsed;

            System.out.print("Enter the gallons used (-1 to end): ");
            gallonsUsed = scanner.nextDouble();
        }

        if (totalGallonsUsed > 0) {
            overallMilesPerGallon = totalMilesDriven / totalGallonsUsed;
            System.out.println("The overall average miles/gallon was: " + overallMilesPerGallon);
        } else {
            System.out.println("No valid data entered.");
        }

     
    }
}