/**
 * 
 */
package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fahim
 *
 */
public class HashMapInJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "uid");
		map.put(6, "name");
		map.put(3, "age");
		map.put(5, "city");
		 
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
