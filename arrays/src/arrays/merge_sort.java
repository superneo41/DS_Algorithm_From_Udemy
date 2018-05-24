package arrays;

public class merge_sort {
	
	public static void mergeSort(int[] input, int start, int end) {
		if (end - start < 2) return;
		
		int mid = (start + end) / 2;
		mergeSort(input,start,mid);
		mergeSort(input,mid,end);
		merge(input,start,mid,end);
		
		
	}
	
	// merge two sorted array
	// 
	public static void merge(int[] input, int start, int mid, int end) {
		if (input[mid - 1] <= input[mid]) return;
		int left = start;
		int right = mid;
		int tempIndex = 0;
		int[] temp = new int[end - start];
		
		while(left < mid && right < end) {
			temp[tempIndex++] = (input[left] < input[right]) ? input[left++] : input[right++];
		}
		// {32,34}, {33, 36}
		// {32,33,34} {36}
		System.arraycopy(input, left, input, start + tempIndex, mid - left);
		System.arraycopy(temp, 0, input, start, tempIndex);
		
	}

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7 ,55, 1, -22};
		mergeSort(intArray,0,intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
