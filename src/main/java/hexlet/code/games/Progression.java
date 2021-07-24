package hexlet.code.games;

import java.util.Arrays;
import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Progression extends BaseGame implements GameInterface {
  public Progression() {
    super("What number is missing in the progression?");
  }

  private Integer[] makeProgression(int start, int step, int length) {
    final Integer[] progression = new Integer[length];
    for (int i = 0; i < length; i++) {
      progression[i] = start + step * i;
    }
    return progression;
  }

  private String makeQuestion(Integer[] progression, int hiddenIdx) {
    final String[] progressionStr = Arrays.stream(progression).map(el -> el.toString()).toArray(String[]::new);
    progressionStr[hiddenIdx] = "..";
    return Arrays.toString(progressionStr);
  }

  public void run() {
    final int progressionLength = 10;
    final int startMin = 1;
    final int startMax = 100;
    final int stepMin = 2;
    final int stepMax = 5;
    final int start = Utils.getRandom(startMin, startMax);
    final int step = Utils.getRandom(stepMin, stepMax);
    final int hiddenIdx = Utils.getRandom(0, progressionLength - 1);
    final Integer[] progression = this.makeProgression(start, step, progressionLength);
    this.setQuestion(this.makeQuestion(progression, hiddenIdx));
    this.setTrueAnswer(progression[hiddenIdx]);
  }
}
