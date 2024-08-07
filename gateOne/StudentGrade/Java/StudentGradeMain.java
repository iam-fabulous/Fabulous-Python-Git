import java.util.Scanner;
import java.util.Arrays;
public class StudentGradeMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		StudentGradeFunction grade = new StudentGradeFunction();
	int[][] studentGrade;
	

	System.out.println("WELCOME TO LAGBAJA SCHOOL STUDENT GRADE CALCULATOR!!!");
	System.out.println("How many students do you have?");
	int numberOfStudents = input.nextInt();
	System.out.println("How many subjects do they offer?");
	int numberOfSubjects = input.nextInt();
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Successfully!");
	studentGrade = new int[numberOfStudents][numberOfSubjects];
	int rowCount = 1;
	for(int row = 0; row < studentGrade.length; ++row){
		int columnCount = 1;
		for(int column = 0; column < studentGrade[row].length; ++column){
		System.out.println("Entering score for student "+ rowCount);
		System.out.println("Enter score for subject "+ columnCount);
		studentGrade[row][column] = input.nextInt();
		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved Successfully!");
		columnCount++;
		}
	rowCount++;
	}
	
			
	double[] total = grade.getTotal(studentGrade);
	System.out.println(Arrays.toString(total));
	double[] average = grade.getAverage(studentGrade);
	System.out.println(Arrays.toString(average));
	int[] position = grade.getPosition(total);
	System.out.println(Arrays.toString(position));

			for(int row = 0; row < 1; row++){
				for(int column = 0; column < studentGrade[row].length; column++)
				System.out.printf("%s","====================");
				
			}
			System.out.println();

			System.out.print("STUDENT");
			
			for(int row = 0; row < 1; row++){
			int tableCount = 1;
				for(int column = 0; column < studentGrade[row].length; column++){
					System.out.printf("%10s%d","SUB",tableCount);
					
				tableCount++;
				}
			
			}

			System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");

			for(int row = 0; row < 1; row++){
				for(int column = 0; column < studentGrade[row].length; column++)
				System.out.printf("%s","====================");
				
			}
			System.out.println();

		
			int rowCount2 = 1;
			for(int row = 0; row < studentGrade.length; row++){
			System.out.printf("Student %d",rowCount2);
				int averageCount = 0;
				//int total = 0;
				for(int column = 0; column < studentGrade[row].length; column++){
					//total += studentGrade[row][column];
				
					System.out.printf("%10d",studentGrade[row][column]);
				averageCount++;
				}
				//double average = total / averageCount;
				System.out.printf("%10.0f%10.2f", total[row], average[row]);
			rowCount2++;
			System.out.println();
			}

	}
}