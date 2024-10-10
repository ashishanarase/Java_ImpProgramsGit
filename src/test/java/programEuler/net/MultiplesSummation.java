package programEuler.net;

public class MultiplesSummation {

	public static void main(String[] args) {

		/*	If we list all the natural numbers below that are multiples of 
		3 or 5, we get and The sum of these multiples is 23.
		Find the sum of all the multiples of 3 or 5 below 1000.*/

		int a = 3;

		int b = 5;

		int sum = 0;

		for (int i = 1; i<1000; i++) {

			if ((i%a == 0) || (i%b == 0)) {			

				sum = sum + i;		

			}

		}
		
		System.out.println("Sum of all the multiples of 3 or 5 below 1000 = "+sum);
	}

}
