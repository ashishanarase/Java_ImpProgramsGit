package interviewBased;

public class CountOfCharactersInEachWord {

	public static void main(String[] args) {

		String input = "I am from India";
		
		String parts [] = input.split(" ");
		
		for (String output : parts) {
			
			System.out.println(output + " = " +output.length());
			//System.out.print(output.length());
			
		}
		
	}
}