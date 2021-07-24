package hexlet.code.games;

import hexlet.code.Cli;

public class BaseGame {
  private String description;
  private String question;
  private Integer trueAnswer;
  private Integer answer;

  public BaseGame(String desc) {
    this.description = desc;
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

  public final void setQuestion(String quest) {
    this.question = quest;
  }

  public final void setTrueAnswer(Integer answer) {
    this.trueAnswer = answer;
  }

  public final void setAnswer(Integer playerAnswer) {
    this.answer = playerAnswer;
  }

  public final boolean checkAnswer() {
    this.answer = Cli.getNumberAnwer();
    return trueAnswer.equals(answer);
  }
}
