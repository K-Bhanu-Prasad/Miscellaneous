package com.cg;

/**
 * @author bkuraman
 *
 */
public class Triangle3 {

  private Point PointA;

  private Point PointB;

  private Point PointC;

  /**
   * @return pointA
   */
  public Point getPointA() {

    return this.PointA;
  }

  /**
   * @param pointA new value of {@link #getpointA}.
   */
  public void setPointA(Point pointA) {

    this.PointA = pointA;
  }

  /**
   * @return pointB
   */
  public Point getPointB() {

    return this.PointB;
  }

  /**
   * @param pointB new value of {@link #getpointB}.
   */
  public void setPointB(Point pointB) {

    this.PointB = pointB;
  }

  /**
   * @return pointC
   */
  public Point getPointC() {

    return this.PointC;
  }

  /**
   * @param pointC new value of {@link #getpointC}.
   */
  public void setPointC(Point pointC) {

    this.PointC = pointC;
  }

  public void draw() {

    System.out.println("PointA = (" + this.PointA.getX() + "," + this.PointA.getY() + ")");
    System.out.println("PointB = (" + this.PointB.getX() + "," + this.PointB.getY() + ")");
    System.out.println("PointC = (" + this.PointC.getX() + "," + this.PointC.getY() + ")");
  }

}
