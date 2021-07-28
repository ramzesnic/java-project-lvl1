package hexlet.code;

import java.util.ArrayList;
import java.util.Scanner;

import hexlet.code.games.interfaces.GameInterface;

public final class Cli {
  private String name;
  private final Scanner sc = new Scanner(System.in);

  public void printMessage(String message) {
    System.out.println(message);
  }

  public void printInLine(String message) {
    System.out.print(message);
  }

  public String getAnswer() {
    final String answer = sc.nextLine();
    return answer;
  }

  public int getNumberAnswer() {
    final int answer = sc.nextInt();
    return answer;
  }

  public void printSelectGameMessage(GameInterface[] games) {
    final String headMessage = "Please enter the game number and press Enter.\n";
    final String greatMessage = "1 - Great\n";
    final String exitMessage = "0 - Exit";
    final ArrayList<String> messageData = new ArrayList<String>();
    messageData.add(headMessage);
    messageData.add(greatMessage);
    final int headLength = messageData.size();
    for (int i = 0; i < games.length; i++) {
      final int gameNumber = i + headLength;
      messageData.add(gameNumber + " - " + games[i].getName() + "\n");
    }
    messageData.add(exitMessage);

    final String inlineMessage = "Your choice: ";
    this.printMessage(String.join("", messageData.toArray(new String[messageData.size()])));
    this.printInLine(inlineMessage);
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
    this.printInLine("May Is have your name? ");
    final String answer = this.getAnswer();
    this.name = answer;
    final String message = String.format("Hello, %s!", name);
    this.printMessage(message);
  }
}
