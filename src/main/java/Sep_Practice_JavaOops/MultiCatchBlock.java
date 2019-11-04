/**
 * 
 */
package Sep_Practice_JavaOops;

/**
 * @author Fahim
 *
 */
public class MultiCatchBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		}  catch (NullPointerException e) {
			System.out.println("NullPointerException occurs");
		} 
		
		System.out.println("testis running evenafter exception ocuur");
	}

}
