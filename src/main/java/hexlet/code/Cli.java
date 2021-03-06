package hexlet.code;

import java.util.Scanner;

public final class Cli {
  private String name;
  private final Scanner sc = new Scanner(System.in);

  public void printMessage(String message) {
    System.out.println(message);
  }

  public void printInLine(String message) {
    System.out.print(message);
  }

  public String readString() {
    final String answer = sc.nextLine();
    return answer;
  }

  public int readInt() {
    final int answer = Integer.parseInt(sc.nextLine());
    return answer;
  }

  public void printCorrectAnswerMessage() {
    this.printMessage("Correct!");
  }

  public void printWrongAnswerMessage(String trueAnswer, String wrongAnswer) {
    final String answerMessage = String.format("'%s' is wrong answer ;(. Correct answer was '%s'.", wrongAnswer,
        trueAnswer);
    final String goodbyMessage = String.format("Let's try again, %s!", this.name);
    this.printMessage(answerMessage);
    this.printMessage(goodbyMessage);
  }

  public void printCongratulationsMessage() {
    final String message = String.format("Congratulations, %s!", this.name);
    this.printMessage(message);
  }

  public void welcome() {
    this.printMessage("Welcome to the Brain Games!");
    this.printInLine("May I have your name? ");
    final String answer = this.readString();
    this.name = answer;
    final String message = String.format("Hello, %s!", name);
    this.printMessage(message);
  }
}
