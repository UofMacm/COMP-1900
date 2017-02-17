
/**
 * Write a description of class gratuity here.
 * Calculates the gratuity and total of a bill.
 * 
 * @author Xavier Tilley
 * @version 2/3/17
 */
import java.util.Scanner;

public class gratuity {
  public static void main(String[] args) {
    System.out.print("Enter the subtotal and a gratuity rate: ");
    Scanner input = new Scanner(System.in);
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble() /100;
    double gratuityAmt = subtotal * gratuityRate;
    double total = subtotal + gratuityAmt;
    
    System.out.printf ("The gratuity is : $" + Math.round(gratuityAmt*100.0)/100.0 + " and total is: $" + Math.round(total*100.0)/100.0);
}
}