package programEuler.net;

public class SumSquareDifference {
	
	public static void main(String[] args) {
		
		//The sum of the squares of the first ten natural numbers is 385
		//The square of the sum of the first ten natural numbers is 55*55 = 3025
		//Hence the difference between the sum of the squares of the first 
		//ten natural numbers and the square of the sum is 3025-385 = 2640
		
		//Find the difference between the sum of the squares of the first one hundred 
		//natural numbers and the square of the sum.
		
		int value1 = 0;
		
		int value2 = 0;
		
		for (int i = 1; i<= 100; i++) {     //Edit here for range
			
			value1 = value1 + (i*i);	
			
			value2  = value2 + i;
			
		}
		
		int product = value2*value2;
		
		int difference = product - value1;
		
		System.out.println("Sum of the squares of the natural numbers : "+value1);
		
		System.out.println("Square of the sum of the natural numbers : "+(product));
		
		System.out.println("Difference between the sum of the squares of the "
						+ "natural numbers and the square of the sum : "+ difference);
		
	}

}
