package hexlet.code;

public class Utils {
  public static int getRandom(int min, int max) {
    return (int) Math.floor(Math.random() * (max - min)) + min;
  }

  public static boolean checkEven(int value) {
    return value % 2 == 0;
  }
}
