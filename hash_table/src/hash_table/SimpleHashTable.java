package hash_table;

public class SimpleHashTable {
	
	private Employee[] hashtable;
	public SimpleHashTable() {
		hashtable = new Employee[10];
	}
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		// doesn't handle collision
		if (hashtable[hashedKey] != null) {
			System.out.println("Sorry, there's already an employee at position " + hashedKey);
			
		}
		else {
			hashtable[hashedKey] = employee;
		}
	}
	
	public Employee get(String key) {
		int hashKey = hashKey(key);
		return hashtable[hashKey];
	}
	

	public void printHashTable() {
		for (int i = 0; i < hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}

}
