package collectionPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		// Untype Safe
		HashMap hm = new HashMap();
		hm.put(1, "Sauranh");
		hm.put(2, "Rocky");
		hm.put(3, "Gaurav");
		hm.put(4, "Jay");
		hm.putIfAbsent(1, "Joy");
		hm.putIfAbsent(5, "Locky");
		System.out.println(hm);
		hm.remove(2);
		System.out.println(hm);
		
		//Type Safe
		LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<Integer,Character>();
		lhm.putAll(hm);
		System.out.println(lhm);
		lhm.put(2, 'A');
		System.out.println(lhm);
	}

}
