/**
 * Write a description of class populationProjection here.
 *  Projects the U.S. population for five years
 *
 * @author Xavier Tilley
 * @version 2/3/17
 */
public class populationProjection
{
  public static void main(String[] args)
  {
    // Varible declaration
    int initalPop = 312032486;
    double secInYear = 60*60*24*365;

    // Rate calculations
    double birthRate = secInYear/7;
    double deathRate = secInYear/13;
    double immigrationRate = secInYear/45;
    
    // Population calculations
    double year1 = initalPop + 1 * (birthRate - deathRate + immigrationRate);
    double year2 = initalPop + 2 * (birthRate - deathRate + immigrationRate);
    double year3 = initalPop + 3 * (birthRate - deathRate + immigrationRate);
    double year4 = initalPop + 4 * (birthRate - deathRate + immigrationRate);
    double year5 = initalPop + 5 * (birthRate - deathRate + immigrationRate);

    // Print Statements
    System.out.println("After one year the population would be: " + year1);
    System.out.println("After two years the population would be: " + year2);
    System.out.println("After three years the population would be: " + year3);
    System.out.println("After four years the population would be: " + year4);
    System.out.println("After five years the population would be: " + year5);
  }
}
