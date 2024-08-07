public class StudentGradeFunction{


	public static double[] getTotal(int[][] array){
		double[] subjectTotal = new double[array.length];
		for(int row = 0; row < subjectTotal.length; row++){
			for(int column = 0; column < array[row].length; column++){
				subjectTotal[row] += array[row][column];
			}
		}
	return subjectTotal;
	}


	public static double[] getAverage(int[][] array){
		double[] average = new double[array.length];
		double total = 0;
		double tempAverage = 0;
		int length = array[0].length;
		for(int row = 0; row < average.length; row++){
			for(int column = 0; column < array[row].length; column++){
				total += array[row][column];
			}
			tempAverage = total / length;
			average[row] = tempAverage;
			total = 0;
			tempAverage = 0;
		}
	return average;

	}

	
	public static int[] sortArray(int[] array){
			int[] result  = new int[array.length];
			int temp = 0;
			for(int count = 0; count < array.length; count++){
				for(int check = count + 1; check < array.length; check++){
			
					if(array[count] > array[check]){
						temp = array[count];
						array[count] =array[check];
						array[check] = temp; 
					}
				}
				result[count] = array[count];
			}
		return result;
		}


	public static int[] getPosition(int[] array){
			int[] array1 = Arrays.copyOf(array,array.length);
			int[] position = new int[array.length];
			int[] sortAscend = sortArray(array1);		
			for(int count = 0; count < array.length; count++){
				int counter = array.length;
				for(int check = 0; check < array1.length; check++){
					if(array[count] == sortAscend[check]){
						position[count] = counter;
					}
				counter--;
				}
			}
		return position;
		}


}