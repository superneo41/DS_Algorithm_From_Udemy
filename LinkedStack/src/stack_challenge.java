import java.util.ArrayDeque;
import java.util.Deque;

public class stack_challenge {
	
	public static boolean checkForPalindrome(String s) {
		
		Deque<Character> stack = new ArrayDeque<Character>();
		s = s.replaceAll("[\\W]", "").toLowerCase();
		System.out.println(s);
		
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		for (int i = 0; i < s.length(); i++) {
			if (stack.peek() == s.charAt(i)) stack.pop();
		}
		if (stack.isEmpty()) return true;
		else return false;
		
		
	}

	public static void main(String[] args) {
		
		

		
		// should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));

	}

}
