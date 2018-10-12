/*This class contains a main method and interacts with users
 * @author Shoh Mollenkamp
 * @version 10/9/2018
 */
import java.util.*;
public class QuadraticClient {
	public static void main(String[] args) {
		boolean done=false;
		Scanner console = new Scanner(System.in);
		while (done==false) {
			System.out.print("Wewlcome. Please enter coefficients a, b, and c ");
			System.out.print("of the quadratic function \"ax^2 + bx + c\"");
			System.out.println(" to get the description of the graph." );
			System.out.println("");
			System.out.println("a: ");
			double a = console.nextDouble();
			System.out.println("b: ");
			double b = console.nextDouble();
			System.out.println("c: ");
			double c = console.nextDouble();
			System.out.println("");
			System.out.println("Description of the graph:");
			System.out.println("y = "+ a +"x^2 + "+ b +"x + "+ c);
			System.out.println("");
			System.out.println(Quadratic.quadrDescriber(a,b,c));
			System.out.println("");
			System.out.println("Do you want to keep going?(Type \"quit\" to end)");
			String continuance = console.next();
			if(continuance=="quit") {
				done=true;
			}
		}
		console.close();
	}


}
