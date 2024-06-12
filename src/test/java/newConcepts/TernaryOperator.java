package newConcepts;

public class TernaryOperator {


	public static void main(String [] args) {

		//Ternary Operator
		
		int number = 10 ;    //Given 
	
		number = number>30? 40 : 100;   // variable = expression ? value1 : value2 ;
		
		//Ternary Operator will work like same as If Else
		//If given Expression returns booleen result true then immediate value1 will be print 
		//and if it returns false then value2 will be print
		
		System.out.println("Output by Ternary Operator = " + number);
		
		int number1 = 10;
		
		if (number1>30) {
			System.out.println("Output by if statement as it returns True = "+40);
		}
		else {
			System.out.println("Output by else statement as it returns False = "+100);
		}		
	}
}
