package interviewBased;

public class PrimeNumberList {

	public static void main(String[] args) {

		int no = 100;

		int temp = 0;

		for (int i =2; i<=no-1; i++) {

			for (int j =2; j<= i-1;j++) {

				if (i%j==0) {
					temp = temp+1;
				}
			}
			if (temp==0) {
				System.out.print(i+", ");
			}
			else {
				temp=0;
			}

		}
	}
}

