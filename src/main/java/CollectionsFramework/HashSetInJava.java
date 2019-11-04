/**
 * 
 */
package CollectionsFramework;

import java.util.HashSet;

/**
 * @author Fahim
 *
 */
public class HashSetInJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(44);
		hs.add(19);
		hs.add(44);
		hs.add(34);
		
		System.out.println(hs);
		
	}

}
