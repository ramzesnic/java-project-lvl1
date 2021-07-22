package hexlet.code.games;

import hexlet.code.Utils;

public final class Even {
  private final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
  private int question;
  private String trueAnswer;

  public String getDescription() {
    return description;
  }

  public int getQuestion() {
    return question;
  }

  public String getTrueAnswer() {
    return trueAnswer;
  }

  public boolean checkAnswer(String answer) {
    return this.trueAnswer.equals(answer);
  }

  public Even(int question, String trueAnswer) {
    this.question = question;
    this.trueAnswer = trueAnswer;
  }

  public static Even create() {
    final int minValue = 1;
    final int maxValue = 100;
    final int question = Utils.getRandom(minValue, maxValue);
    final String trueAnswer = Utils.checkEven(question) ? "yes" : "no";

    return new Even(question, trueAnswer);
  }
}
