package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class TransversingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Saurabh");
		al.add("Ninad");
		al.add("Akash");
		al.add("Nikhil");
		System.out.println(al);
		System.out.println(al.get(1));
		
		//Traverse using for-each loop
		for(String s: al) {
			System.out.println(s+"\t"+s.length()+"\t");
			StringBuffer br = new StringBuffer(s);
			System.out.println(br.reverse());
		}
		//Traverse using iterator
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
	}

}
