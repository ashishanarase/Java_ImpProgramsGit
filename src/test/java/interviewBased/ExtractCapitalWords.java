package interviewBased;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {
	public static void main(String[] args) {
		String sentence = "John is Working on a Java Project for OpenAI.";

		// Define pattern to match words starting with an uppercase letter
		Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
		Matcher matcher = pattern.matcher(sentence);

		System.out.println("Words starting with a capital letter:");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
