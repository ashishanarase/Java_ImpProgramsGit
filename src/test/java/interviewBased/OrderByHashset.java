package interviewBased;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class OrderByHashset {
	
	public static void main(String[] args) {			
		
		//ArrayList a <integer> = new ArrayList <integer> ();
		//a.add(1);		
		
		ArrayList a = new ArrayList ();
		a.add(4);
		a.add(2);
		a.add(1);
		a.add(3);
		a.add(5);		
		System.out.println(a);
		
		HashSet H = new HashSet (a);
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		
		Collections.shuffle(a);
		System.out.println(a);
		
		ArrayList list = new ArrayList ();
		
		list.add(10);
		list.add(35);
		list.add(5);
		list.add(37);
		HashSet set = new HashSet(list);
		
		Collections.reverse(a);
		System.out.println(set);
		
	}

}
