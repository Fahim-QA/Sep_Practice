/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class FrequencyChracter_InString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "selenium";
		char ch = 'e';
		int count=0;
		for(int i=0; i<str.length()-1; i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
		} 
		System.out.println(ch+" "+count);
	}

}
