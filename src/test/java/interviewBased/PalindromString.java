package interviewBased;

public class PalindromString {
	
	public static void main(String[] args) {
		
		String s1 = "nitin";
		StringBuilder sb = new StringBuilder(s1);
		StringBuilder rev = sb.reverse();
		String s2 = rev.toString();
		if(s1.equals(s2)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is NOT Palindrome");
		}
		
		//Other Approach
		String name  = "madam";

		int i = 0;
		int j = name.length()-1;

		while (i<j) {
			if (name.charAt(i)!=name.charAt(j)) {
				System.out.println("Not a Pallindrome");
				break;

			}
			else  {
				i++;
				j--;
			}
			System.out.println("Pallindrome");
		}
	}
}

