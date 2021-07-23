package hexlet.code.games.interfaces;

public interface GameInterface {
  String getDescription();

  String getQuestion();

  String getTrueAnswer();

  String getAnswer();

  boolean checkAnswer();

  void run();
}
