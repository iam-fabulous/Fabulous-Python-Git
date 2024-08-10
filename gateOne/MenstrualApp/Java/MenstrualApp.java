import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MenstrualApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("***************Welcome to Selfcare Health App!!!***************");
		System.out.println("===============================================================");
		System.out.println("What Calculation of your Cycle would you like to perform?");
		System.out.println("	1 - I don't know my Cycle!");
		System.out.println("	2 - My Ovulation Period");
		System.out.println("	3 - My Safe Period");
		System.out.println("	4 - My next Period");
		System.out.println("	5 - My Window Period");
		System.out.println("	0 - to exit app!");
		System.out.println("Press a number to perform Calculations");
		int check = 99;
		while(check != 0){
			check = input.nextInt();
			switch(check){
				case 1:
					
				break;
				case 2:
					System.out.println("	Use this date (format: dd-mm-yyyy)");
					System.out.println("Enter Start-date of your period");
					String startDate = input.next();
					
					System.out.println("Enter your menstrual cycle");
					int menstrualCycle = input.nextInt();

					LocalDate periodDate = LocalDate.parse(startDate, formatter);
					LocalDate nextPeriod = periodDate.plusDays(menstrualCycle);
					
					LocalDate ovulationPeriod1 = periodDate.plusDays(12);
					LocalDate ovulationPeriod2 = periodDate.plusDays(16);

					LocalDate firstFreePeriod1 = periodDate.plusDays(6);
					LocalDate firstFreePeriod2 = firstFreePeriod1.plusDays(4);
					System.out.println("Your next period is: " + nextPeriod);
					System.out.println("Your Ovulation period is btw: " + ovulationPeriod1 + "and" + ovulationPeriod2);
					System.out.println("Your First Free period is btw: " + firstFreePeriod1 + "and" + firstFreePeriod2);
					System.out.println("Press 1 to continue or 0 to exit.");
					check = input.nextInt();
			
				break;


				default:
			}





		}
		
		//System.out.println("Enter a date (format: yyyy-MM-dd):");




	}
}