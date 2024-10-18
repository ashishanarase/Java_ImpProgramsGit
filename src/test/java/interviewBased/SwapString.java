package interviewBased;

public class SwapString {

	public static void main(String[] args) {

		System.out.println("Operation using third variable");
		
		String new1 = "Apple";
		String new2 = "Banana";
		
		System.out.println("Before swaping String 1 : " +new1);
		System.out.println("Before swaping String 2 : "+new2);

		String temp = new2;
		new2 = new1;
		new1 = temp;

		System.out.println("After swaping String 1 : "+ new1);
		System.out.println("After swaping String 2 : "+new2);

		System.out.println();
		System.out.println("Operation without using third variable");
		
		String new3 = "Safarchand";
		String new4 = "Keli";		
		
		System.out.println("Before swaping String 3 : " +new3);
		System.out.println("Before swaping String 4 : "+new4);
		
		new3 = new3 + new4;
	
		new4 = new3.substring(0, new3.length()-new4.length());
		
		new3 = new3.substring(new4.length());
		
		System.out.println("After swaping String 3 : "+ new3);
		System.out.println("After swaping String 4 : "+new4);
	}
}

