/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 1234;
		
		int rev = 0;
		
		while(n!=0) {
			
			int d = n%10;
			
			rev = rev*10+d;
			
			n=n/10;
			
		}
		   System.out.println("Reverse of Number "+rev);
	}

}
