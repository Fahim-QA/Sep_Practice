/**
 * 
 */
package Sep_Practice_JavaOops;

/**
 * @author Fahim
 *
 */
public class ExceptionHandling_InJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int i=4/0;
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("4 can not be divided by 0");
		}
	}

}
