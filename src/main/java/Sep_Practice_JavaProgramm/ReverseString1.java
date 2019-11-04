/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class ReverseString1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "java";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			System.out.println(str.charAt(i));
			
		}
		
	}

}
