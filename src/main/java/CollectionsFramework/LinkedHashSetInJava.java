/**
 * 
 */
package CollectionsFramework;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Fahim
 *
 */
public class LinkedHashSetInJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(22);
		lhs.add(56);
		lhs.add(44);
		lhs.add(76);
		lhs.add(22);
		
		System.out.println(lhs);
		
	}

}
