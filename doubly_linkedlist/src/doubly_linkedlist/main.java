package doubly_linkedlist;


public class main {

	public static void main(String[] args) {
		employee janeJones = new employee("Jane","Jones",123);
		employee johnDo = new employee("John","Do",3456);
		employee marySmith = new employee("Mary","Smith",22);
		employee mikeWilson = new employee("Mike","Wilson",331);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(janeJones);
		list.addToFront(johnDo);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
//		list.printList();
//		System.out.println(list.getSize());
//		
//		employee billEnd = new employee("Bill","End",78);
//		list.addToEnd(billEnd);
//		list.printList();
//		System.out.println(list.getSize());
//		
//		list.removeFromFront();
//		list.printList();
//		System.out.println(list.getSize());
//		
//		list.removeFromEnd();
//		list.printList();
//		System.out.println(list.getSize());
		
		list.printList();
		
		employee JamesBond = new employee("James","Bond",988);
		list.addBefore(johnDo, JamesBond);
		list.printList();
		System.out.println(list.getSize());
		
		
		list.addBefore(mikeWilson, new employee("new","sd",1232));
		list.printList();
		System.out.println(list.getSize());
		

	}

}
