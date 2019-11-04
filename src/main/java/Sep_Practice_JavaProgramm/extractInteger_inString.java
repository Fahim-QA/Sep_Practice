/**
 * 
 */
package Sep_Practice_JavaProgramm;

import org.testng.annotations.Test;

/**
 * @author Fahim
 *
 */
public class extractInteger_inString {
	
	@Test
	public void extract_number() {
		
		String str = "Hi145Java";
		
		String n = str.replaceAll("[^0-9]", "");
		
		System.out.println(n);

	}
	
	 public static extractInteger_inString()
	{
		
	}
}
