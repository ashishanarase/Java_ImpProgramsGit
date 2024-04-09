package dataManipulationFromFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComparisonBetweenTwoList {

	
	public static void main(String[] args) {

		//	Write a java program to compare two list no matter about the order
		// Define the lists
		List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
		List<String> list2 = new ArrayList<>(Arrays.asList("b", "a", "c"));

		// Convert lists to sets
		Set<String> set1 = new HashSet<>(list1);
		Set<String> set2 = new HashSet<>(list2);

		// Compare sets
		boolean result = set1.equals(set2);
		//boolean result = set1.containsAll(set2);
		// Print the result
		System.out.println("Are the lists equal? " + result);
	}
}

