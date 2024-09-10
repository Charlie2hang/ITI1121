public class Q3_SquareArray{
		
		public static void main(String[] args){
		int[] myArray = createArray(13);
		for(int i = 0; i < myArray.length; i++){
			System.out.println("The square of " + i + " is: " + myArray[i]);
		}
		
	}
	
	
	
	
	public static int[] createArray(int size){
		int[] anArray = new int[size];
		for(int i = 0; i < anArray.length; i++){
			anArray[i] = i * i;
		}
		return anArray;	
	}
	

	
	

	
	
	
}