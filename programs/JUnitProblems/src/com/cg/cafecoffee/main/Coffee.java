package com.cg.cafecoffee.main;

/**
 * An individual coffee that has been served.
 */
public final class Coffee {

  private final CoffeeType type;

  private final int beans;

  private final int milk;

  public Coffee(CoffeeType coffeeType, int beans, int milk) {
    this.type = coffeeType;
    this.beans = beans;
    this.milk = milk;
  }

  public CoffeeType getType() {

    return this.type;
  }

  public int getBeans() {

    return this.beans;
  }

  public int getMilk() {

    return this.milk;
  }

  @Override
  public String toString() {

    return "Coffee{" + "type=" + this.type + ", beans=" + this.beans + ", milk=" + this.milk + '}';
  }
}
