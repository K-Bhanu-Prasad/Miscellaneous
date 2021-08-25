package com.cg.daysbetweendates.main.service;

import com.cg.daysbetweendates.main.dto.Date;
import com.cg.daysbetweendates.main.exceptions.DateException;

/**
 * @author bkuraman
 *
 */
public interface DateService {

  /**
   * @param dateAsString date
   * @return Date convertedDate
   * @throws DateException DateException
   */
  public Date convertToDate(String dateAsString) throws DateException;

  /**
   * @param date Date
   * @throws DateException DateException
   */
  public void validateDate(Date date) throws DateException;

  /**
   * @param date1 date1
   * @param date2 date2
   * @return difference between dates
   */
  public long getDifferenceBetweenDates(Date date1, Date date2);

  /**
   * @param startDateAsString StartDate
   * @param endDateAsString endDate
   * @return numberOfDays
   */
  public long calculateDays(String startDateAsString, String endDateAsString);

}
