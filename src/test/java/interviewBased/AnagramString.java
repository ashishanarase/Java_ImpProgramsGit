package interviewBased;

import java.util.Arrays;

public class AnagramString {

	public static void main (String [] args) {

		String str1 = "Listen";

		String str2 = "Silent";

		str1 = str1.toLowerCase();

		str2 = str2.toLowerCase();

		char [] ar1 = str1.toCharArray();

		char [] ar2 = str2.toCharArray();

		Arrays.sort(ar1);

		Arrays.sort(ar2);

		if (Arrays.equals(ar1, ar2)) {
			
			System.out.println(str1 + " and " + str2 + " are anagrams strings.");
			
		}

		else {
			
			System.out.println(str1 + " and " + str2 + " are NOT anagrams strings.");
			
		}


	}

}
