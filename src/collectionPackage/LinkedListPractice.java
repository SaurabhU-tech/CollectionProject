package collectionPackage;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();  
		//Untype safe
		list.add("asd");
		list.add("jhj");
		list.add("klkl");
		list.add(1234);
		list.add(true);
		System.out.println(list);
		
		//Different operations on ArrayList
		list.remove("jhj");
		System.out.println(list);
		System.out.println("Size = " +list.size());
		System.out.println(list.contains("Sumit"));
		list.set(1, "Saumya"); //replace the element
		list.add(0, "Satya"); //add the element
		System.out.println(list);
		
		list.push(33.98);
		System.out.println(list);
		list.pop();
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.poll());
		System.out.println(list);
		list.offer(44.23);
		list.offerFirst("Urkude");
		list.offerLast(007);
		System.out.println(list);
		
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();  
		//type safe
		l1.add(66);
		l1.add(43);
		l1.add(88);
		System.out.println(l1);
		
	}

}
