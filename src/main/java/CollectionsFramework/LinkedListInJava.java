/**
 * 
 */
package CollectionsFramework;

import java.util.LinkedList;

/**
 * @author Fahim
 *
 */
public class LinkedListInJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<Integer> obj = new LinkedList<Integer>();    // Data manipulation is faster than ArrayList
		
		obj.add(12);
		obj.add(88);
		obj.add(77);
		
		System.out.println(obj);
	}

}
