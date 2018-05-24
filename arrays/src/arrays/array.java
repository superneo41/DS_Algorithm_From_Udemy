package arrays;

public class array {

	public static void main(String[] args) {
		int[] intArr = new int[7];
		intArr[0] = 20;
		intArr[1] = 35;
		intArr[2] = -15;
		intArr[3] = 7;
		intArr[4] = 55;
		intArr[5] = 1;
		intArr[6] = -22;
		int index = -1;
		for  (int i = 0; i < intArr.length; i++) {
			if(intArr[i] == 7) {
				index = i;
				break;
			}
		}
		System.out.println("index = " + index);

	}

}
