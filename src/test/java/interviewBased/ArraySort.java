package interviewBased;

public class ArraySort {

	public static void main(String[] args) {
		//Sort given array in ascending/descending order 

		int ar [] = {7,5,3,1,9,8,4,2,6};

		//bubble sort
		for (int i = 0 ; i <=ar.length;i++) {
			for (int j=0;j<ar.length-i-1;j++) {
				if (ar[j]>ar[j+1]) {              //  change conditon here > to get descending order
					//swap ar[j] and ar[j+1]
					int temp = ar[j];
					ar[j]= ar[j+1];
					ar[j+1]= temp;
				}

			}
		}
		System.out.println("Sorted array in ascending order: ");
		for (int i = 0; i<ar.length; i++) {
			System.out.print(ar[i] + " " );
		}
		
	}

}
