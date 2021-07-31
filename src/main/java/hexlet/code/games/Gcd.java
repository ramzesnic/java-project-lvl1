package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Gcd implements GameInterface {
  private final String name = "Gcd";
  private final String description = "Find the greatest common divisor of given numbers.";
  private final int minXY = 1;
  private final int maxXY = 100;

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String[] round() {
    final int x = Utils.getRandom(this.minXY, this.maxXY);
    final int y = Utils.getRandom(this.minXY, this.maxXY);
    final String question = (x + " " + y);
    final String trueAnswer = String.valueOf(Utils.gcd(x, y));
    final String[] data = {question, trueAnswer};
    return data;
  }
}
