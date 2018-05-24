package doubly_linkedlist;

public class EmployeeNode {
	
	private employee employee;
	private EmployeeNode next;
	private EmployeeNode previous;
	
	

	public EmployeeNode(employee employee) {
		super();
		this.employee = employee;
	}
	
	



	public employee getEmployee() {
		return employee;
	}





	public void setEmployee(employee employee) {
		this.employee = employee;
	}





	public EmployeeNode getNext() {
		return next;
	}





	public EmployeeNode getPrevious() {
		return previous;
	}





	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}





	public void setNext(EmployeeNode next) {
		this.next = next;
	}


	public String toString() {
		return employee.toString();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
