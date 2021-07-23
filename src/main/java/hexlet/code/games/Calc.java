package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Calc implements GameInterface {
  private final String description = "What is the result of the expression?";
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
    final int minAction = 1;
    final int maxAction = 3;
    final int minXY = 1;
    final int maxXY = 100;
    final int sum = 1;
    final int sub = 2;
    final int mul = 3;

    final int randomActionValue = Utils.getRandom(minAction, maxAction);
    final int x = Utils.getRandom(minXY, maxXY);
    final int y = Utils.getRandom(minXY, maxXY);

    switch (randomActionValue) {
      case sum:
        this.question = x + " + " + y;
        this.trueAnswer = x + y;
        break;

      case sub:
        this.question = x + " - " + y;
        this.trueAnswer = x - y;
        break;

      case mul:
        this.question = x + " * " + y;
        this.trueAnswer = x * y;

      default:
        break;
    }
  }
}
