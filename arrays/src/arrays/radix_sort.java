package arrays;

public class radix_sort {
	
	public static void radixSort(int[] input, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingle(input, i, radix);
		}
	}
	
	public static void radixSingle(int[] input, int position, int radix) {
		int num = input.length;
		int[] countArray = new int[radix];
		
		for (int value: input) {
			countArray[getDigit(position,value,radix)] ++;
		}
		
		// adjust the count array
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}
		
		int[] temp = new int[num];
		for (int tempIndex = num - 1; tempIndex >= 0; tempIndex--) {
			temp[--countArray[getDigit(position,input[tempIndex],radix)]] = input[tempIndex];
		}
		
		for (int tempIndex = 0; tempIndex < num; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}
	
	
	public static int getDigit(int position, int value, int radix) {
		return value / (int) Math.pow(radix, position) % radix;
	}

	public static void main(String[] args) {
		int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
		radixSort(radixArray,10,4);
		for (int i = 0 ; i < radixArray.length; i++) {
			System.out.println(radixArray[i]);
		}
	}

}
