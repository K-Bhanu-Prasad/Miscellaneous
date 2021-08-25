package service;

import model.Circle;
import model.Triangle;

/**
 * @author bkuraman
 *
 */
public class FactoryService {

  public Object getBean(String bean) {

    if (bean.equals("ShapeService"))
      return new ShapeServiceProxy();
    if (bean.equals("Circle"))
      return new Circle();
    if (bean.equals("Triangle"))
      return new Triangle();
    return null;

  }
}
