
/**
 * Write a description of class feetToMeters here.
 * Converts user input feet into meters.
 * 
 * @author Xavier Tilley
 * @version 2/3/17
 */
// Import Scanner to read input
import java.util.Scanner;

public class feetToMeters {
  public static void main(String[] args) {
    System.out.print("Enter number of feet: "); // Input prompt
    Scanner input = new Scanner(System.in); 
    double feet = input.nextDouble(); // assign input to varible
    double meters; // declare meter varible
    meters = feet * 0.305; // math
    System.out.println( feet + " feet is equal to " + meters + " meters."); // print the results
  }
}
