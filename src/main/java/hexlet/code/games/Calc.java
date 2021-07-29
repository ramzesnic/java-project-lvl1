package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Calc implements GameInterface {
  private final String name = "Calc";
  private final String description = "What is the result of the expression?";

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  private String intToString(int value) {
    return Integer.valueOf(value).toString();
  }

  public String[] round() {
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
