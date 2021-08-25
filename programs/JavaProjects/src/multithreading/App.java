package multithreading;

/**
 * @author bkuraman
 *
 */
public class App {

  public static void main(String[] arg) {

    int x = 7;
    Integer n = x;

    Student s = new Student();
    s.id = 3;
    s.name = "hai";

    Student s1 = new Student();
    s1.id = 3;
    s1.name = "hai";

    System.out.println(s.equals(s1));
  }
}
