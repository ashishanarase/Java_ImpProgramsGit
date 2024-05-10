package interviewBased;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ChronologicalSorting {
	
		public static void main(String[] args) {
			
			String[] months = {"JAN", "APR", "MAR", "DEC", "OCT"};

			// Create a map to hold the chronological order of months
			Map<String, Integer> monthOrder = new HashMap<>();
			monthOrder.put("JAN", 1);
			monthOrder.put("FEB", 2);
			monthOrder.put("MAR", 3);
			monthOrder.put("APR", 4);
			monthOrder.put("MAY", 5);
			monthOrder.put("JUN", 6);
			monthOrder.put("JUL", 7);
			monthOrder.put("AUG", 8);
			monthOrder.put("SEP", 9);
			monthOrder.put("OCT", 10);
			monthOrder.put("NOV", 11);
			monthOrder.put("DEC", 12);

			// Sort the array of months based on the chronological order
		//	Arrays.sort(months, Comparator.comparingInt(month -> monthOrder.get(month)));
					
			// Print the sorted array
			System.out.println("Sorted Months (Chronological Order):");
			for(String month : months) {
				System.out.println(month);
			}
		}
	}
