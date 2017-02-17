
/**
 * Write a description of class perimeter here.
 * Finds the perimeter of the triangle
 * @author Xavier Tilley
 * @version 2-10-17
 */
import java.util.Scanner;

public class perimeter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Declare varibles
    double edge1, edge2, edge3, sum;

    edge1 = 0; 
    edge2 = 0;
    edge3 = 0;
    sum = 0;
    // Gather input and assign it to varibles
    System.out.print(" Enter the edges of the triangle: ");
    edge1 = input.nextDouble();
    edge2 = input.nextDouble();
    edge3 = input.nextDouble();
    
    // Test inputs
    if ((edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge3 + edge1 > edge2)) {
      sum = edge1 + edge2 + edge3;
      System.out.println ("The perimeter of that triangle is " + sum);
    }else{
      System.out.println("Your input is invalid");
    }
    }
  }