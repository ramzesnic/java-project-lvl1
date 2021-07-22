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

  public void run() {
    final int minValue = 1;
    final int maxValue = 100;
    final int questionValue = Utils.getRandom(minValue, maxValue);
    final String trueAnswerValue = Utils.checkEven(question) ? "yes" : "no";
    this.question = questionValue;
    this.trueAnswer = trueAnswerValue;
  }
}
