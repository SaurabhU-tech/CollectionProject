package collectionPackage;

import java.util.ArrayList;
import java.util.Collection;

public class Lists {

	public static final Collection<? extends String> al = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[] = {};
		ArrayList al = new ArrayList(); //Untype Safe
		al.add(17);
		al.add("Saurabh");
		al.add(22.789);
		al.add(true);
		al.add(22);
		al.add(02);
		al.add(17);
		System.out.println(al);
		System.out.println(al.contains("Saurabh"));
		System.out.println(al.equals(22));
		System.out.println(al.get(1));
		System.out.println(al.clone());
		System.out.println(al.getClass());
		System.out.println(al.indexOf(22));
//		al.clear();
		System.out.println(al.isEmpty());
//		System.out.println(al);
		System.out.println(al.lastIndexOf(17));
		al.remove(3);
		System.out.println(al);
		al.remove(22.789);
		System.out.println(al);
		al.set(0, "Dad");
		System.out.println(al);
		al.add(0, 007);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.subList(2, 4));
//		System.out.println(al.toArray());
//		System.out.println(al.toString());
		
		
		ArrayList<String> al1 = new ArrayList<String>(); //type Safe
		al1.add("Hello");
		System.out.println(al1);
		al1.add(0, "asd");
		al1.add("zyan");
		al1.add("World");
		System.out.println(al1);
		al.addAll(2, al1);
		System.out.println(al);
		System.out.println(al.containsAll(al1));
		System.out.println(al1.get(1));
		System.out.println(al1.getClass());
		System.out.println(al1.hashCode());
		System.out.println(al1.indexOf("asd"));
		System.out.println(al1.isEmpty());
		System.out.println(al1.iterator());
		System.out.println(al1.lastIndexOf("asd"));
		System.out.println(al.retainAll(al1));
		System.out.println(al1.subList(1, 3));
		
		Object[] objects = al1.toArray();
		for(Object obj : objects) {
			System.out.print(obj+" ");
		}
		System.out.print("\n");
		System.out.println(al1.toString());
		
		//convert array element into string
		String listString = "";

		for (String s : al1)
		{
		    listString += s + "\t";
		}

		System.out.println(listString);
	}

}
