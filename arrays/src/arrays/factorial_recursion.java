package arrays;

public class factorial_recursion {
	
	// for loop
	public static int factorial_for(int num) {
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}
		return res;
	}
	
	// recursion
	// n! = n*(n-1)!
	public static int factorial_recur(int num) {
		if (num == 0) return 1; // breaking condition, base cause
		return num * factorial_recur(num - 1); // n! = n * (n - 1)!
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println("factorial_for n = "+ num + " is "+factorial_for(num));
		System.out.println("factorial_recur n = "+ num + " is "+factorial_recur(num));

	}

}
