/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class DuplicateElements_InArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[] {11, 55, 39, 77, 11, 90, 45, 2, 77};
		
		int len = arr.length;
		
		for(int i=0; i<len-1; i++) {
			
			for(int j=i+1; j<len; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("Duplicate Elements = "+arr[i]);
					
				}
				
			}
			
		}

	}

}
