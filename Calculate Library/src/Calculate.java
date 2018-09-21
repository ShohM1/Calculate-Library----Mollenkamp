/* This class contain methods that perform various math operations
 * @author Shoh Mollenkamp
 * @version September 17 2018
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
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		//return improper fraction from mixedNum
		 System.out.println( ((whole*denominator)+numerator)+ "/" + denominator);
		 return null;
		
	}
	public static String toMixedNum(int numerator, int denominator) {
		//return mixedNum from impropFrac
		System.out.println(numerator/denominator + "_" + numerator%denominator +"/" + denominator);
		return null;
	}
	public static String foil(int a,int b, int c, int d,String var) {
		//return results of foil method
		System.out.println((a*c)+var + "^2 + " + (a*d + b*c) + var+ " + "+ b*d );
		return null;
	}
	public static boolean isDivisibleBy (int a, int b) {
		//determine if integer is divisible or not
		boolean Divisible= a%b == 0;
		return Divisible;
	}
	public static double absValue (double number) {
		if(number<0) {
			number=-number;}
		return number;
	}
	public static double max (double number1,double number2) {
		if(number1>=number2) {
			return number1;
		} else {
			return number2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		//return highest of 3
		double answer=0; 
		if(num1>=num2) {
			if(num1>=num3) {
				answer = num1;	
			}else { 
				answer = num3;
			}
		}else {
			if(num2>=num3) {
				answer = num2;
			}else {
				answer = num3;
			}
		}
		return answer;
	}
	public static double min (double num1, double num2) {
		if(num1>=num2) {
			return num2;
		}else {
			return num1;
		}
	}
	
	public static double round2 (double number) {
		number = number*1000;
		number= (int)number;
		int thirdDecimal;
		thirdDecimal = (int)number % 10;
		number = number/10;
		number = (int)(double)(int)number;
		number = (double)number/100;
		if(thirdDecimal>=5) {
			number = number + 0.01;
		}
		return number;
	}
	public static double exponent (double number, int exponent) {
		double answer=1;
		for (int i = 1; i<=exponent; i++) {
			answer = answer*number;
		}
		return answer;
	}
	public static int factorial (int number) {
		//number!
		int answer = 1;
		for (int i=number; i>=1; i--) {
			answer = answer*i;
		}
		return answer;
	}
	public static boolean isPrime (int number) {
		//see if it's divisible by variables other than itself and 1 
		absValue(number);
		int divisor=number-1;
		while(isDivisibleBy(number, divisor)==false) {
			divisor--;
		}
		if(divisor==1) {
			return true;
		}else {
			return false;
		}
	}
	public static int gcf(int num1, int num2) {
		//finds greatest common factor
		int divisor=num1;
		while(isDivisibleBy(num1, divisor)==false||isDivisibleBy(num2,divisor)==false){
			divisor--;
		}
		return divisor;
	}
	public static double sqrt(double number) {
		double answer=0;
		while((answer*answer)<number) {
		answer = answer+0.001;
		}
		answer = round2(answer);
		return answer;
	}
}

