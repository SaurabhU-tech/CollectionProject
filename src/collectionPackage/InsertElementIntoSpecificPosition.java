package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class InsertElementIntoSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add("saurabh");
		System.out.println(al);
		al.add(2, 5);
		// InsertElementIntoSpecificPosition
		System.out.println(al);
		// remove a specific element from an array
		al.remove("saurabh");
		System.out.println(al);
		al.add(6);
		al.add(2);
		al.add(4);
		al.add(2);
		System.out.println(al);
		//merge the elements of two array in one array.
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(9);
		al1.add(8);
		al1.addAll(al);
		System.out.println(al1);
		
	}

}
