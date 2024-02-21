package interviewBased;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumFromParagraph {
	
	public static void main(String[] args) {
        String paragraph = "This is a paragraph with a 10-digit number: 1234567890. It also contains other text.";
        
        // Define the pattern for a 10-digit number
        Pattern pattern = Pattern.compile("\\b\\d{10}\\b");
        
        // Create a matcher with the input string
        Matcher matcher = pattern.matcher(paragraph);

        // Find the 10-digit number(s)
        while (matcher.find()) {
            String foundNumber = matcher.group();
            System.out.println("Found 10-digit number: " + foundNumber);
        }
	}

}
