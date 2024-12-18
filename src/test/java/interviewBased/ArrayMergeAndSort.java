package interviewBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMergeAndSort {

	public static void main(String[] args) {

		int[] arr1 = {1, 4, 6, 8};
		int[] arr2 = {3, 5, 6, 7};
		
		System.out.println("Given Array 1 : "+Arrays.toString(arr1));
		
		System.out.println("Given Array 2 : "+Arrays.toString(arr2));

		ArrayList ar = new ArrayList();

		for (int i = 0; i<= arr1.length-1; i++) {

			ar.add(arr1[i]);
			ar.add(arr2[i]);

		}
		System.out.println("Merged Array : "+ar);
		
		Collections.sort(ar);
		
		System.out.println("Sorted Array in ascending order : "+ar);

		Collections.sort(ar, Collections.reverseOrder());

		System.out.println("Sorted Array in descending order : "+ar);


	}

}
