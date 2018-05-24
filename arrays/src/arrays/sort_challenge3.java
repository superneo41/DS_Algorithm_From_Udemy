package arrays;

public class sort_challenge3 {
	
	public static void radixSort(String[] input, int radix, int width) {
		for (int i = width - 1; i >= 0; i--) {
			radixSingleSort(input,i,radix);
		}
	}
	
	public static void radixSingleSort(String[] input, int position, int radix) {
		int[] countArray = new int[radix];
		int num = input.length;
		
		for (String value : input) {
			countArray[getChar(value,position)]++;
		}
		
		// adjust the array
		for (int i = 1; i < radix; i++) {
			countArray[i] += countArray[i-1];
		}
		
		String[] temp = new String[num];
		for (int tempIndex = num - 1; tempIndex >= 0; tempIndex --) {
			temp[--countArray[getChar(input[tempIndex],position)]] = input[tempIndex];
		}
		for (int tempIndex = 0; tempIndex < num; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
		
		
	}
	
	public static char getChar(String value, int position) {
		return value.charAt(position);
	}
	
	
	// using value.charAt(position) - 'a' to get Index !!!
	// then we can create countArray by int[26]
	public static int getIndex(String value, int position) {
		return value.charAt(position) - 'a';
	}
	


	

	public static void main(String[] args) {
		String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
		radixSort(stringsArray,128,5);


		
        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
        
	}

}
