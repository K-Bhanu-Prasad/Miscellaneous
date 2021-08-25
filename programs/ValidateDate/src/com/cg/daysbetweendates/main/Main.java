package com.cg.daysbetweendates.main;

import java.util.Scanner;

import com.cg.daysbetweendates.main.service.DateService;
import com.cg.daysbetweendates.main.service.DateServiceImpl;

/**
 * @author bkuraman
 *
 */
public class Main {

  /**
   * @param args args
   */
  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter date 1 (DD/MM/YYYY) : ");
    String date1 = userInput.next();

    System.out.println("Enter date 2 (DD/MM/YYYY) :  ");
    String date2 = userInput.next();

    System.out.println("----------------------------");
    DateService dateFunctions = new DateServiceImpl();

    long days = dateFunctions.calculateDays(date1, date2);

    if (days != 0) {
      System.out.println("Number of days : " + days);
      System.out.println("----------------------------");
      System.out.println("Number of weeks: " + days / 7);
    }

  }

}
