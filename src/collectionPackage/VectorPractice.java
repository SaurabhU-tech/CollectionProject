package collectionPackage;

import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		//Type safe Vector
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(8);
		vector.add(9);
		System.out.println(vector);
		System.out.println(vector.capacity());
		vector.insertElementAt(10, 0);
		System.out.println(vector);

	}

}
