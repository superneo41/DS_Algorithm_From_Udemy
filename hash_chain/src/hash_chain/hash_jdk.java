package hash_chain;

import java.util.HashMap;
import java.util.Map;



public class hash_jdk {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDo = new Employee("John","Do",3456);
		Employee marySmith = new Employee("Mary","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",331);
		Employee billEnd = new Employee("Bill","end",78);
		
		Map<String, Employee> hashMap = new HashMap<String,Employee>();
		hashMap.put("Jones", janeJones);
		hashMap.put("Do", johnDo);
		hashMap.put("Smith", marySmith);
		
		System.out.println(hashMap.containsKey("Do"));
		System.out.println(hashMap.containsValue(janeJones));
		
		
		hashMap.forEach((k,v) -> System.out.println("key = " + k + ", Employee = " + v));

	}

}
