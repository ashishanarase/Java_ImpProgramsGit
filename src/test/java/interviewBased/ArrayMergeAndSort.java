package interviewBased;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMergeAndSort {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 4, 6, 8};
        int[] arr2 = {3, 5, 6, 7};
        
        ArrayList ar = new ArrayList();
        
        for (int i = 0; i<= arr1.length-1; i++) {
       
        ar.add(arr1[i]);
        ar.add(arr2[i]);
        
        }
        System.out.println("Merged Array : "+ar);
        Collections.sort(ar);
        System.out.println("Sorted Array : "+ar);
        
		
	}

}
