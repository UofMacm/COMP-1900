
/**
 * Write a description of class hexToBinary here.
 * Converts hex to binary
 * @author Xavier Tilley
 * @version 2-17-17
 */
import java.util.Scanner;

public class hexToBinary {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt for input
    System.out.print("Enter a hexadecimal digit: ");
    String hex = input.next();
    String bin = " ";
    
    switch (hex) {
      case "0":
      case "1": bin = hex;
        System.out.println("The binary value is " + bin);
        break;
      case "2": bin = "10";
        System.out.println("The binary value is " + bin);
        break;
      case "3": bin = "11";
        System.out.println("The binary value is " + bin);
        break;
      case "4": bin = "100";
        System.out.println("The binary value is " + bin);
        break;
      case "5": bin = "101";
        System.out.println("The binary value is " + bin);
        break;
      case "6": bin = "110";
        System.out.println("The binary value is " + bin);
        break;
      case "7": bin = "111";
        System.out.println("The binary value is " + bin);
        break;
      case "8": bin = "1000";
        System.out.println("The binary value is " + bin);
        break;
      case "9": bin = "1001";
        System.out.println("The binary value is " + bin);
        break;
      case "A": bin = "1010";
        System.out.println("The binary value is " + bin);
        break;
      case "B": bin = "1011";
        System.out.println("The binary value is " + bin);
        break;
      case "C": bin = "1100";
        System.out.println("The binary value is " + bin);
        break;
      case "D": bin = "1101";
        System.out.println("The binary value is " + bin);
        break;
      case "E": bin = "1110";
        System.out.println("The binary value is " + bin);
        break;
      case "F": bin = "1111";
        System.out.println("The binary value is " + bin);
        break;
      default: System.out.println(hex + " is an invalid input");
    }
  }
}

