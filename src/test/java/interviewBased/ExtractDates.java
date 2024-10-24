package interviewBased;

import java.util.regex.*;

public class ExtractDates {
	public static void main(String[] args) {
		String text = "The event will take place on 12-15-2022 and another one on 01-01-2023.";

		// Pattern to match dates in the format MM-DD-YYYY
		Pattern pattern = Pattern.compile("\\b\\d{2}-\\d{2}-\\d{4}\\b");
		Matcher matcher = pattern.matcher(text);

		System.out.println("Dates found:");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
