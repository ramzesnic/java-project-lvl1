package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Even implements GameInterface {
  private final String name = "Even";
  private final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String[] round() {
    final int minValue = 1;
    final int maxValue = 100;
    final int questionValue = Utils.getRandom(minValue, maxValue);
    final String trueAnswer = Utils.checkEven(questionValue) ? "yes" : "no";
    final String question = Integer.valueOf(questionValue).toString();
    final String[] data = {question, trueAnswer};
    return data;
  }
}
