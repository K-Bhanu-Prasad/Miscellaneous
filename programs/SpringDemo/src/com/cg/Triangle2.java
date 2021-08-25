package com.cg;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author bkuraman
 *
 */
public class Triangle2 implements Shape, InitializingBean, DisposableBean {

  private List<Point> points;

  /**
   * @return points
   */
  public List<Point> getPoints() {

    return this.points;
  }

  /**
   * @param points new value of {@link #getpoints}.
   */
  public void setPoints(List<Point> points) {

    this.points = points;
  }

  public void draw() {

    for (Point point : this.points) {
      System.out.println("Point = (" + point.getX() + "," + point.getY() + ")");
    }
  }

  @Override
  public void afterPropertiesSet() throws Exception {

    System.out.println("Initialized Bean Triangle2");

  }

  @Override
  public void destroy() throws Exception {

    System.out.println("Destroyed Bean Triangle2");

  }

  public void myInit() {

    System.out.println("My init method");
  }

  public void cleanUp() {

    System.out.println("My clean up method");
  }

}
