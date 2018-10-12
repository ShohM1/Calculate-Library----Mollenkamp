//This class contains method to describe quadratic
public class Quadratic {
	public static double discriminant (double a, double b, double c) {
		//return discriminant of the equation
		double answer;
		answer = b*b-(4*a*c);
		return answer;
	}
	public static double max (double number1,double number2) {
		//return higher number of 2
		if(number1>=number2) {
			return number1;
		} else {
			return number2;
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
	public static String quadForm(double a, double b, double c) {
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
	
		
	
	public static String quadrDescriber (double a, double b, double c) {
		String directionOpen = "Opens: up";
		if(a<0) {
			directionOpen="Opens: down";
		}
		double vertexX=round2(-b/(2*a));
		double vertexY=round2(a*vertexX*vertexX+c);
		String axisSym = "Axis of Symmetry: " + round2(vertexX);
		String vertexLocation = "Vertex: ("+vertexX+", "+vertexY+")";
		String xIntercept = "x-intercept(s): "+quadForm(a,b,c);
		String yIntercept = "y-intercept: "+c;
		return directionOpen+"\n"+axisSym+"\n"+vertexLocation+"\n" + xIntercept+"\n"+ yIntercept;
	}
}
