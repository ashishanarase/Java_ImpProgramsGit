package interviewBased;

public class StringSortingAsPerCharacters {

	public static void main(String[] args) {

		String given = "sHU@i9a8bN9m0AT$n";

		StringBuilder upperCaseLetters = new StringBuilder();

		StringBuilder lowerCaseLetters = new StringBuilder();

		StringBuilder digit = new StringBuilder();

		StringBuilder specialCharacters = new StringBuilder();

		for (char c : given.toCharArray()) {

			if (Character.isUpperCase(c)) {
				upperCaseLetters.append(c);
			}

			else if (Character.isLowerCase(c)) {
				lowerCaseLetters.append(c);
			}

			else if(Character.isDigit(c)) {
				digit.append(c);
			}

			else {
				specialCharacters.append(c);
			}

		}

		System.out.println( upperCaseLetters.toString() + 
		lowerCaseLetters.toString() + digit.toString() + 
		specialCharacters.toString());

	}

}
