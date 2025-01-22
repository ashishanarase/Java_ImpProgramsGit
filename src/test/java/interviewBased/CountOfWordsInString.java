package interviewBased;

public class CountOfWordsInString {

	public static void main(String[] args) {
		String given = "A The Anarase";
		
		String parts [] = given.split(" ");
		
		int count = parts.length;
		
		System.out.println("Total Words in String = " + (count));
	}
}


