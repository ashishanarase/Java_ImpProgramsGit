package dataManipulationFromFile;

public class StringManipulation {
	
	
	public static void main(String[] args) {
		
		String string1 = "The rains have started here";
		String string2 = "The rains Have started here";

		System.out.println(string1.length());
		
		System.out.println(string1.charAt(5));
		
		System.out.println(string1.indexOf('T')); //1st occurrence of s
		
		System.out.println(string1.indexOf('s', 9)); //2nd occurrence of s
		
		System.out.println(string1.indexOf("have"));
		
		System.out.println(string1.indexOf("hello"));
		
		System.out.println(string1.equals(string2));
		
		System.out.println(string1.equalsIgnoreCase(string2));
		
		System.out.println(string1.toUpperCase());
		
		//sub string:
		System.out.println(string1.substring(0, 9));
		
		//trim:
		String string3 = "     Hello World    ";
		
		System.out.println(string3.trim());
		
		//replace:
		String string4 = "Hello world";
		System.out.println(string4.replace(" ", "-"));
		System.out.println(string3.replace(" ", ""));
		
		String string5 = "01-01-1990";
		System.out.println(string5.replace("-", "/"));
	}
}
