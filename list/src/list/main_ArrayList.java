package list;

import java.util.ArrayList;
import java.util.List;

public class main_ArrayList {

	public static void main(String[] args) {
		List<employee> employeeList = new ArrayList<>();
		employeeList.add(new employee("Jane","Jones",123));
		employeeList.add(new employee("John","Do",3456));
		employeeList.add(new employee("Mary","Smith",22));
		employeeList.add(new employee("Mike","Wilson",331));

//		employeeList.forEach(employee -> System.out.println(employee));
//		System.out.println(employeeList.get(1));
//		System.out.println(employeeList.isEmpty());
		
		employeeList.set(1, new employee("John","Adam",3124));
		//employeeList.forEach(employee -> System.out.println(employee));
		//System.out.println(employeeList.size());
		
		employeeList.add(3,new employee("John","Doe",1253));
		//employeeList.forEach(employee -> System.out.println(employee));
		
		//employee[] employeeArray = employeeList.toArray(new employee[employeeList.size()]);
		
//		Object[] employeeArray = employeeList.toArray();
//		
//		for (Object value : employeeArray) {
//			System.out.println(value.toString());
//		}
		
		employee[] employeeArray = employeeList.toArray(new employee[employeeList.size()]);
//		for (employee value : employeeArray) {
//			System.out.println(value.toString());
//		}
		
		System.out.println(employeeList.contains(new employee("Mary","Smith",22)));
		System.out.println(employeeList.indexOf(new employee("Mary","Smith",22)));
		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));
		
	}

}
