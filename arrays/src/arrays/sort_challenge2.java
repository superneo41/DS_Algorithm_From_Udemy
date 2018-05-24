package arrays;

public class sort_challenge2 {
	
	// change the insertion sort using recursion

	public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        insertionSort(intArray, intArray.length);

//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
//             firstUnsortedIndex++) {
//            int newElement = intArray[firstUnsortedIndex];
//
//            int i;
//
//            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
//                intArray[i] = intArray[i - 1];
//            }
//
//            intArray[i] = newElement;
//        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }	
        
	}
	
	public static void insertionSort(int[] input, int num) {
		if (num < 2) return;
		
		insertionSort(input, num - 1);
		
		int newElement = input[num - 1];
		int i;
		for (i = num - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;
        
        System.out.println("results when num = "+ num);
        for (i = 0; i < input.length; i++) {
        		System.out.print(input[i]);
        		System.out.print(", ");
        }
        System.out.println("");
        System.out.println("---------------------");
		
	}

}
