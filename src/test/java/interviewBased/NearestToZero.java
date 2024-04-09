package interviewBased;

public class NearestToZero {

	//write a logic to find which number is nearest to "0" in an array(0 is not 
	//in array but have to find nearest value)

	public static void main(String[] args) {

		int a [] = {-6, -2, 1, 5, 7, 4, 12};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min&& a[i]>0) {
				min=a[i];
			}
		}

		//		Arrays.sort(a);
		System.out.print(min);

	}
}

