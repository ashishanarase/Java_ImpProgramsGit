package interviewBased;

import java.util.Scanner;

public class PrimeNumberValidation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int no = scan.nextInt();  //Desired input number

		int temp = 0;

		for (int i =2; i<=no-1; i++) {

				if (no%i==0) {
					temp = temp+1;
				}
			}
			if (temp>0) {
				System.out.print("The Given number "+no+" is not a Prime Number");
			}
			else if (temp==0) {
				System.out.print("The Given number "+no+" is a Prime Number");
			}

		}
	}

