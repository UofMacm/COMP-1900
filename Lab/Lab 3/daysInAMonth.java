
/**
 * Write a description of class daysInAMonth here.
 * Determines the number of days in a month
 * @author Xavier Tilley 
 * @version 2-10-17
 */
import java.util.Scanner;

public class daysInAMonth {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Declare varibles
    int month, year, days;
    boolean isLeapYear;
    String monthName;
    
    monthName = "default";
    days = 0;
    
    // Gather input and assign it to varibles
    System.out.print("Enter month: ");
    month = input.nextInt();
    
    System.out.print("Enter year: ");
    year = input.nextInt();

    // Test for leap year
    isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    switch (month) {
      case 1: monthName = "January";
        days = 31; 
        break;
      case 2: monthName = "February";
        if (isLeapYear == true) {
          days = 29;
        }else{
          days = 28;
        }
        break;
      case 3: monthName = "March";
        days = 31; 
        break;
      case 5: monthName = "May";
        days = 31; 
        break;
      case 7: monthName = "July";
        days = 31; 
        break;
      case 8: monthName = "August";
        days = 31; 
        break;
      case 10: monthName = "October";
        days = 31; 
        break;
      case 12: monthName = "December";
        days = 31; 
        break;
      }
      System.out.println(monthName + " " + year + " had " + days + " days");
    }
}