package hexlet.code.games;

import java.util.Arrays;
import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Progression implements GameInterface {
  private final String name = "Progression";
  private final String description = "What number is missing in the progression?";

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  private Integer[] makeProgression(int start, int step, int length) {
    final Integer[] progression = new Integer[length];
    for (int i = 0; i < length; i++) {
      progression[i] = start + step * i;
    }
    return progression;
  }

  private String makeQuestion(Integer[] progression, int hiddenIdx) {
    final String[] progressionStr = Arrays.stream(progression).map(String::valueOf).toArray(String[]::new);
    progressionStr[hiddenIdx] = "..";
    return String.join(" ", progressionStr);
  }

  public String[] round() {
    final int progressionLength = 10;
    final int startMin = 1;
    final int startMax = 100;
    final int stepMin = 2;
    final int stepMax = 5;
    final int start = Utils.getRandom(startMin, startMax);
    final int step = Utils.getRandom(stepMin, stepMax);
    final int hiddenIdx = Utils.getRandom(0, progressionLength - 1);
    final Integer[] progression = this.makeProgression(start, step, progressionLength);
    final String question = (this.makeQuestion(progression, hiddenIdx));
    final String trueAnswer = (progression[hiddenIdx].toString());
    final String[] data = {question, trueAnswer};
    return data;
  }
}
