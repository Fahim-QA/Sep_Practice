package Sep_Practice_JavaProgramm;

public class SmallestElement_InArray {
	
	public static void main(String[] args) {
		int[] arr = new int[] {56, 2, 1, 67, 44, 99};
		int temp;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		 System.out.println("Smallest Element is = "+arr[arr.length-1]);
	}

}
