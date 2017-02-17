
/**
 * Write a description of class minuteConversion here.
 * Converts minutes into years and days
 * @author Xavier Tilley
 * @version 2/3/17
 */
import java.util.Scanner;

public class minuteConversion {
  public static void main(String[] args) {
    System.out.print("How many minutes? ");
    Scanner input = new Scanner(System.in);
    int minutes = input.nextInt();
    int days = minutes / 1440; // Divide minutes by the number of minutes in a day
    int years = days / 365; // Divide days by the number of days in a year
    int remainingDays = days % 365; // To get the remaining days
    System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
  }
}