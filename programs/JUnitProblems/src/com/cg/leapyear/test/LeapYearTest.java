package com.cg.leapyear.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.leapyear.main.LeapYear;

/**
 * @author bkuraman
 *
 */
public class LeapYearTest {

  public LeapYear target;

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {

    this.target = new LeapYear();
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
  public void testIfYearIsLeapYear() {

    assertTrue(LeapYear.isLeap(2000));
  }

  /**
   *
   */
  @Test
  public void testIfYearIsNotLeapYear() {

    assertFalse(LeapYear.isLeap(1994));
  }

  /**
   *
   */
  @Test
  public void testIfYearIsNotLeapYearCase2() {

    assertFalse(LeapYear.isLeap(1900));
  }

  /**
   *
   */
  @Test
  public void testIfYearIsNotLeapYearCase3() {

    assertFalse(LeapYear.isLeap(1994));
  }

}
