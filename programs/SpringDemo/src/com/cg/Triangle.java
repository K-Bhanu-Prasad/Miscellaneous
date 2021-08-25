package com.cg;

/**
 * @author bkuraman
 *
 */
public class Triangle {

  private String type;

  private int height;

  /**
   * The constructor.
   *
   * @param type
   * @param height
   */
  public Triangle(String type, int height) {
    super();
    this.type = type;
    this.height = height;
  }

  /**
   * @return height
   */
  public int getHeight() {

    return this.height;
  }

  /**
   * @return type
   */
  public String getType() {

    return this.type;
  }

  /**
   * @param type new value of {@link #gettype}.
   */
  public void setType(String type) {

    this.type = type;
  }

  public void draw() {

    System.out.println(getType() + " Triangle drawn of height " + getHeight());
  }
}
