
/**
 * Write a description of class areaOfPentagon here.
 * Calculates the area of a pentagon
 * @author Xavier Tilley
 * @version 2-17-17
 */
import java.util.Scanner;

public class areaOfPentagon {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt for input
    System.out.print("Enter the length from the center to a vertex: ");
    double radius = input.nextDouble();

    // Do the math
    double side = 2 * radius * Math.sin(Math.PI/5);
    double area = (5 * Math.pow(side, 2))/(4 * Math.tan(Math.PI/5));

    // Print it out
    System.out.printf("The area of the pentagon is %.2f", area);
  }
}