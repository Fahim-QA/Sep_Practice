/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class HighestElement_InArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[] {99, 45, 100, 3, 12, 7, 66};
		
		int len = arr.length;
		
		int tmp; 
		
		for(int i=0; i<len-1; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]>arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		 System.out.println("Highest Element is = "+arr[len-1]);
	}

}
