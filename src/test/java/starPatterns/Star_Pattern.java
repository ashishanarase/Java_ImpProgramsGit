package starPatterns;

public class Star_Pattern {

	public static void main(String[] args) {

		//i=1;i<=no;i++
		//j i   j no 
		//k 1    k i 
		int no =5;
		for(int i=1;i<=no;i++) 
		{
			for (int j=i;j<=no;j++) 
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("");
	}
//
}