package arrays;

import java.util.Arrays;

public class JDK_sort {

	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 55, 1, -22};
		//Arrays.sort(intArray);
		// dual pivotal quick sort
		
		
		// might be quicker for larger data
		// merge + quick sort
		Arrays.parallelSort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
