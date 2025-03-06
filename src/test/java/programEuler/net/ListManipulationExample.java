package programEuler.net;

import java.util.*;

public class ListManipulationExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();  // Create a new ArrayList
		list1.add("foo");                        // list1 = ["foo"]

		List<String> list2 = list1;              // list2 references list1 (shallow copy)
		List<String> list3 = new ArrayList<>(list2); // list3 is a new list with copied elements

		list1.clear();   // Clears list1 (also affects list2 since they point to the same list)
		list2.add("bar"); // Adds "bar" to list2 (which is the same as list1)
		list3.add("baz"); // Adds "baz" to list3 (separate list)

		System.out.print(list1);  // Output list1
		System.out.print(list2);  // Output list2
		System.out.print(list3);  // Output list3
	}
}