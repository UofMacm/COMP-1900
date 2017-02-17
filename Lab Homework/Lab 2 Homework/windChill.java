
/**
 * Write a description of class windChill here.
 * Calculates the wind chill based on the ambient temperature and the wind speed.
 * @author Xavier Tilley
 * @version 2-10-17
 */
import java.util.Scanner;

public class windChill {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declare varibles and constants
    double temperature, windSpeed, windChill;
    final String DEGREE  = "\u00b0";

    // Prompt user for input and assign that value to a varible
    System.out.print("Enter the temperature in Fahrenheit between -58"+ DEGREE + "F and 41" + DEGREE + "F: ");
    temperature = input.nextDouble();
    
    System.out.print("Enter the wind speed (>=2) in miles per hour: ");
    windSpeed = input.nextDouble();

    // Do the math thing
    windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

    // Print the results
    System.out.println("The wind chill index is " + windChill);
  }
}