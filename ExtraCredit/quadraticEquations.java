
/**
 * Write a description of class quadraticEquation here.
 * Finds the real roots of a quadratic equation
 * @author Xavier Tilley
 * @version 2-10-17
 */
import java.util.Scanner;

public class quadraticEquations {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declare varibles
    double a, b, c, discriminant, root1, root2;
    a = 0;
    b = 0;
    c = 0;
    discriminant = 0;
    root1 = 0;
    root2 = 0;
    
    // Gather inputs
    System.out.print("Enter a, b, c: ");
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();

    // Determine the discriminant
    discriminant = Math.pow(b, 2) - 4 * a * c;

    // Find number of roots
    if (discriminant > 0) {
      root1 = (-(b) + Math.pow(discriminant, 0.5)) / (2 * a);
      root2 = (-(b) - Math.pow(discriminant, 0.5)) / (2 * a);
      System.out.println("The equation has two roots " + root1 + " and " + root2);
    }else if (discriminant == 0) {
      root1 = (-(b) / (2 * a));
      System.out.println("The equation has one root " + root1);
    }else{
      System.out.println("The equation has no real roots");
    }
  }
}
