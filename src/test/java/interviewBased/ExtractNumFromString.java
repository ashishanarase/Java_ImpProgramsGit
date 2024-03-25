package interviewBased;

public class ExtractNumFromString {
	
	public static void main(String[] args) {
		
		String given = "Test1234Given45323";
		
		String digit = given.replaceAll("[^0-9]", "");
		System.out.println(digit);
	}

}
