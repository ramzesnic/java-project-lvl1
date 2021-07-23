package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.games.interfaces.GameInterface;

public final class Even implements GameInterface {
  private final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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

  public void run() {
    final int minValue = 1;
    final int maxValue = 100;
    this.question = Utils.getRandom(minValue, maxValue);
    final String trueAnswerValue = Utils.checkEven(this.question) ? "yes" : "no";
    this.trueAnswer = trueAnswerValue;
  }
}
