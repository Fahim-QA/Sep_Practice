/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class IntegerReverse {
	
	public static void main(String[] args) {
		
		int num = 12345;
		
		int rev = 0;
		
		while(num!=0) {
			
			int digit = num%10;
			
			rev = rev*10+digit;
			
			num = num/10;
			
		}
		   System.out.println("Reverse Number is = "+rev);
	}

}
