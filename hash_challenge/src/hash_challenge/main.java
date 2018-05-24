package hash_challenge;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		
//		int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
		
		LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        //employees.forEach(e -> System.out.println(e));
        
        LinkedList<Employee> newEmp = new LinkedList<>();
        Map<String,Employee> map = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
        		if (!map.containsKey(employees.get(i).getLastName())) {
        			map.put(employees.get(i).getLastName(), employees.get(i));
        			newEmp.add(employees.get(i));
        		}
        }
        
        newEmp.forEach(e -> System.out.println(e));

	}
	
	public static int hash(int value) {
		return Math.abs(value) % 10;

    }

}
