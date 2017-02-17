
/**
 * Write a description of class decimalToHex here.
 * Converts decimal input to hex
 * @author Xavier Tilley
 * @version 2-17-17
 */
import java.util.Scanner;

public class decimalToHex {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt for input
    System.out.print("Enter a decimal value (0 to 15): ");
    String decimal = input.next();
    String hex = " ";
    
    switch (decimal){
      case "0":
      case "1":
      case "2":
      case "3":
      case "4":
      case "5":
      case "6":
      case "7":
      case "8":
      case "9": hex = decimal;
        System.out.println("The hex value is " + hex);
        break;
      case "10": hex = "A";
        System.out.println("The hex value is " + hex);
        break;
      case "11": hex = "B";
        System.out.println("The hex value is " + hex);
        break;
      case "12": hex = "C";
        System.out.println("The hex value is " + hex);
        break;
      case "13": hex = "D";
        System.out.println("The hex value is " + hex);
        break;
      case "14": hex = "E";
        System.out.println("The hex value is " + hex);
        break;
      case "15": hex = "F";
        System.out.println("The hex value is " + hex);
        break;
      default: System.out.println(decimal + " is an invalid input");
    }
  }
}
