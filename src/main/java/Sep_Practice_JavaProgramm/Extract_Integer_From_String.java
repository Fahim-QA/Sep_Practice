/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class Extract_Integer_From_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "345Hello";
		
		String replaceInt = str.replaceAll("[^0-9]", "");
		
		System.out.println(replaceInt);

	}

}
