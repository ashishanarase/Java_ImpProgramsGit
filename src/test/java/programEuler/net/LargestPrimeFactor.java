package programEuler.net;

import java.util.ArrayList;

public class LargestPrimeFactor {

	public static void main(String[] args) {

		int a = 13195;

		ArrayList <Integer> list = new ArrayList <>();

		for (int i = 2 ; i<a; i++) {

			if ((a%i == 0)) {

				list.add(i);

			}

		}

		System.out.println(list);
		ArrayList <Integer> list2 = new ArrayList <>();

		for (int b : list) {

			for (int c = 2; c <= b-1; c++) {

				int factor = b % c;
				if (factor == 0) {
					
					list2.add(b);

				}

				


			}

		}




		System.out.println(list2);



	}

}
