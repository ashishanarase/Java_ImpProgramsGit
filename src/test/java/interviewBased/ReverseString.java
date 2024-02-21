package interviewBased;

public class ReverseString {
	
	public static void main (String [] args) {
		
		String name = "Ashish";
		
		int length = name.length();
		
		for (int i = length-1;i >=0 ; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
