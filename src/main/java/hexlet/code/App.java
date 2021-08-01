package hexlet.code;

import java.util.ArrayList;
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

    App.printSelectGameMessage(games, cli);
    final int action = cli.readInt();
    final int runCount = 3;
    final int gameIdxOffset = 2;
    final int gameIdx = action - gameIdxOffset;

    if (action <= 0 || gameIdx >= games.length) {
      return;
    }
    cli.welcome();
    if (action != 1) {
      Engine.runGame(games[gameIdx], cli, runCount);
    }
  }

  private static void printSelectGameMessage(GameInterface[] games, Cli cli) {
    final String headMessage = "Please enter the game number and press Enter.";
    final String greatMessage = "1 - Great";
    final String exitMessage = "0 - Exit";
    final ArrayList<String> messageData = new ArrayList<String>();
    messageData.add(headMessage);
    messageData.add(greatMessage);
    final int headLength = messageData.size();
    for (int i = 0; i < games.length; i++) {
      final int gameNumber = i + headLength;
      messageData.add(gameNumber + " - " + games[i].getName());
    }
    messageData.add(exitMessage);

    final String inlineMessage = "Your choice: ";
    messageData.forEach(str -> cli.printMessage(str));
    cli.printInLine(inlineMessage);
  }
}
