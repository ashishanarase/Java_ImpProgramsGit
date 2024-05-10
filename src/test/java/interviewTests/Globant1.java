package interviewTests;

public class Globant1 {
	 
	public static void main(String[] args) {
	        char c1 = 'a'; // declare and initialize a char variable
	        char c2 = 'b'; // corrected missing '=' sign

	        System.out.println(c1);
	        System.out.println(c2); // corrected ',' to ';'

	        char c3 = (char) (c1 + 1);
	        char c4 = (char) (c2 - 1);
	        System.out.println(c3);
	        System.out.println(c4);

	        char c5 = '\"'; // escaped double quote character
	        char c6 = '\n'; // newline character

	        System.out.println(c5);
	        System.out.println("Hello" + c6 + "World!");
	    }
	}
