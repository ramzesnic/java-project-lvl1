package hexlet.code;

public final class Utils {
  public static int getRandom(int min, int max) {
    return (int) Math.floor(Math.random() * (max - min)) + min;
  }

  public static boolean checkEven(int value) {
    return value % 2 == 0;
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int sub(int x, int y) {
    return x - y;
  }

  public static int mul(int x, int y) {
    return x * y;
  }

  public static int gcd(int x, int y) {
    if (x == y) {
      return x;
    }
    if (x > y) {
      return gcd(x - y, y);
    }
    return gcd(x, y - x);
  }
}
