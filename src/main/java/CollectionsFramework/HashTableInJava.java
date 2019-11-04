/**
 * 
 */
package CollectionsFramework;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Fahim
 *
 */
public class HashTableInJava {
	
	public static void main(String[] args) {
		
		Map<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(12, "Umair");
		ht.put(8, "Alina");
		ht.put(34, "Umair");
		//ht.put(2, null);            // Does not contain null vales
		ht.put(12, "Fahim");
		//ht.put(null, "Fahim");      // Does not contain null key
		
		for(Map.Entry<Integer, String> m : ht.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		
	}

}
