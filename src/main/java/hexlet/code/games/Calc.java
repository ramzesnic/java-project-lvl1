package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;

public class Calc {
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

  public boolean checkAnswer(Integer answer) {
    this.answer = Cli.getNumberAnwer();
    return trueAnswer.equals(answer);
  }

  public void run() {
    final int minAction = 1;
    final int maxAction = 3;
    final int minXY = 1;
    final int maxXY = 100;

    final int randomActionValue = Utils.getRandom(minAction, maxAction);
    final int x = Utils.getRandom(minXY, maxXY);
    final int y = Utils.getRandom(minXY, maxXY);

    switch (randomActionValue) {
      case 1:
        this.question = x + " + " + y;
        this.trueAnswer = x + y;
        break;

      case 2:
        this.question = x + " - " + y;
        this.trueAnswer = x - y;
        break;

      case 3:
        this.question = x + " * " + y;
        this.trueAnswer = x * y;

      default:
        break;
    }
  }
}
