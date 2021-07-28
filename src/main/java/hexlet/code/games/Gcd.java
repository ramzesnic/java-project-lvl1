package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Gcd implements GameInterface {
  private final String name = "Gcd";
  private final String description = "Find the greatest common divisor of given numbers.";

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String[] round() {
    final int minXY = 1;
    final int maxXY = 100;
    final int x = Utils.getRandom(minXY, maxXY);
    final int y = Utils.getRandom(minXY, maxXY);
    final String question = (x + " " + y);
    final String trueAnswer = Integer.valueOf(Utils.gcd(x, y)).toString();
    final String[] data = { question, trueAnswer };
    return data;
  }
}
