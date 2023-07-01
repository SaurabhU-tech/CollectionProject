package collectionPackage;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		//Untype Safe collection
		TreeSet ts = new TreeSet();
		ts.add(20);
		ts.add(30);
		ts.add(20);
		ts.add(22);
		ts.add(10);
		System.out.println(ts);
		ts.remove(20);
		System.out.println(ts);
	}

}
