import java.util.*;

public class QuadraticEquationSolver {
	
	// Solve the quadratic equation
	
	
	public static void solve(double a, double b, double c) {
		
		if (b == 0 && c == 0) {
			System.out.println("Root: 0");
			return;
		}
		
		double discriminant = b * b - 4 * a * c;
		
		if (discriminant < 0) {
			
			System.out.println("No real roots");
		} else if (discriminant == 0) {
			
			double root = (-b) / (2 * a);
			System.out.println("One repeated root: " + root);
		} else {
			double root1 = ((-1) * b - Math.sqrt(discriminant)) / (2 * a);
			double root2 = ((-1) * b + Math.sqrt(discriminant)) / (2 * a);
			
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		double a = sc.nextDouble();
		if (a == 0) {
			System.out.println("Not quadratic equation");
			return;
		}
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		
		print(a, b, c);
		solve(a, b, c);
	}
	
	static void print(double a, double b, double c) {
		// fix minus and pilus
		//System.out.println("Equation: " + a + " * x^2" + (b < 0 ? " - " : " + ") + Math.abs(b) + " * x" + (c < 0 ? " - " : " + ") + Math.abs(c) + " = 0");
		
		// fix general(minus, pilus and zero cases)
		System.out.println("Equation: " + a + " * x^2" + (b == 0 ? "" : (b < 0 ? " - " : " + ") + Math.abs(b) + " * x") + (c == 0 ? "" : (c < 0 ? " - " : " + ") + Math.abs(c)) + " = 0");
	}
}