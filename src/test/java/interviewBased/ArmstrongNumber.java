package interviewBased;

public class ArmstrongNumber {

	public static void main (String [] args) {
		int number = 153;
		int temp = number;
		int rem,sum = 0;
		
		while (number>0){
			rem = number%10; 
			sum = sum+(rem*rem*rem);
			number = number/10;
		}
		if (temp==sum)	{
			System.out.println("The given number " + temp + " is a Armstronge number.");
		}
		else {
			System.out.println("The given number " + temp + " is a not Armstronge number.");
		}		
	}
}



