
/**
 * Write a description of class FindFutureDates here.
 * Finds a future day of the week based on today and number of elapsed days
 * @author Xavier Tilley
 * @version 2-10-17
 */
import java.util.Scanner;

public class FindFutureDates{

public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int today, elapsedDays;
  int daysToAdd, dayToFind;
  String todayWord, futureDayWord;
	
	todayWord = "default";
	futureDayWord = "default";
  
  System.out.print("Enter today's day: ");
  today = s.nextInt();
  
  System.out.print("Enter the number of days elapsed since today: ");
  elapsedDays = s.nextInt();
  
  daysToAdd = elapsedDays % 7;
  dayToFind = today + daysToAdd;
  
  switch (today) {
    case 0: todayWord = "Today is Sunday";
      break;
    case 1: todayWord = "Today is Monday";
      break;
    case 2: todayWord = "Today is Tuesday";
      break;
    case 3: todayWord = "Today is Wednesday";
      break;
    case 4: todayWord = "Today is Thursday";
      break;
    case 5: todayWord = "Today is Friday";
      break;
    case 6: todayWord = "Today is Saturday";
      break;
	default: todayWord = "Today is  an invalid starting day. Today's day must be 0-6.";
  }
  switch (dayToFind) {
    case 0: futureDayWord = "Sunday";
      break;
    case 1: futureDayWord = "Monday";
      break;
    case 2: futureDayWord = "Tuesday";
      break;
    case 3: futureDayWord = "Wednesday";
      break;
    case 4: futureDayWord = "Thursday";
      break;
    case 5: futureDayWord = "Friday";
      break;
    case 6: futureDayWord = "Saturday";
      break;
	case 7: futureDayWord = "Sunday";
      break;
    case 8: futureDayWord = "Monday";
      break;
    case 9: futureDayWord = "Tuesday";
      break;
    case 10: futureDayWord = "Wednesday";
      break;
    case 11: futureDayWord = "Thursday";
      break;
    case 12: futureDayWord = "Friday";
      break;
    case 13: futureDayWord = "Saturday";
      break;
  }
  System.out.println(todayWord + " and the future day is " + futureDayWord);
}
}