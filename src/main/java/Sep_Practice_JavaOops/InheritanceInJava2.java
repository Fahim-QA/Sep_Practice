/**
 * 
 */
package Sep_Practice_JavaOops;

/**
 * @author Fahim
 *
 */
public class InheritanceInJava2 extends InheritanceInJava {
	
	public static void main(String args[]) {
		
		InheritanceInJava obj = new InheritanceInJava2();
		
		obj.test1();
		
		obj.test2();
		
		System.out.println(obj.a);
		
	}
	
	
	public void test1() {
		System.out.println("test1() non static method from class InheritanceInJava2");
	}

}
