package service;

import aspect.Loggable;
import model.Circle;
import model.Triangle;

/**
 * @author bkuraman
 *
 */
public class ShapeService {
  private Circle circle;

  private Triangle triangle;

  /**
   * @return circle
   */

  @Loggable
  public Circle getCircle() {

    return this.circle;
  }

  /**
   * @param circle new value of {@link #getcircle}.
   */
  public void setCircle(Circle circle) {

    this.circle = circle;
  }

  /**
   * @return triangle
   */
  public Triangle getTriangle() {

    return this.triangle;
  }

  /**
   * @param triangle new value of {@link #gettriangle}.
   */
  public void setTriangle(Triangle triangle) {

    this.triangle = triangle;
  }

}
