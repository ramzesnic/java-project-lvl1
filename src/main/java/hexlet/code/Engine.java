package hexlet.code;

import hexlet.code.games.interfaces.GameInterface;

public class Engine {
  public static void runGame(GameInterface game, Cli cli, int runCount) {
    final String descriotion = game.getDescription();
    cli.printMessage(descriotion);
    for (int i = 0; i < runCount; i++) {
      final String[] gameData = game.round();
      final String question = gameData[0];
      final String trueAnswer = gameData[1];
      cli.printMessage("Question: " + question);
      final String answer = cli.getAnswer();
      if (!trueAnswer.equals(answer)) {
        cli.printWrongAnswerMessage(trueAnswer, answer);
        return;
      }
      cli.printCorrectAnswerMessage();
    }
    cli.printCongratulationsMessage();
  }
}
