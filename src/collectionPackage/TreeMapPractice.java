package collectionPackage;

import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		//Type Safe
		TreeMap<String, Boolean> tm = new TreeMap<String, Boolean>();
		tm.put("Winner", true);
		tm.put("Looser", false);
		System.out.println(tm);
		System.out.println(tm.values());
		System.out.println(tm.lastKey());

	}

}
