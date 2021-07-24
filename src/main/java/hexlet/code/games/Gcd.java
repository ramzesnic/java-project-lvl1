package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Gcd implements GameInterface {
  private final String description = "Find the greatest common divisor of given numbers.";
  private String question;
  private Integer trueAnswer;
  private Integer answer;

  public String getDescription() {
    return description;
  }

  public String getQuestion() {
    return question;
  }

  public String getTrueAnswer() {
    return trueAnswer.toString();
  }

  public String getAnswer() {
    return answer.toString();
  }

  public boolean checkAnswer() {
    this.answer = Cli.getNumberAnwer();
    return trueAnswer.equals(answer);
  }

  public void run() {
    final int minXY = 1;
    final int maxXY = 100;
    final int x = Utils.getRandom(minXY, maxXY);
    final int y = Utils.getRandom(minXY, maxXY);
    this.question = x + " " + y;
    this.trueAnswer = Utils.gcd(x, y);
  }
}
