package interviewBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMergeAndSort {

	public static void main(String[] args) {

		int[] arr1 = {1, 9, 6, 8};
		int[] arr2 = {3, 5, 2, 7};

		System.out.println("Given Array 1 : "+Arrays.toString(arr1));

		System.out.println("Given Array 2 : "+Arrays.toString(arr2));

		ArrayList <Integer> ar = new ArrayList<>();

		for (int i = 0; i<= arr1.length-1; i++) {

			ar.add(arr1[i]);
			ar.add(arr2[i]);

		}
		System.out.println("Merged Array : "+ar);

		for (int i = 0; i<ar.size()-1; i++) {
			for (int j = 0; j<ar.size()-i-1; j++) {

				if (ar.get(j) > ar.get(j + 1)) {
					// Swap elements
					int temp = ar.get(j);
					ar.set(j, ar.get(j + 1));
					ar.set(j + 1, temp);
				}

			}

		}

		System.out.println("Sorted Array = " + ar);	
	}


}

