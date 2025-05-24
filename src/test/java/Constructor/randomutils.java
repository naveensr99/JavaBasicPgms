package ecolab.koerber.utils;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

  private RandomUtils() {}

  static SecureRandom random = new SecureRandom();
  private static int maxRange = 1000000;

  public static int generateInt() {
    return generateInt(maxRange);
  }
  
  public static String generateText() {
    return "AutoTest" + generateInt(maxRange);
  }

  public static long generateTenDigitNumber() {
    ThreadLocalRandom random = ThreadLocalRandom.current();
    return random.nextLong(1_000_000_000L, 10_000_000_000L);
  }

  public static int generateInt(int n) {
    return 1+random.nextInt(n);
  }
  public static String generateLp(int i) {
	    return "USLP0000000000" + generateInt(maxRange);
	  }
  public static String generateLot(int i) {
	    return "1GE3" + generateInt(maxRange);
	  }
}
