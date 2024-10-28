package programEuler.net;

public class LargestPalindromeProduct {

	public static void main(String[] args) {

		//A palindromic number reads the same both ways. 
		//The largest palindrome made from the product of two -digit numbers is 9009 = 91 X 99
		//Find the largest palindrome made from the product of two 3-digit numbers.

		int largestPalindrome = 0;
		int num1 = 0, num2 = 0; 

		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				int product = i * j;
				int original = product;
				int reversed = 0;

				// Check if the number is a palindrome by reversing it
				while (product != 0) {
					int digit = product % 10;
					reversed = reversed * 10 + digit;
					product /= 10;
				}

				// If the original number and reversed number are the same, it's a palindrome
				if (original == reversed && original > largestPalindrome) {
					largestPalindrome = original;
					num1 = i;
					num2 = j;
				}
			}
		}

		// Output the result
		System.out.println("The largest palindrome made from the product of two 2-digit numbers is: " 
				+ largestPalindrome + " (" + num1 + " * " + num2 + ")");
	}

}
