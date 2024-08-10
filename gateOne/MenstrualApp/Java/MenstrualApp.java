import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MenstrualApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");

		System.out.println("*************************Welcome to Selfcare Health App!!!*************************");
		System.out.println("===================================================================================");
		System.out.println("What Calculation of your Cycle would you like to perform?");
		System.out.println("	1 - I don't know my Cycle!");
		System.out.println("	2 - My Ovulation Period");
		System.out.println("	3 - My Safe Period");
		System.out.println("	4 - My next Period");
		System.out.println("	5 - My Window Period");
		System.out.println("	0 - to exit app!");
		System.out.println("Press a number to perform Calculations");






		
					System.out.println("use this date (format: dd-mm-yyyy)");
					System.out.println("Enter Start-date of your period");
					String startDate = input.nextLine();
					String dateFormat1 ="MMM-dd-yyyy";
					LocalDate simpleFormat = periodDate.plusDays(menstrualCycle);
					String dateFormatted = simpleFormat.format(startDate);
					//System.out.println("Enter your menstrual cycle");
					//int menstrualCycle = input.nextInt();
					//LocalDate nextPeriod = periodDate.plusDays(menstrualCycle);
					System.out.println(dateFormatted);
					SimpleDateFormat simpleFormat = new SimpleDateFormat(dateFormat1);











		//System.out.println("Enter a date (format: yyyy-MM-dd):");




	}
}