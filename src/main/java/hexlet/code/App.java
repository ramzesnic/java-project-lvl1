package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.interfaces.GameInterface;
import hexlet.code.games.Calc;

public class App {
  private static void runGame(GameInterface game, Cli cli, int runCount) {
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
    final int welcomeName = 1;
    final int evenName = 2;
    final int calcName = 3;

    switch (action) {
      case welcomeName:
        cli = Cli.welcome();
        break;
      case evenName:
        cli = Cli.welcome();
        final Even even = new Even();
        App.runGame(even, cli, runCount);
        break;
      case calcName:
        cli = Cli.welcome();
        final Calc calc = new Calc();
        App.runGame(calc, cli, runCount);
        break;
      default:
        break;
    }
  }
}
