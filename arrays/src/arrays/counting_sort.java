package arrays;

public class counting_sort {
	// useful when the range of input is similar to the number of input
	public static void countingSort(int[] arr, int min, int max) {
		
		int[] count = new int[max - min + 1];
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}
		
		int j = 0;
		
		for (int i = min; i <= max; i++) {
			while (count[i - min] > 0) {
				arr[j++] = i;
				count[i - min]--;
			}
		}


		
		
		
	}

	public static void main(String[] args) {
		int[] arr = {2,5,9,8,2,8,7,10,4,3};
		countingSort(arr,1,10);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
