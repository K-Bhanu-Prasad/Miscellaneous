package com.cg.daysbetweendates.test.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cg.daysbetweendates.main.dto.Date;
import com.cg.daysbetweendates.main.exceptions.DateException;
import com.cg.daysbetweendates.main.service.DateService;

/**
 * @author bkuraman
 *
 */

public class DateServiceImpl {

  DateService dateServiceMock;

  @Before
  public void setUp() throws Exception {

    this.dateServiceMock = new com.cg.daysbetweendates.main.service.DateServiceImpl();
  }

  @Test
  public void testCalculateDays() {

    String startDate = "29/10/1995";
    String endDate = "31/10/1995";

    long result = this.dateServiceMock.calculateDays(startDate, endDate);
    assertEquals(result, 2);

  }

  /**
   * @throws DateException DateException
   */
  @Test(expected = DateException.class)
  public void testValidateDate_invalidDate() throws DateException {

    Date date = new Date();
    date.setDay(56);
    date.setMonth(12);
    date.setYear(2018);

    date.getDay();
    date.getMonth();
    date.getYear();

    this.dateServiceMock.validateDate(date);

  }

  /**
   * @throws DateException DateException
   */
  @Test(expected = DateException.class)
  public void testConvertToDate_invalidString() throws DateException {

    String date = "test";
    this.dateServiceMock.convertToDate(date);
  }

  /**
   * @throws DateException DateException
   */
  @Test(expected = DateException.class)
  public void testConvertToDate_numberFormatException() throws DateException {

    String date = "test/test/test";
    this.dateServiceMock.convertToDate(date);
  }
}
