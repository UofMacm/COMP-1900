
/**
 * Write a description of class investment here.
 * Calculates the accumulated value of an investment
 * @author Xavier Tilley
 * @version 2-10-17
 */
import java.util.Scanner;

public class investment {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declare varibles
    double futureInvestmentValue, investmentAmount, monthlyInterestRate, yearlyInterestRate, numberOfYears;

    // Gather inputs and assign them to varibles
    System.out.print("Enter investment amount: ");
    investmentAmount = input.nextDouble();

    System.out.print("Enter annual interest rate in percentage: ");
    yearlyInterestRate = input.nextDouble()/100;
    monthlyInterestRate = yearlyInterestRate/12.0;

    System.out.print("Enter number of years: ");
    numberOfYears = input.nextDouble();

    // Do the math thing
    futureInvestmentValue = investmentAmount * Math.pow((1.0 + monthlyInterestRate), (numberOfYears * 12.0));

    // Print results
    System.out.println("Accumulated value is $" + Math.round(futureInvestmentValue*100.0)/100.0);

  }
}