package programEuler.net;

import java.util.ArrayList;

public class LargestPrimeFactor {

	public static void main(String[] args) {

		//What is the largest prime factor of the number
		
		 int a = 13195;

	        // List to store factors of 'a'
	        ArrayList<Integer> factorsList = new ArrayList<>();

	        // Find factors of 'a'
	        for (int i = 2; i <= a; i++) {
	            if (a % i == 0) {
	                factorsList.add(i);
	            }
	        }

	        System.out.println("Factors: " + factorsList);

	        // List to store non-prime numbers
	        ArrayList<Integer> nonPrimeList = new ArrayList<>();

	        // List to store prime numbers
	        ArrayList<Integer> primeList = new ArrayList<>();

	        // Separate prime and non-prime numbers from the factors list
	        for (int factor : factorsList) {
	            if (isPrime(factor)) {
	                primeList.add(factor);
	            } else {
	                nonPrimeList.add(factor);
	            }
	        }

	        // Output the non-prime and prime lists
	        System.out.println("Non-prime numbers: " + nonPrimeList);
	        System.out.println("Prime numbers: " + primeList);
	        
	        System.out.println("Largest Prime Factor of given number "+a+" :" + primeList.get(primeList.size()-1));
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	     
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false; // Found a divisor, not a prime number
	            }
	        }

	        return true; // No divisors found, it's a prime number
	    }
	    
	 
	}
