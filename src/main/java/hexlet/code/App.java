package hexlet.code;

import hexlet.code.games.Even;

public class App {
  private static void runGame(Even game, Cli cli, int runCount) {
    final String descriotion = game.getDescription();
    Cli.printMessage(descriotion);
    for (int i = 1; i < runCount; i++) {
      final int question = game.getQuestion();
      Cli.printMessage("Question: " + question);
      final String answer = Cli.getAnwer();
      if (!game.checkAnswer(answer)) {
        final String trueAnswer = game.getTrueAnswer();
        cli.printWrongAnswerMessage(trueAnswer, answer);
        return;
      }
      cli.printCorrectAnswerMessage();
    }
    cli.printCongratulationsMessage();
  }

  public static void main(String[] args) {
    Cli.printSelectGameMessage();
    final String action = Cli.getAnwer();
    Cli cli;
    final int runCount = 3;

    switch (action) {
      case "1":
        cli = Cli.welcome();
        break;
      case "2":
        cli = Cli.welcome();
        final Even game = Even.create();
        App.runGame(game, cli, runCount);
      default:
        break;
    }
  }
}
