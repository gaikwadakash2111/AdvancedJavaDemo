package set;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(10);
		
		ts.add(20);
		
		ts.add(30);
		
		ts.add(40);
		
		ts.add(50);
		
		ts.add(40);
		
		System.out.println(ts);
		// order of insertion is there
		// no duplicates are allowed

	}

}
