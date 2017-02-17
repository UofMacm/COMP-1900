
/**
 * Write a description of class ComputeChangeNonZero here.
 * Computes change
 * @author Xavier Tilley 
 * @version 2-17-17
 */
import java.util.Scanner;

public class ComputeChangeNonZero {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // varibles
    String dollarWord = " ";
    String quarterWord = " ";
    String dimeWord = " ";
    String nickelWord = " ";
    String pennyWord = " ";
    boolean printDollar = false;
    boolean printQuarter = false;
    boolean printDime = false;
    boolean printNickel = false;
    boolean printPenny = false;
    
    // Receive the amount
    System.out.print("Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();

    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;
      if (numberOfOneDollars > 1)
        dollarWord = "dollars";
      else
        dollarWord = "dollar";
      if (numberOfOneDollars != 0)
        printDollar = true;
        
    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;
      if (numberOfQuarters > 1)
        quarterWord = "quarters";
      else
        quarterWord = "quarter";
      if (numberOfQuarters != 0)
        printQuarter = true;
    
    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;
      if (numberOfDimes > 1)
        dimeWord = "dimes";
      else
        dimeWord = "dime";
      if (numberOfDimes != 0)
        printDime = true;
        
    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;
      if (numberOfNickels > 1)
        nickelWord = "nickels";
      else
        nickelWord = "nickel";
      if (numberOfNickels != 0)
        printNickel = true;
        
    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;
      if (numberOfPennies > 1)
        pennyWord = "pennies";
      else
        pennyWord = "penny";
      if (numberOfPennies != 0)
        printPenny = true;
    // Display Results
    System.out.println("Your amount " + amount + " consists of");
    if (printDollar)
      System.out.println("     " + numberOfOneDollars + " " + dollarWord);
    if (printQuarter)
      System.out.println("     " + numberOfQuarters + " " + quarterWord);
    if (printDime) 
      System.out.println("     " + numberOfDimes + " " + dimeWord);
    if (printNickel)
      System.out.println("     " + numberOfNickels + " " + nickelWord);
    if (printPenny)
      System.out.println("     " + numberOfPennies + " " + pennyWord);
  }
}