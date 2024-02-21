package interviewBased;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int d = 15;			//Input 

		System.out.println("First "+ d+ " Fibonacci Series Numbers are=");
		for(int i=1;i<=d;i++) {

			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
