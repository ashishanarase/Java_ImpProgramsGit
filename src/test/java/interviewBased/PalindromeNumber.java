package interviewBased;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 323;
		int temp = num;
		
		int rem = 0;
		int store = 0;
		
		while(num>0) {
			rem = num%10;
			num=num/10;
			store =(store*10)+rem;
			
			
		}
		if (temp==store) {
			
		System.out.print(store);
		}
		
	}
	
}
