/**
 * 
 */
package Sep_Practice_JavaProgramm;

/**
 * @author Fahim
 *
 */
public class SmallestElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[] {34, 12, 55, 1, 12, 2, 0, 4};
		int tmp;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]<=arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}	
			
		}  System.out.println(arr[arr.length-1]);
		
	}

}
