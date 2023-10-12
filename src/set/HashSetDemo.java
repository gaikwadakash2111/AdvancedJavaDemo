package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> hs=new HashSet<Integer>();
		
		hs.add(10);
		
		hs.add(20);
		
		hs.add(30);
		
		hs.add(40);
		
		hs.add(30);
		
		System.out.println(hs);
		// insertion order is not there....
		// duplicate values are not allowed...

	}

}
