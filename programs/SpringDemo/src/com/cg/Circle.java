package com.cg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 * @author bkuraman
 *
 */
@Component
public class Circle implements Shape {

  private Point center;

  @Autowired
  private MessageSource myMessageSource;

  @Override
  public void draw() {

    System.out.println(this.myMessageSource.getMessage("drawing.circle", null, "Default message", null));
    System.out.println(this.myMessageSource.getMessage("drawing.point",
        new Object[] { this.center.getX(), this.center.getY() }, "Default message", null));
    // System.out.println("Circle : Point is: (" + this.center.getX() + "," + this.center.getY() + ")");
    // system.out.println(this.mymessagesource.getmessage("greeting", null, "default message", null));

  }

  /**
   * @return center
   */
  public Point getCenter() {

    return this.center;
  }

  /**
   * @param center new value of {@link #getcenter}.
   */
  /*
   * @Required
   *
   * @Qualifier("circleRelated")
   */

  @Resource
  public void setCenter(Point center) {

    this.center = center;
  }

  @PostConstruct
  public void postContruct() {

    System.out.println("Post construct of circle");
  }

  @PreDestroy
  public void preDestroy() {

    System.out.println("Pre destroy of circle");

  }
}
