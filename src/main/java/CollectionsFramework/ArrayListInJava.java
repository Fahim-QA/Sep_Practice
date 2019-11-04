package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {

		ArrayList<String> obj = new ArrayList<String>();         //  Data retrieving is faster than LinkedList

		obj.add("A");
		obj.add("G");
		obj.add("A");
		obj.add("C");
		
		System.out.println(obj);

		ArrayList<String> obj1 = new ArrayList<String>();

		obj1.add("H");
		obj1.add("K");
		obj1.add("C");
		obj1.add("L");

		/*System.out.println("List of elements "+obj);

		obj.add("B");

		System.out.println("After adding element "+obj);

		obj.remove(2);

		System.out.println("After removing element "+obj);*/

		obj.addAll(obj1);
		
		System.out.println(obj);

		/*obj.removeAll(obj);

		System.out.println(obj);*/


	}

}
