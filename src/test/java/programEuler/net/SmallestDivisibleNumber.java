package programEuler.net;

public class SmallestDivisibleNumber {

	public static void main(String[] args) {

		//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
		//without any remainder.
		//What is the smallest positive number that is evenly divisible by all of the numbers 
		//from 1 to 20?

		int result = 1;

		// Function to calculate GCD
		for (int i = 1; i <= 20; i++) {
			result = result * (i / gcd(result, i));
		}

		System.out.println("The smallest positive number evenly divisible by all numbers from 1 to 20 is: " + result);
	}

	// GCD function inside main method
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
