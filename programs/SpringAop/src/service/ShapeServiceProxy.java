package service;

import model.Circle;

/**
 * @author bkuraman
 *
 */
public class ShapeServiceProxy extends ShapeService {

  @Override
  public Circle getCircle() {

    System.out.println("Before get circle method. Called with AOP proxy");
    return super.getCircle();
  }

}
