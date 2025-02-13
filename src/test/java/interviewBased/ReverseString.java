package interviewBased;

public class ReverseString {
	
	public static void main (String [] args) {
		//Conventionally
		String name = "Ashish";
		
		int length = name.length();
		
		for (int i = length-1;i >=0 ; i--) {
			System.out.print(name.charAt(i));
		}	
		System.out.println();
		//Using Pre built methods
		String sample = "Anarase";
		
		StringBuilder build = new StringBuilder(sample);
		
		//StringBuffer build = new StringBuffer(sample);  // Any option we can use

		
		String reverse = build.reverse().toString();
		
		System.out.println(reverse);
		
		}
	}


