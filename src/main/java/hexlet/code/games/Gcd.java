package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Gcd extends BaseGame implements GameInterface {
  public Gcd() {
    super("Find the greatest common divisor of given numbers.");
  }

  public void run() {
    final int minXY = 1;
    final int maxXY = 100;
    final int x = Utils.getRandom(minXY, maxXY);
    final int y = Utils.getRandom(minXY, maxXY);
    this.setQuestion(x + " " + y);
    this.setTrueAnswer(Utils.gcd(x, y));
  }
}
