public class Equation {
	
	// Solve the quadratic equation
	
	
	public static void quadraticEquation(double a, double b, double c) {
		
		double discriminant = b * b - 4 * a * c;
		System.out.println("Discriminant : " + discriminant);
		
		if (discriminant < 0) {
			
			System.out.println("No real roots");
		} else if (discriminant == 0) {
			
			double root = (-b) / (2 * a);
			System.out.println("One repeated root: " + root);
		} else {
			double root1 = ((-1) * b - Math.sqrt(discriminant)) / (2 * a);
			double root2 = ((-1) * b + Math.sqrt(discriminant)) / (2 * a);
			
			System.out.println("Root1 : " + root1);
			System.out.println("Root2 : " + root2);
		}
		
	}
	
	public static void main(String[] args) {
		
		quadraticEquation(1, -3, 2);
		quadraticEquation(1, 3, 2);
		quadraticEquation(1, -1, -6);
		
		quadraticEquation(1, -2, 1);
		quadraticEquation(1, 4, 4);
		
		quadraticEquation(1, 1, 1);
		quadraticEquation(1, 10, 100);
		
		quadraticEquation(1, 0, -4);
		quadraticEquation(1, -5, 0);
		quadraticEquation(1, 0, 0);
		quadraticEquation(-1, 5, -6);
	}
}