package hash_chain;


public class main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDo = new Employee("John","Do",3456);
		Employee marySmith = new Employee("Mary","Smith",22);
		Employee mikeWilson = new Employee("Mike","Wilson",331);
		Employee billEnd = new Employee("Bill","end",78);
		
		chainHash ht = new chainHash();
		ht.put("Jones", janeJones);
		ht.put("Do", johnDo);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marySmith);
		
		ht.printHashTable();
		
		System.out.println("Retrieve key marry " + ht.get("Smith"));
		
		ht.remove("Wilson");
		ht.remove("Jones");
		ht.printHashTable();
		System.out.println("Retrieve key marry " + ht.get("Smith"));
		

	}

}
