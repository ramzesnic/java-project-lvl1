package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;

public class App {
  public static void main(String[] args) {
    Cli.printSelectGameMessage();
    final int action = Cli.getNumberAnwer();
    Cli cli;
    final int runCount = 3;
    final int welcomeName = 1;
    final int evenName = 2;
    final int calcName = 3;
    final int gcdName = 4;
    final int progressionName = 5;

    switch (action) {
      case welcomeName:
        cli = Cli.welcome();
        break;
      case evenName:
        cli = Cli.welcome();
        final Even even = new Even();
        Engine.runGame(even, cli, runCount);
        break;
      case calcName:
        cli = Cli.welcome();
        final Calc calc = new Calc();
        Engine.runGame(calc, cli, runCount);
        break;
      case gcdName:
        cli = Cli.welcome();
        final Gcd gcd = new Gcd();
        Engine.runGame(gcd, cli, runCount);
        break;
      case progressionName:
        cli = Cli.welcome();
        final Progression progression = new Progression();
        Engine.runGame(progression, cli, runCount);
        break;
      default:
        break;
    }
  }
}
