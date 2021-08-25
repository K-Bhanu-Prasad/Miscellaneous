package main;

import service.FactoryService;
import service.ShapeService;

/**
 * @author bkuraman
 *
 */
public class AopMain {

  /**
   * @param args
   */
  public static void main(String[] args) {

    // ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    // ShapeService shape = ctx.getBean("shapeService", ShapeService.class);
    // shape.getCircle().setAndThrow("testCircle");

    ShapeService shape = (ShapeService) new FactoryService().getBean("ShapeService");
    shape.getCircle();

  }

}
