
public class main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDo = new Employee("John","Do",3456);
		Employee marySmith = new Employee("Mary","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",331);
		
		LinkedStack stack = new LinkedStack();
		stack.push(janeJones);
		stack.push(johnDo);
		stack.push(marySmith);
		stack.push(mikeWilson);
		
		// stack.printStack();
		
//		System.out.println(stack.peek());
//		stack.printStack();
		
		System.out.println("Popped: " + stack.pop());
		System.out.println(stack.peek());

	}

}
