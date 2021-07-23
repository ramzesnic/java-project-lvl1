package hexlet.code;

public final class Utils {
  public static int getRandom(int min, int max) {
    return (int) Math.floor(Math.random() * (max - min)) + min;
  }

  public static boolean checkEven(int value) {
    return value % 2 == 0;
  }

  public int sum(int x, int y) {
    return x + y;
  }

  public int sub(int x, int y) {
    return x - y;
  }

  public int mul(int x, int y) {
    return x * y;
  }
}
