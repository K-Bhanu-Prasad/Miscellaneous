package FirstNonRepetativeCharInString;

/**
 * @author bkuraman
 *
 */
public class FirstNonRepetativeCharInString {

  /**
   * @param args
   */
  public static void main(String[] args) {

    FirstNonRepetativeCharInString firstNonRepetativeCharInString = new FirstNonRepetativeCharInString();
    System.out.println(firstNonRepetativeCharInString.find("DSFSFLDKF"));

  }

  public char find(String string) {

    boolean found = false;
    int j;
    for (int i = 0; i < string.length(); i++) {
      char x = string.charAt(i);
      for (j = 0; j < string.length(); j++) {
        if (j == i)
          continue;
        if (x == string.charAt(j)) {
          found = true;
          break;
        }
      }
      if (j == string.length()) {
        return x;
      }
    }
    return ' ';
  }
}
