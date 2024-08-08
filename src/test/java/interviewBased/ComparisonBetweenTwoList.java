package interviewBased;

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
		
		// Create and populate two lists
        List<String> list3 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
        List<String> list4 = new ArrayList<>(Arrays.asList("Fig", "Grape", "Cherry", "Date", "Apple"));

        // Print the original lists
        System.out.println("List 3: " + list3);
        System.out.println("List 4: " + list4);

        // Find and print common elements
        List<String> commonElements = new ArrayList<>(list3);
        commonElements.retainAll(list4);
        System.out.println("Common Elements: " + commonElements);

        // Find and print unique elements in list1
        List<String> uniqueInList1 = new ArrayList<>(list3);
        uniqueInList1.removeAll(list4);
        System.out.println("Unique Elements in List 1: " + uniqueInList1);

        // Find and print unique elements in list2
        List<String> uniqueInList2 = new ArrayList<>(list4);
        uniqueInList2.removeAll(list3);
        System.out.println("Unique Elements in List 2: " + uniqueInList2);

        // Merge both lists and print unique elements in merged list
        Set<String> mergedSet = new HashSet<>(list3);
        mergedSet.addAll(list4);
        System.out.println("Unique Elements in Merged List: " + mergedSet);
	}
}

