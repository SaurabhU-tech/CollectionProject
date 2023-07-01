package collectionPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		//Type Safe Collection
		HashSet<Double> hs = new HashSet<Double>();
		HashSet<Double> hs2 = new HashSet<Double>();
		hs.add(43.0);
		hs.add(21.90);
		hs.add(9.45);
		hs2.add(43.0);
		hs2.add(21.90);
		hs2.add(9.45);
		System.out.println(hs);
		System.out.println(hs.contains(43.0));
		System.out.println(hs.equals(hs2));
		String s = hs.toString();
		System.out.println(s);
		
		//Untype safe Collection
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(22);
		lhs.add(10);
		lhs.add(2);
		lhs.add(12);
		lhs.add("Saurabh");
		System.out.println(lhs);
	}

}
