/**
 * 
 */
package Sep_Practice_JavaOops;

/**
 * @author Fahim
 *
 *private methods and data members can not be inherited
 *
 *Final members and methods can be accessed
 *
 */
public class InheritanceInJava4 extends InheritanceInJava3 {
	
	public static void main(String[] args) {
		InheritanceInJava4 obj = new InheritanceInJava4();
		
		System.out.println(obj.i);
		
		System.out.println(obj.j);
		
		System.out.println(obj.l);
		
		System.out.println(obj.f);
		
		obj.test1();
		
		obj.test2();
		
		obj.test4();
		
		obj.test5();
	}

}
