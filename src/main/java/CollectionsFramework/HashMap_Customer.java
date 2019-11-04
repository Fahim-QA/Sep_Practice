/**
 * 
 */
package CollectionsFramework;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Fahim
 *
 */
public class HashMap_Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, Customer> map = new HashMap<Integer, Customer>();
		
		map.put(1, new Customer("Fahim Ahmad", 34));
		
		for(Entry<Integer, Customer> m : map.entrySet()) {
			
			System.out.println("uid: " +m.getKey()+" Name: "+m.getValue().name+" Age: "+m.getValue().age);
			
		}
		
	}

}
