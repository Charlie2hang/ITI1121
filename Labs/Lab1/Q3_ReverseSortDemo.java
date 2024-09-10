public class Q3_ReverseSortDemo{
	public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
		reverseSort(unorderedLetters);
		for (int i = 0 ; i < unorderedLetters.length; i++ )
			System.out.println(unorderedLetters[i]);
	}

	//method that sorts a char array into its reverse alphabetical order
	public static void reverseSort(char[] values){
		char empty;
		for (int i = 0; i < values.length; i++){
			for (int j = i + 1; j < values.length; j++){
				if (values[i] < values[j]){
					empty = values[i];
					values[i] = values[j];
					values[j] = empty;
				}
			}
			
		}

		//your code here
	}

}