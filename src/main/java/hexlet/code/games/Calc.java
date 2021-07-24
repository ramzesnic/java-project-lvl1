package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Calc extends BaseGame implements GameInterface {
  public Calc() {
    super("What is the result of the expression?");
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
        this.setQuestion(x + " + " + y);
        this.setTrueAnswer(Utils.sum(x, y));
        break;

      case sub:
        this.setQuestion(x + " - " + y);
        this.setTrueAnswer(Utils.sub(x, y));
        break;

      case mul:
        this.setQuestion(x + " * " + y);
        this.setTrueAnswer(Utils.mul(x, y));

      default:
        break;
    }
  }
}
