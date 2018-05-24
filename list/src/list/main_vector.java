package list;

import java.util.List;
import java.util.Vector;

public class main_vector {

	public static void main(String[] args) {
		List<employee> employeeList = new Vector<>();
		employeeList.add(new employee("Jane","Jones",123));
		employeeList.add(new employee("John","Do",3456));
		employeeList.add(new employee("Mary","Smith",22));
		employeeList.add(new employee("Mike","Wilson",331));

	}

}
