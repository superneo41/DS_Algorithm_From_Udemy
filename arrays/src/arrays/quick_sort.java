package arrays;

public class quick_sort {
	
	public static void quickSort(int[] input, int start, int end) {
		if (end - start < 2) return;
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
		
	}
	
	public static int partition(int[] input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		while (i < j) {
			// empty loop
			while(i < j && input[--j] >= pivot);
			if (i < j) {
				input[i] = input[j];
			}
			// empty loop
			while(i < j && input[++i] <= pivot);
			if (i < j) {
				input[j] = input[i];
			}
		}
		input[j] = pivot;
		return j;
	}
	
	
	

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7 ,55, 1, -22};
		quickSort(intArray,0,intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
