package arrays;

public class bubble_sort {
	
	// in-place stable
	
	public static void swap(int[] arr, int i, int j) {
		if (i == j) return;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void bubble(int[] arr) {
		for(int last = arr.length - 1; last > 0; last--) {
			for(int i = 0; i < last; i++) {
				if(arr[i] > arr[i+1]) swap(arr,i,i+1);
			}
		}
	}

	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7 ,55, 1, -22};
		bubble(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
