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
		//return discriminant of the equation
		double answer;
		answer = b*b-(4*a*c);
		return answer;
	}
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		//return improper fraction from mixedNum
		 return ((whole*denominator)+numerator)+ "/" + denominator;
	}
	public static String toMixedNum(int numerator, int denominator) {
		//return mixedNum from impropFrac
		return numerator/denominator + "_" + numerator%denominator +"/" + denominator;
	}
	public static String foil(int a,int b, int c, int d,String var) {
		//return results of foil method
		return (a*c)+ var + "^2 + " + (a*d)+(b*c) + var + " + " + (b*d);
	}
	public static boolean isDivisibleBy (int number, int divisor) {
		//determine if integer is divisible or not
		if(divisor==0) throw new IllegalArgumentException("Cannot divide by 0");
		boolean Divisible= number%divisor == 0;
		return Divisible;
	}
	public static double absValue (double number) {
		//take the absolute value of the number by making negative positive
		if(number<0) {
			number=-number;}
		return number;
	}
	public static double max (double number1,double number2) {
		//return higher number of 2
		if(number1>=number2) {
			return number1;
		} else {
			return number2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		//return highest of 3 by comparing each value
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
	public static int min (int num1, int num2) {
		//return lower number of two
		if(num1>=num2) {
			return num2;
		}else {
			return num1;
		}
	}
	public static double min (double num1, double num2) {
		//return lower number of two
		if(num1>=num2) {
			return num2;
		}else {
			return num1;
		}
	}
	public static double round2 (double number) {
		//round the value to two decimal points by truncating values after two decimals
		if(number>0) {
			number +=0.005;
		}else {
			number -=0.005;
		}
		number*=100;
		number= (double)(int)number;
		number/=100;
		return number;
	}
	public static double exponent (double number, int exponent) {
		//return value of exponent by keep multiplying the number for exponent numbers of time
		if(exponent<0) throw new IllegalArgumentException("this method does not accept negative exponent");
		double answer=1;
		for (int i = 1; i<=exponent; i++) {
			answer = answer*number;
		}
		return answer;
	}
	public static int factorial (int number) {
		//number! by multiplying numbers right below until multiplying to 1
		if(number<0)throw new IllegalArgumentException("Negative numbers do not have factorial");
		int answer = 1;
		for (int i=number; i>=1; i--) {
			answer = answer*i;
		}
		return answer;
	}
	public static boolean isPrime (int number) {
		//see if it's divisible by variables other than itself and 1 
		int divisor=number-1;
		if(number<=1) {
			divisor=1;
		}
		while(isDivisibleBy(number, divisor)==false) {
			divisor--;
		}
		if(divisor==1) {
			if(number<=1) {
				return false;
			}else {
				return true;
			}
		}else {
			return false;
		}
	}
	public static int gcf(int num1, int num2) {
		//finds greatest common factor by checking the divisibility of both values
		num1= (int) absValue(num1);
		num2= (int) absValue(num2);
		int divisor=num1;
		if(num1==0) {
			divisor=num2;
		}else{
			while(isDivisibleBy(num1, divisor)==false||isDivisibleBy(num2,divisor)==false){
		
			divisor--;
			}
		}
		return divisor;
	}
	public static double sqrt(double number) {
		//return square root by multiplying a number until square is equal to the origle number and then round2
		if(number<0) throw new IllegalArgumentException("no real solution");
		double answer=0;
		while((answer*answer)<number) {
		answer = answer+0.001;
		}
		answer = round2(answer);
		return answer;
	}
	public static String quadForm(int a, int b, int c) {
		//return the roots of a quadratic equation by applying quadratic formula
		double root1=0;
		double root2=0;
		if(a==0)throw new IllegalArgumentException("not quadratic");
		if(discriminant(a,b,c)<0) {
			return "no real roots";
		}else {
			root1=(-b+sqrt(discriminant(a,b,c)))/(2*a);
			root2=(-b-sqrt(discriminant(a,b,c)))/(2*a);
			round2(root1);
			round2(root2);
			if(root1==root2) {
				return round2(root1)+"";
			}else {
				return round2(min(root1,root2)) + " and " + round2(max(root1,root2));
			}
		}
		
	}
}

