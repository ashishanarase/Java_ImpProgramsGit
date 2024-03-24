package newConcepts;

import java.util.HashMap;

public class HashMapData {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("newKey", "value1");
		map.put("newKey", "value2");
		map.put("newKey1", "value3");

		map.put(null, null);

		map.put(null, "nullNew");
		
		System.out.println(map);
	}

}
