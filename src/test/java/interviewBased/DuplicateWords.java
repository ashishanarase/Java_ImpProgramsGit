package interviewBased;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {
		String name = "What is this String, this is a String Class";

		String[] words = name.split("\\s+");

		// Create a HashMap to store word frequencies
		Map<String, Integer> wordFreq = new HashMap<>();

		// Count the occurrences of each word
		for (String word : words) {
			wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
		}

		// Print duplicate words along with their counts
		System.out.println("Duplicate words and their counts in the string:");
		for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}



