/**
 * 
 */
package Sep_Practice_JavaOops;

/**
 * @author Fahim
 *
 */
public class InheritanceInJava3 {
	
	int i=10;
	
	public int j=20;
	
	private int k=30;
	
	protected int l=40;
	
	final public int f=50;

	public void test1() {
		System.out.println("test1() as public from class InheritanceInJava3");
	}

	void test2() {
		System.out.println("test2() as default from class InheritanceInJava3");
	}

	private void test3() {
		System.out.println("test3() as private from class InheritanceInJava3");
	}

	protected void test4() {
		System.out.println("test4() as protected from class InheritanceInJava3");
	}
	
	final public void test5() {
		System.out.println("test5() as final from class InheritanceInJava3");
	}

}
