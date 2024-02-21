package interviewBased;

import java.util.HashMap;
import java.util.Map;

public class CountOfAllCharacters {

	public static void main(String[] args) {
		String inputString = "Ashish Anarase";

		// Create a HashMap to store character counts
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Convert the string to lowercase (optional, depending on case sensitivity)
		inputString = inputString.toLowerCase();

		// Loop through each character in the string
		for (char c : inputString.toCharArray()) {
			// Increment the count of the character in the map
			if (Character.isLetter(c)) { // Check if the character is a letter
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
			}
		}

		// Print the character counts
		System.out.println("Character counts:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}

