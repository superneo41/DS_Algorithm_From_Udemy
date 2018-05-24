package hash_chain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BcuketSort {

	public static void main(String[] args) {
		int[] intArray = {54, 46, 83, 66, 95, 92, 43};
		bucketSort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void bucketSort(int[] arr) {
		
		List<Integer>[] buckets = new List[10];
		
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < arr.length; i++) {
			buckets[hash(arr[i])].add(arr[i]);
		}
		
		for (List bucket : buckets) {
			Collections.sort(bucket);
		}
		
		int j = 0;
		for (int i = 0; i < buckets.length; i++) {
			for (int value : buckets[i]) {
				arr[j++] = value;
			}
		}
	}
	
	public static int hash(int value) {
		int res = value / 10;
		return res;
	}

}
