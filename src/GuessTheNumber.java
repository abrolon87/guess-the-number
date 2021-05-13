import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    greetUser();
  }

  public static void greetUser() {
    System.out.println("Welcome to Guess the Number!");

    getUserGuess();
  }

  public static void getUserGuess() {
    // generate secret number
    Random rand = new Random();
    int secretNum = rand.nextInt(5);
    System.out.println("Pick a number from 1-5:");
    int userGuess = sc.nextInt();
    checkGuess(userGuess, secretNum);
  }

  public static void checkGuess(int userGuess, int secretNum) {

    if (userGuess != secretNum) {
      System.out.println("Sorry, guess again.");
      getUserGuess();
    } else {
      System.out.println("You guessed it!");
      playAgain();
    }
  }

  public static void playAgain() {
    System.out.println("Would you like to play again? y/n");
    String userInput = sc.next();
    if (userInput.equals("y")) {
      getUserGuess();
    } else if (userInput.equals("n")) {
      System.out.println("Thank you for playing Guess the Number. Good bye!");
    } else {
      System.out.println("Invalid command!");
      playAgain();
    }
  }
}