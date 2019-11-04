/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class FinallyInJava {
	
	public static void main(String[] args) {
		
		try {
			int a = 7/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally-->I will execute");
		}
	}

}
