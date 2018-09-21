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
		System.out.println(Calculate.max(-1, 4));
		System.out.println(Calculate.max(-1,-2,-3));
		System.out.println(Calculate.min(1,2));
		System.out.println(Calculate.round2(2.4494));
		System.out.println(Calculate.exponent(-2, 9));
		System.out.println(Calculate.factorial(6));
		System.out.println(Calculate.isPrime(1009));
		System.out.println(Calculate.gcf(27, 21));
		System.out.println(Calculate.sqrt(6));
	}
}
