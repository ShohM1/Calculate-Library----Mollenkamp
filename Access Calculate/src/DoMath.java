/* This class is client code that uses the Calculate Library
 *  to perform various mathematics tasks.
 * @author Shoh Mollenkamp
 * @version September 6 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5,10,15));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(180));
		Calculate.toImproperFrac(10,4,9);
		Calculate.toMixedNum(19,3);
		Calculate.foil(1, 4, 3, 4, "n");
		System.out.println(Calculate.isDivisibleBy(11,3));
		System.out.println(Calculate.absValue(-4.3));
		System.out.println(Calculate.max(-1, 3));
		
	}

}