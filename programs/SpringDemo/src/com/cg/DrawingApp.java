package com.cg;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bkuraman
 *
 */
public class DrawingApp {

  /**
   * @param args
   */
  public static void main(String[] args) {

    // Triangle triangle = new Triangle();
    // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    // Triangle triangle = (Triangle) factory.getBean("triangle");

    // Triangle triangle = (Triangle) context.getBean("triangle");
    // Triangle2 triangle = (Triangle2) context.getBean("triangle2");
    // Triangle3 triangle3 = (Triangle3) context.getBean("triangle3");

    // System.out.println("************************");
    // triangle3.draw();

    // System.out.println("************************");
    // triangle.draw();

    // System.out.println("************************");
    // System.out.println("Using inheritance:");

    AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    context.registerShutdownHook();
    Shape shape = (Shape) context.getBean("circle");
    shape.draw();

  }

}
