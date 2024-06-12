package interviewBased;

public class MaxNumberInArray  {

	public static void main(String[]args) {

			int[] ar = {5, 10, 120, 15, 30};

			// Find the maximum number in the array
			int max = ar[0]; // Assume the first number is the max
			for (int i = 1; i < ar.length; i++) {
				if (ar[i] > max) {
					max = ar[i];
				}
			}

			// Print the maximum number
			System.out.println("The maximum number in the array is: " + max);
			
			
			
			int[] ar2 = {5, 10, 120, 3, 2};

			// Find the minimu number in the array
			int min = ar2[0]; // Assume the first number is the min
			for (int i = 1; i < ar2.length; i++) {
				if (ar2[i] < min) {
					min = ar2[i];
				}
			}

			// Print the minimum number
			System.out.println("The minimum number in the array is: " + min);
		}
	
	}


