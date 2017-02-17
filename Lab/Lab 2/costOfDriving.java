
/**
 * Write a description of class costOfDriving here.
 * Calculates the cost of driving a distance 
 * @author Xavier Tilley
 * @version 2/3/17
 */
import java.util.Scanner;

public class costOfDriving {
  public static void main(String[] args) {
    System.out.print("Enter the driving distance: ");
    Scanner input = new Scanner(System.in);
    double distance = input.nextDouble();
    System.out.print("Enter the miles per gallon: ");
    double mpg = input.nextDouble();
    System.out.print("Enter the price per gallon: ");
    double ppg = input.nextDouble();   

    double totalCost = distance / mpg * ppg;
    System.out.println("The cost of driving is $" + Math.round(totalCost * 100.0)/100.0);
  }
}