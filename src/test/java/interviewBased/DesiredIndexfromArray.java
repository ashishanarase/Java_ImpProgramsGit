package interviewBased;

public class DesiredIndexfromArray {


	public static void main(String[] args) {

		//DesiredIndexfromArray

		int ar [] = {7,5,3,1,9,8,4,2,6};

		//bubble sort
		for (int i = 0 ; i <=ar.length;i++) {
			for (int j=0;j<ar.length-i-1;j++) {
				if (ar[j]>ar[j+1]) {              //change conditon here > to get descending order
					//swap ar[j] and ar[j+1]
					int temp = ar[j];
					ar[j]= ar[j+1];
					ar[j+1]= temp;
				}

			}
		}
		System.out.println("Second Largest Value from Arraylist: ");
		
		System.out.print(ar[ar.length-2]);
	}
}
