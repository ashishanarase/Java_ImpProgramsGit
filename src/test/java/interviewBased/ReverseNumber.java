package interviewBased;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num = 2989;
		
		int rem = 0;
		
		int store = 0;
		
		while(num>0) {
			rem = num%10;
			num = num/10;
			store = (store*10)+rem;
		}
		System.out.println(store);
		
	}

}
