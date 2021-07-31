package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Calc implements GameInterface {
  private final String name = "Calc";
  private final String description = "What is the result of the expression?";
  private final int minAction = 1;
  private final int maxAction = 3;
  private final int minXY = 1;
  private final int maxXY = 100;
  private final int sum = 1;
  private final int sub = 2;
  private final int mul = 3;

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  private String intToString(int value) {
    return String.valueOf(value);
  }

  public String[] round() {

    final int randomActionValue = Utils.getRandom(this.minAction, this.maxAction);
    final int x = Utils.getRandom(this.minXY, this.maxXY);
    final int y = Utils.getRandom(this.minXY, this.maxXY);

    String question = "";
    String trueAnswer = "";

    switch (randomActionValue) {
      case sum:
        question = (x + " + " + y);
        trueAnswer = this.intToString(Utils.sum(x, y));
        break;

      case sub:
        question = (x + " - " + y);
        trueAnswer = this.intToString(Utils.sub(x, y));
        break;

      case mul:
        question = (x + " * " + y);
        trueAnswer = this.intToString(Utils.mul(x, y));

      default:
        break;
    }

    final String[] data = {question, trueAnswer};
    return data;
  }
}
