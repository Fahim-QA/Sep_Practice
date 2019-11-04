/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class FrequencyChracters_InString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "javaprogramm";
		char[] ch = str.toCharArray();
		for(int i=0; i<str.length()-1; i++) {
			int count=0;
			for(int j=0; j<str.length(); j++) {
				if(j<i&&(ch[j]==ch[i])) {
					break;
				}
				if(ch[j]==ch[i]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch[i]+" "+count++);
			}
		} 
	}

}
