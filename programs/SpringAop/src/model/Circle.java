package model;

/**
 * @author bkuraman
 *
 */
public class Circle {
  String name;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;

  }

  public String setNameAnReturn(String name) {

    this.name = name;

    return name;
  }

  public void setAndThrow(String name) {

    this.name = name;
    throw new RuntimeException();
  }
}
