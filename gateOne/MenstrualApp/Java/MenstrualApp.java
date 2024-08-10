import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MenstrualApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		int check = 99;
		while(check != 0){
		System.out.println("===============================================================");
		System.out.println("***************Welcome to Selfcare Health App!!!***************");
		System.out.println("===============================================================");
		System.out.println("Keep track of your cycle with ease!!!");
		System.out.println("	1 - I don't know my Cycle!");
		System.out.println("	2 - My Ovulation Period");
		System.out.println("	    My Safe Period");
		System.out.println("	    My next Period");
		System.out.println("	    My Window Period");
		System.out.println("	0 - to exit app!");
		System.out.println("Press a number to perform Calculations: ");
			check = input.nextInt();
			switch(check){
				case 1:
					System.out.println("""
										How can I track my menstrual cycle?
									To find out what's typical for you, start keeping a record 
									of your menstrual cycle on a calendar. 

									Begin by tracking your start date every month for several 
									months in a row to identify the regularity of your periods.

									If you're worried about your periods, also track the following every month:

									* End date. How long does your period typically last? Is it 
									longer or shorter than usual?

									* Flow. Record the heaviness of your bleeding. Does it seem lighter
									or heavier than usual? How often do you need to change your tampon or pad? 
									Have you passed any blood clots?
									Bleeding changes. Are you bleeding in between periods?

									* Pain. Describe any pain you have with your period. Does the pain
									feel worse than usual? It is not unusual to have some cramping or 
									pain with your periods.

									* Other changes. Have you noticed any changes in your mood or behavior? 
									Did anything new happen around the time you noticed changes in your periods?

							""");
					System.out.print("Press 1 to continue or 0 to exit.");
					check = input.nextInt();
				break;
				case 2:
					System.out.println("===============================================================");
					System.out.println("		Use this date (format: dd-mm-yyyy)");
					System.out.println("===============================================================");
					System.out.print("Enter Start-date of your period: ");
					String startDate = input.next();
					
					System.out.print("Enter your menstrual cycle: ");
					int menstrualCycle = input.nextInt();

					LocalDate periodDate = LocalDate.parse(startDate, formatter);
					LocalDate nextPeriod = periodDate.plusDays(menstrualCycle);
					
					LocalDate ovulationPeriod1 = periodDate.plusDays(11);
					LocalDate ovulationPeriod2 = periodDate.plusDays(15);

					LocalDate firstFreePeriod1 = periodDate.plusDays(6);
					LocalDate firstFreePeriod2 = firstFreePeriod1.plusDays(4);

					LocalDate secondFreePeriod1 = periodDate.plusDays(16);
					LocalDate secondFreePeriod2 = firstFreePeriod1.plusDays(21);
					System.out.println("===============================================================");
					System.out.println("Your next period is: " + nextPeriod);
					System.out.println("Your Ovulation period is btw: " + ovulationPeriod1 + " and " + ovulationPeriod2);
					System.out.println("Your First Safe period is btw: " + firstFreePeriod1 + " and " + firstFreePeriod2);
					System.out.println("Your Second Safe period is btw: " + secondFreePeriod1 + " and " + secondFreePeriod2);
					System.out.println("===============================================================");
					System.out.print("Press 1 to continue or 0 to exit.: ");
					check = input.nextInt();
			
				break;


				default:
			}





		}
		
		




	}
}