import java.util.Scanner;

public class Q6{
	public static void main(String[] args){

		double notes[] = new double[10];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++){
			System.out.print("Enter Grade "+(i+1)+":");
			notes[i]=sc.nextDouble();
			}	

		System.out.println("The Average Grade is :" + calculateAverage(notes));	
		System.out.println("Median of the array is :" + calculateMedian(notes));
		System.out.println("The Number Failed is " + calculateNumberFailed(notes));		
		System.out.println("The Number passed is " + calculateNumberPassed(notes));
	}


	public static double calculateAverage(double[] notes){
		double sum = 0.0, average;
		for(int i = 0; i<notes.length;i++){
			sum += notes[i];
		}
		average = sum/notes.length;
		return average;
	}
	
	
	public static double calculateMedian(double[] notes){
		int size = notes.length;
		double temp;
		double median = 0;
		for (int i = 0; i < size; i++){
			for (int j = i + 1; j < size; j++){
				if (notes[i] > notes[j]){
					temp = notes[i];
					notes[i] = notes[j];
					notes[j] = temp;
				}
			}
		}
		
		median = (notes[(size-1)/2] + notes[size/2])/2.0;
		return median;
	}


	public static int calculateNumberFailed(double[] notes){
		int failed = 0;
		for(int i=0;i<notes.length;i++){
			if(notes[i] < 50){
				failed++;
			}
		}
		return failed;
		
	}


	public static int calculateNumberPassed(double[] notes){
		int passed = 0;
		for(int i=0;i<notes.length;i++){
			if(notes[i]>=50){
				passed++;
			}
		}
		return passed;
		
	}
}