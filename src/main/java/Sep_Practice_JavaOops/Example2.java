/**
 * 
 */
package Sep_Practice_JavaOops;

/**
 * @author Fahim
 *
 */
public class Example2 extends Example1 {
	
	public static void main(String[] args) {
		Example1 obj = new Example2();
		obj.test();
	}
	
	public void test() {
		System.out.println("test() from child class");
	}

}
