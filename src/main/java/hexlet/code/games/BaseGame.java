package hexlet.code.games;

import hexlet.code.Cli;

public class BaseGame {
  private String description;
  private String question;
  private Integer trueAnswer;
  private Integer answer;

  public BaseGame(String description) {
    this.description = description;
  }

  public final String getDescription() {
    return description;
  }

  public final String getQuestion() {
    return question;
  }

  public final String getTrueAnswer() {
    return trueAnswer.toString();
  }

  public final String getAnswer() {
    return answer.toString();
  }

  public final void setQuestion(String question) {
    this.question = question;
  }

  public final void setTrueAnswer(Integer trueAnswer) {
    this.trueAnswer = trueAnswer;
  }

  public final void setAnswer(Integer answer) {
    this.answer = answer;
  }

  public final boolean checkAnswer() {
    this.answer = Cli.getNumberAnwer();
    return trueAnswer.equals(answer);
  }
}
