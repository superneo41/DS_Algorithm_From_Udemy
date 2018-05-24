package Arraystack;

public class main {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(10);
		stack.push(new Employee("Jane","Jones",123));
		stack.push(new Employee("John","Doe",431));
		stack.push(new Employee("Mary","Smith",12314));
		stack.push(new Employee("Mike","Wilson",231));
		stack.push(new Employee("Bill","End",01));
		
		stack.printStack();
		
		System.out.println(stack.peak());
		System.out.println("popped: " + stack.pop());
		System.out.println(stack.peak());

	}

}
