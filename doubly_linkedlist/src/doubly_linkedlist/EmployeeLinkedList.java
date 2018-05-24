package doubly_linkedlist;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addToFront(employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		
		if(head == null) {
			tail = node;
		}
		else {
			head.setPrevious(node);
		}
		
		head = node;
		size++;
		
	}
	
	public boolean addBefore(employee e1, employee e2) {
		
		// return true if successfully add the employee
		// return false if e1 doesn.t exist in the list
		
		if (head == null) return false;
		
		// find existing employee
		EmployeeNode current = head;
		while (current != null && !current.getEmployee().equals(e1)) {
			current = current.getNext();
		}
		if (current == null) return false;
		
		// add e2
		EmployeeNode nodeAdd = new EmployeeNode(e2);
		
		nodeAdd.setPrevious(current.getPrevious());
		nodeAdd.setNext(current);
		current.setPrevious(nodeAdd);
		
		// current.getPrevious().setNext(nodeAdd);
		// if current is head
		
		if(head == current) 
			head = nodeAdd;
		else 
			nodeAdd.getPrevious().setNext(nodeAdd);
		
		size ++;
		return true;
		
	}
	
	public void addToEnd(employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(tail == null) head = node;
		else {
			tail.setNext(node);
			node.setPrevious(tail);
			
		}
		tail = node;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public EmployeeNode removeFromFront() {
		if (isEmpty()) return null;
		EmployeeNode removeNode = head;
		
		if (head.getNext() == null) tail = null;
		else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}
	
	public EmployeeNode removeFromEnd() {
		if (isEmpty()) return null;
		
		EmployeeNode removeNode = tail;
		
		if (tail.getPrevious() == null) head = null;
		else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode;
	}
	
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" <-> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
