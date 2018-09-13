/* This class contain methods that perform various math operations
 * @author Shoh Mollenkamp
 * @version September 6 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int number) { 
		int answer; 
		answer = number*number;
		return answer;
		//return number*number
	} 
	public static int cube(int number) {
		//returns the cube of the input
		int answer;
		answer = number*number*number;
		return answer;
		//return number*number*number	
	}
	public static double average (double number1, double number2) {
		//return the average of the two numbers
		double answer;
		answer = (number1+number2)/2;
		return answer;
	}
	public static double average (double number1, double number2, double number3) {
		//return the average of three numbers
		double answer;
		answer = (number1+number2+number3)/3;
		return answer;
	}
	public static double toDegrees (double radians) {
		//return radians in degrees
		double answer;
		answer = (radians/3.14159)*180;
		return answer;
	}
	public static double toRadians (double degrees) {
		//return degrees in radians
		double answer;
		answer = (degrees/180)*3.14159;
		return answer;
	}
	public static double discriminant (double a, double b, double c) {
		//return discriminant
		double answer;
		answer = b*b-(4*a*c);
		return answer;
	}
	public static void toImproperFrac(int whole, int numerator, int denominator) {
		//return improper fraction from mixedNum
		System.out.println(((whole*denominator)+numerator)+ "/" + denominator);
	}
	public static void toMixedNum(int numerator, int denominator) {
		//return mixedNum from impropFrac
		System.out.println(numerator/denominator + "_" + numerator%denominator +"/" + denominator);
	}
	public static void foil(int a,int b, int c, int d, char variable) {
		//return results of foil method
		System.out.println((a*c) + variable + "^2 + " + (a*d + b*c) + variable+ " + "+ b*d );
	}
	
	
}
