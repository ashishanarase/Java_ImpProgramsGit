package interviewBased;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharaterFromAlphaNumericString {

	public static void main(String[] args) {

		String sample1 = "MBLHA10ALCHJ00756";

		String sample2 = "ME4JC67HGKA037323";

		Map <Character, Integer> map = new HashMap <>();

		for (char c : sample1.toCharArray()) {
			// Increment the count of the character in the map
			if ((Character.isDigit(c))||(Character.isLetter(c))) { // Check if the character is a letter
				map.put(c, map.getOrDefault(c, 0) + 1);
			}


		}
		System.out.println("Character counts:");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());

			}
		}
	}

}
