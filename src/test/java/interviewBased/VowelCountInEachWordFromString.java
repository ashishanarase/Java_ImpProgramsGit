package interviewBased;

public class VowelCountInEachWordFromString {

	public static void main(String[] args) {

		String sample = "The vowel sound howls out its subliminal message of seasonal sorrow";

		String given = sample.toLowerCase();

		System.out.println(given);

		String maxVowelWord = "";
		int maxVowelCount = 0;
		String [] parts = given.split(" ");

		for (String word : parts) {
			int count = 0;
			for (char c : word.toCharArray()) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
			if (count > maxVowelCount) {
				maxVowelCount = count;
				maxVowelWord = word;
			}
		}
		
		System.out.println(maxVowelWord +" = "+maxVowelCount);
		
	}

}
