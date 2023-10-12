package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> hm=new HashMap<String, Integer>();
		
		hm.put("kaij", 431123);
		
		hm.put("pune", 411041);
		
		hm.put("mumbai", 425688);
		
		//hm.put("mumbai", 785695);
		
		hm.put("satara", 431123);
		
		System.out.println(hm);
		// duplicate keys are not allowed...
		// duplicates values are allowed
		
		}

}
