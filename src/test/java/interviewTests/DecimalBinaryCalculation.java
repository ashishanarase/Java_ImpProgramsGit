package interviewTests;

public class DecimalBinaryCalculation {
	
	public static void main(String[] args) {
		int a = 3 & 5;
		
		int b = 3 | 5;
		
		System.out.println(a);
		
		System.out.println(b);
		
		// 3 = 2  1       5 = 4 2 1
		// 3 = 1  1       5 = 1 0 1
		//So for a = 011 & 101 = 001 which in decimal 1
		//and for b = 011 | 101 = 111 which in decimal 7 
	}

}
 