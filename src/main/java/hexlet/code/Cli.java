package hexlet.code;

import java.util.Scanner;

public final class Cli {
  private String name;

  Cli(String name) {
    this.name = name;
  }

  public static void printMessage(String message) {
    System.out.println(message);
  }

  public static String getAnwer() {
    final Scanner sc = new Scanner(System.in);
    final String answer = sc.nextLine();
    sc.close();
    return answer;
  }

  public static void printSelectGameMessage() {
    final String message = "Please enter the game number and press Enter. 1 - Greet 2 - Even 0 - Exit";
    Cli.printMessage(message);
  }

  public void printCorrectAnswerMessage() {
    Cli.printMessage("Correct!");
  }

  public void printWrongAnswerMessage(String trueAnswer, String wrongAnswer) {
    final String answerMessage = String.format("'%s' is wrong answer ;(. Correct answer was '%s'.", wrongAnswer,
        trueAnswer);
    final String goodbyMessage = String.format("Let's try again, %s!", this.name);
    Cli.printMessage(answerMessage);
    Cli.printMessage(goodbyMessage);
  }

  public void printCongratulationsMessage() {
    final String message = String.format("Congratulations, %s!", this.name);
    Cli.printMessage(message);
  }

  public static Cli welcome() {
    Cli.printMessage("Welcome to the Brain Games!");
    Cli.printMessage("May I have your name? ");
    final String name = Cli.getAnwer();
    final String message = String.format("Hello, %s!", name);
    Cli.printMessage(message);
    return new Cli(name);
  }
}
