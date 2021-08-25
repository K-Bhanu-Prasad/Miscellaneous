package com.cg.daysbetweendates.main.service;

import java.util.logging.Logger;

import com.cg.daysbetweendates.main.dto.Date;
import com.cg.daysbetweendates.main.exceptions.DateException;

/**
 * @author bkuraman
 *
 */
public class DateServiceImpl implements DateService {

  private static final Logger LOGGER = Logger.getLogger(DateServiceImpl.class.getName());

  // This function returns the number of days in a month of the year
  private int daysInMonth(int month, int year) {

    switch (month) {
    case 2:
      return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
    case 4:
    case 6:
    case 9:
    case 11:
      return 30;
    default:
      return 31;
    }
  }

  // This function counts number of leap years before the given date

  private int countLeapYears(Date date) {

    int years = date.getYear() - 1;
    return years / 4 - years / 100 + years / 400;

  }

  /**
   * @param dateAsString Date as String
   * @return converted Date from dateAsString
   * @throws DateException DateException
   */
  @Override
  public Date convertToDate(String dateAsString) throws DateException {

    String[] dateValues = dateAsString.split("/");

    Date date = new Date();
    if (dateValues.length == 3) {
      try {
        date.setDay(Integer.valueOf(dateValues[0]));
        date.setMonth(Integer.valueOf(dateValues[1]));
        date.setYear(Integer.valueOf(dateValues[2]));
      } catch (NumberFormatException nfe) {
        throw new DateException("INVALID DATE: Date should contain only numbers " + "[" + dateAsString + "]");
      }

    } else {
      throw new DateException("INVALID DATE: Date should contain DD/MM/YYYY " + "[" + dateAsString + "]");
    }

    return date;
  }

  /**
   * @param date date
   * @throws DateException DateException
   */
  @Override
  public void validateDate(Date date) throws DateException {

    int day = date.getDay();
    int month = date.getMonth();
    int year = date.getYear();

    boolean isValid = month > 0 && month <= 12 && day > 0 && day <= daysInMonth(month, year);
    if (!isValid) {
      throw new DateException("INVALID DATE: No date exists " + date);
    }

  }

  /**
   * @param date1 date1
   * @param date2 date2
   * @return difference of days
   */
  @Override
  public long getDifferenceBetweenDates(Date date1, Date date2) {

    // initialize count using years and day
    long numberOfdaysDate1 = date1.getYear() * 365 + date1.getDay();

    // Add days for months in given date
    for (int i = 1; i < date1.getMonth(); i++) {
      numberOfdaysDate1 += daysInMonth(i, date1.getYear());
    }

    // Since every leap year is of 366 days,
    // Add a day for every leap year
    numberOfdaysDate1 += countLeapYears(date1);

    // SIMILARLY, COUNT TOTAL NUMBER OF DAYS BEFORE 'date2'

    long numberOfdaysDate2 = date2.getYear() * 365 + date2.getDay();
    for (int i = 1; i < date2.getMonth(); i++) {
      numberOfdaysDate2 += daysInMonth(i, date2.getYear());
    }

    numberOfdaysDate2 += countLeapYears(date2);

    // return difference between two noOfdays
    return numberOfdaysDate2 - numberOfdaysDate1;
  }

  /**
   * @param startDateAsString startDateAsString
   * @param endDateAsString endDateAsString
   * @return noOfDays
   */
  @Override
  public long calculateDays(String startDateAsString, String endDateAsString) {

    Date startDate = new Date();
    Date endDate = new Date();

    try {

      // Convert String to Date
      startDate = convertToDate(startDateAsString);
      endDate = convertToDate(endDateAsString);

      // Validate Date
      validateDate(startDate);
      validateDate(endDate);

      return getDifferenceBetweenDates(startDate, endDate);

    } catch (DateException ie) {
      System.out.println(ie.getMessage());
      System.out.println("----------------------------");
      LOGGER.info(ie.getMessage());
    }
    return 0;

  }

}
