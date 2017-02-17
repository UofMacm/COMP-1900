
/**
 * Write a description of class paperRockScissors here.
 * Paper, rock, scissors game
 * @author Xavier Tilley
 * @version 2-15-17
 */
import java.util.Scanner;

public class paperRockScissors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Scissor (0), rock (1), paper(2): ");
    
    int player = input.nextInt();
    int computer = (int)(Math.random()*3);

    if (player == 0) {
      if (computer == 2) {
        System.out.println("The computer is paper. You are scissor. You won.");
      }else if (computer == 1) {
        System.out.println("The computer is rock. You are scissor. Computer won.");
      }else if (computer == 0) {
        System.out.println("The computer is scissor. You are scissor. It is a draw.");
      }
    }else if (player == 1) {
      if (computer == 0) {
        System.out.println("The computer is scissor. You are rock. You won.");
      }else if (computer == 2){
        System.out.println("The computer is paper. You are rock. Computer won.");
      }else if (computer == 1) {
        System.out.println("The computer is rock. You are rock. It is a draw.");
      }
    }else if (player == 2) {
      if (computer == 1) {
        System.out.println("The computer is rock. You are paper. You won.");
      }else if (computer == 0) {
        System.out.println("The computer is scissor. You are paper. Computer won.");
      }else if (computer == 2) {
        System.out.println("The computer is paper. You are paper. It is a draw.");
      }
    }else{
      System.out.println("Your input is invalid");
    }
  }
}
