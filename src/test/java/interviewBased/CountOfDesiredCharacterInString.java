package interviewBased;

public class CountOfDesiredCharacterInString {

	public static void main(String[] args) {


		String given = "we belong to m group";
		
		char target = 'e';

		int count = given.length();
		int charCount = 0;
		for (int i = 0;i<count;i++) {
			if (given.charAt(i)==target) {
				charCount++;
			}

		}
		System.out.println("The count of '"+ target + "' in given string = " +(charCount));

	}

}
