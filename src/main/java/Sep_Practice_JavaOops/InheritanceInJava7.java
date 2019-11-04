/**
 * 
 */
package Sep_Practice_JavaOops;

/**
 * @author Fahim
 *
 */
public class InheritanceInJava7 extends InheritanceInJava2 {
	
	public static void main(String[] args) {
		
		InheritanceInJava7 obj = new InheritanceInJava7();
		
		obj.test1();
		
		obj.test2();
		
		obj.test1();
		
	}
	
	public void test1() {
		System.out.println("test1() from class InheritanceInJava7");
	}

}
