package com.cg.daysbetweendates.main.dto;

/**
 * @author bkuraman
 *
 */
public class Date {

  private int day;

  private int month;

  private int year;

  /**
   * @return day
   */
  public int getDay() {

    return this.day;
  }

  /**
   * @param day new value of {@link #getday}.
   */
  public void setDay(int day) {

    this.day = day;
  }

  /**
   * @return month
   */
  public int getMonth() {

    return this.month;
  }

  /**
   * @param month new value of {@link #getmonth}.
   */
  public void setMonth(int month) {

    this.month = month;
  }

  /**
   * @return year
   */
  public int getYear() {

    return this.year;
  }

  /**
   * @param year new value of {@link #getyear}.
   */
  public void setYear(int year) {

    this.year = year;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = 1;
    result = prime * result + this.day;
    result = prime * result + this.month;
    result = prime * result + this.year;
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Date other = (Date) obj;
    if (this.day != other.day)
      return false;
    if (this.month != other.month)
      return false;
    if (this.year != other.year)
      return false;
    return true;
  }

  /**
   *
   */
  @Override
  public String toString() {

    return "[" + this.day + "/" + this.month + "/" + this.year + "]";
  }

}
