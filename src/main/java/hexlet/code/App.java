package hexlet.code;

import hexlet.code.games.Even;

public class App {
  private static void runGame(Even game, Cli cli, int runCount) {
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

  public static void main(String[] args) {
    Cli.printSelectGameMessage();
    final int action = Cli.getNumberAnwer();
    Cli cli;
    final int runCount = 3;

    switch (action) {
      case 1:
        cli = Cli.welcome();
        break;
      case 2:
        cli = Cli.welcome();
        final Even game = new Even();
        App.runGame(game, cli, runCount);
      default:
        break;
    }
  }
}
