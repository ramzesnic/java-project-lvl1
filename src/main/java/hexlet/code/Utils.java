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

  public static boolean checkPrime(int value) {
    if (value == 2) {
      return true;
    }
    if (value % 2 == 0 || value <= 1) {
      return false;
    }
    final int startIteratorValue = 3;
    int nextValue = startIteratorValue;

    while (true) {
      if (nextValue > Math.sqrt(value)) {
        return true;
      }
      if (value % nextValue == 0) {
        return false;
      }
      nextValue += 2;
    }
  }
}
