package interviewBased;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueDataFromArray {
	public static void main(String[] args) {

		{ 
			// Creating an empty ArrayList 
			ArrayList<Integer> list = new ArrayList<Integer>(); 

			// Adding elements to list 
			list.add(10); 
			list.add(20); 
			list.add(30); 
			list.add(20); 
			list.add(10); 

			// Creating a HashSet 
			HashSet<Integer> set = new HashSet<Integer>(list); 

			// Creating a new ArrayList from the HashSet 
			ArrayList<Integer> uniqueList = new ArrayList<Integer>(set); 

			// Printing the ArrayList with unique values 
			System.out.println("ArrayList with unique values: " + uniqueList); 
		} 
	}
}
