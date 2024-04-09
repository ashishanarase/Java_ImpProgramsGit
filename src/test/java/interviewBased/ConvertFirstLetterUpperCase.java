package interviewBased;

public class ConvertFirstLetterUpperCase {

	public static void main(String[] args) {

		String sentence = "ashish anarase";
		StringBuilder result = new StringBuilder();

		// Split the sentence into words
		String[] words = sentence.split(" ");

		// Capitalize first letter of each word and append to result
		for (String word : words) {
			if (!word.isEmpty()) {
				result.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1))
				.append(" ");
			}
		}
		result.toString().trim();


		System.out.println("Original sentence: " + sentence);
		System.out.println("Capitalized sentence: " + result.toString().trim());

	}
}

