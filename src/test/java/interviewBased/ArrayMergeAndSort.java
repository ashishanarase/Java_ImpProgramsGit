package interviewBased;

import java.util.ArrayList;

public class ArrayMergeAndSort {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 4, 6, 8};
        int[] arr2 = {3, 5, 6, 7};
        
        ArrayList list = new ArrayList();
        
        for (int i = 0; i<= arr1.length-1; i++) {
       
        list.add(arr1[i]);
        list.add(arr2[i]);
        
        }
        System.out.println(list);
		
	}

}
