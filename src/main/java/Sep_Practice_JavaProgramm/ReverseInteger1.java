/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class ReverseInteger1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 12345;
		
		int rev = 0;
		
		while(i!=0) {
			
			int x = i%10;
			
			rev = rev*10+x;
			
			i = i/10;
			
		}
		System.out.println("reverse number is = "+rev);
	}

}
