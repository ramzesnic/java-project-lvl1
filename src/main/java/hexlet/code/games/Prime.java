
package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Prime implements GameInterface {
  private final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
  private Integer question;
  private String trueAnswer;
  private String answer;

  public String getDescription() {
    return description;
  }

  public String getQuestion() {
    return question.toString();
  }

  public String getTrueAnswer() {
    return trueAnswer;
  }

  public String getAnswer() {
    return answer;
  }

  public boolean checkAnswer() {
    this.answer = Cli.getAnwer();
    return this.trueAnswer.equals(this.answer);
  }

  private boolean checkPrimeIter(int i, int value) {
    if (i > Math.sqrt(value)) {
      return true;
    }
    if (value % i == 0) {
      return false;
    }
    return this.checkPrimeIter(i + 2, value);
  }

  private boolean checkPrime(int value) {
    if (value == 2) {
      return true;
    }
    if (value % 2 == 0 || value <= 1) {
      return false;
    }
    final int nextValue = 3;
    return this.checkPrimeIter(nextValue, value);
  }

  public void run() {
    final int minValue = 1;
    final int maxValue = 100;
    this.question = Utils.getRandom(minValue, maxValue);
    final String trueAnswerValue = this.checkPrime(this.question) ? "yes" : "no";
    this.trueAnswer = trueAnswerValue;
  }
}
