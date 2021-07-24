package hexlet.code;

import hexlet.code.games.interfaces.GameInterface;

public class Engine {
  public static void runGame(GameInterface game, Cli cli, int runCount) {
    final String descriotion = game.getDescription();
    Cli.printMessage(descriotion);
    for (int i = 0; i < runCount; i++) {
      game.run();
      final String question = game.getQuestion();
      Cli.printMessage("Question: " + question);
      if (!game.checkAnswer()) {
        final String trueAnswer = game.getTrueAnswer();
        final String answer = game.getAnswer();
        cli.printWrongAnswerMessage(trueAnswer, answer);
        return;
      }
      cli.printCorrectAnswerMessage();
    }
    cli.printCongratulationsMessage();
  }
}
