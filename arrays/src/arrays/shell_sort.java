package arrays;

public class shell_sort {
	
	public static void shell(int[] arr) {
		
		for (int gap = arr.length/2; gap > 0; gap /= 2) {
			// just put insertion sort into the gap loop
			for (int i = gap; i < arr.length; i++) {
				int temp = arr[i];
				int j;
				for (j = i; j > 0 && arr[j - gap] > temp; j -= gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = temp;
			}		
		}
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7 ,55, 1, -22};
		shell(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
