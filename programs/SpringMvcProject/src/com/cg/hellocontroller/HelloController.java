/*
package com.cg.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.cg.entity.Employee;

*/
/**
 * @author bkuraman
 *
 *//*

public class HelloController extends AbstractController {

  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

    ModelAndView modelandview = new ModelAndView("HelloPage");
    modelandview.addObject("message", "Welcome to MVC");

    Employee emp = new Employee();
    emp.setId(12);
    emp.setName("Bhanu");
    modelandview.addObject("employee", emp);
    System.out.println(emp);
    return modelandview;
  }

}
*/
