package com.cg.cafecoffee.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.cafecoffee.main.Cafe;
import com.cg.cafecoffee.main.Coffee;
import com.cg.cafecoffee.main.CoffeeType;

/**
 * @author bkuraman
 *
 */
public class CafeTest {

  /**
   * @throws java.lang.Exception
   */
  public Cafe target;

  /**
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {

    this.target = new Cafe();

  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {

    this.target = null;
  }

  /**
   *
   */
  @Test
  public void testBrewCoffeeWithoutStrength() {

    CoffeeType coffeeType = CoffeeType.Espresso;
    Coffee coffee = new Coffee(coffeeType, coffeeType.getRequiredBeans(), coffeeType.getRequiredMilk());
    this.target.restockBeans(200);
    this.target.restockMilk(500);
    Coffee result = this.target.brew(coffeeType);
    assertEquals(coffee.getBeans(), result.getBeans());
    assertEquals(coffee.getMilk(), result.getMilk());
  }

  /**
   *
   */
  @Test
  public void testBrewCoffeeWithStrength() {

    CoffeeType coffeeType = CoffeeType.Espresso;
    this.target.restockBeans(200);
    this.target.restockMilk(500);
    Coffee result = this.target.brew(coffeeType, 10);
    assertEquals(80, result.getBeans());

  }

  /**
   *
   */
  @Test(expected = IllegalStateException.class)
  public void testBrewCoffeeThrowIllegalStateException() {

    CoffeeType coffeeType = CoffeeType.Espresso;
    this.target.brew(coffeeType, 10);
  }

  /**
   *
   */
  @Test(expected = IllegalArgumentException.class)
  public void testBrewCoffeeThrowIllegalArgumentExceptionMilkIsNegativeValue() {

    this.target.restockBeans(200);
    this.target.restockMilk(0);
  }

  /**
   *
   */
  @Test
  public void testGetBeansAndMilk() {

    this.target.restockBeans(200);
    this.target.restockMilk(500);
    assertEquals(200, this.target.getBeansInStock());
    assertEquals(500, this.target.getMilkInStock());
  }

  /**
   *
   */
  @Test
  public void testCoffeeGettersAndSetters() {

    CoffeeType coffeeType = CoffeeType.valueOf("Latte");
    Coffee coffee = new Coffee(coffeeType, coffeeType.getRequiredBeans(), coffeeType.getRequiredMilk());
    assertEquals(7, coffee.getBeans());
    assertEquals(227, coffee.getMilk());
    assertEquals("Coffee{type=Latte, beans=7, milk=227}", coffee.toString());
    assertEquals(CoffeeType.Latte, coffee.getType());
    assertEquals(7, coffeeType.getRequiredBeans());
  }

}
