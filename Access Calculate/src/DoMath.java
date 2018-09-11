/* This class is client code that uses the Calculate Library
 *  to perform various mathematics tasks.
 * @author Shoh Mollenkamp
 * @version September 6 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5,10));
		System.out.println(Calculate.average(5,10,15));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(180));
	}

}
