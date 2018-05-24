package arrays;

public class selection_sort {
	
	//inplace unstable
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	// move the minimum to the first at each traverse
	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {// find the minimum
				if (arr[j] < arr[min]) min = j;
			}
			swap(arr, min, i);
		}
	}
	
	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7 ,55, 1, -22};
		selection(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
