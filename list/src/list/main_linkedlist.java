package list;

import java.util.List;
import java.util.Vector;

public class main_linkedlist {

	public static void main(String[] args) {
		
		employee janeJones = new employee("Jane","Jones",123);
		employee johnDo = new employee("John","Do",3456);
		employee marySmith = new employee("Mary","Smith",22);
		employee mikeWilson = new employee("Mike","Wilson",331);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		
		System.out.println(list.isEmpty());
		list.addToFront(janeJones);
		list.addToFront(johnDo);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		

		list.printList();
		
		System.out.println(list.getSize());

		list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();

	}

}
