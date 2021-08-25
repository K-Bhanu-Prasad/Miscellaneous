package com.cg.controllers;

import java.beans.PropertyEditorSupport;

/**
 * @author bkuraman
 *
 */
public class EmployeeNameEditor extends PropertyEditorSupport {

  @Override
  public void setAsText(String employeeName) throws IllegalArgumentException {

    if (employeeName.contains("Mr.") || employeeName.contains("Ms.")) {
      setValue(employeeName);
    } else {
      setValue("Ms." + employeeName);
    }
  }
}
