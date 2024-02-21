package interviewBased;

public class CountOfWordsInString {

	public static void main(String[] args) {
		String s = "A The Anarase";
		char[] c = s.toCharArray();
		int count = 0;
		for (char ch : c)
		{
			if(ch == ' ') {
				count++;
			}
		}
		System.out.println("Total Words in String = " + (count+1));
	}
}


