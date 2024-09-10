public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		int newArr[] = new int[beforeArray.length+1];
		for(int i = 0; i < indexToInsert; i++){
			newArr[i] = beforeArray[i];
		}
		newArr[indexToInsert]=valueToInsert;
		for(int i = indexToInsert + 1; i <= beforeArray.length; i++){
			newArr[i]=beforeArray[i-1];
		}
		return(newArr);
	}

	public static void main(String[] args){
		int arr[]={1,5,4,7,9,6};
		System.out.println("Array before insertion: ");
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		int item = 15;
		int position = 3;
		System.out.println("After insertion of " + item + " at position " + position + " :");
		int [] newArr = insertIntoArray(arr, position, item);
		for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}
	}
}