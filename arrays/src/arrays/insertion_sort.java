package arrays;

public class insertion_sort {
	
	
	
	public static void insertion(int[] arr) {
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
			int temp = arr[firstUnsortedIndex];
			int i;
			for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > temp; i--) {
				arr[i] = arr[i-1];
			}
			arr[i] = temp;
		}
		
	}

	public static void main(String[] args) {
		
		
		int[] intArray = {20, 35, -15, 7 ,55, 1, -22};
		insertion(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
