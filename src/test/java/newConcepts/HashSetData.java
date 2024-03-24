package newConcepts;

import java.util.HashSet;

public class HashSetData {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("10");
		set.add("10");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	}

}
