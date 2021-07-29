package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.interfaces.GameInterface;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;

public class App {
  public static void main(String[] args) {
    final GameInterface[] games = {new Even(), new Calc(), new Gcd(), new Progression(), new Prime()};
    final Cli cli = new Cli();

    cli.printSelectGameMessage(games);
    final int action = cli.getNumberAnswer();
    final int runCount = 3;
    final int gameIdxOffset = 2;
    final int gameIdx = action - gameIdxOffset;

    if (action <= 0) {
      return;
    }
    if (action == 1) {
      cli.welcome();
      return;
    }
    cli.welcome();
    Engine.runGame(games[gameIdx], cli, runCount);
  }
}
