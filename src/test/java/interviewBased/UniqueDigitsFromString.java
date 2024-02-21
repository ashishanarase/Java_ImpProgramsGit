package interviewBased;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigitsFromString {

	public static void main(String[] args) {

		String number = "556992544";

		Set<Character> uniqueDigits = new HashSet<>();

		for (char digit : number.toCharArray()) {
			uniqueDigits.add(digit);
		}

		for (char digit : uniqueDigits) {
			System.out.print(digit+ " ");
		}	
	}
}






