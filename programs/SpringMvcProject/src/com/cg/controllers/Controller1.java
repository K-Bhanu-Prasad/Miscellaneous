package com.cg.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entity.Employee;

/**
 * @author bkuraman
 *
 */
@Controller
public class Controller1 {

  @InitBinder
  public void initBinder(WebDataBinder binder) {

    binder.setDisallowedFields(new String[] { "mobileNumber", "address.pincode" });
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy*MM*dd");
    binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, false));
    binder.registerCustomEditor(String.class, "name", new EmployeeNameEditor());
  }

  @ModelAttribute
  public void addModelAttributes(Model model) {

    model.addAttribute("header1", "SpringMVC Project");
  }

  @RequestMapping("/welcome")
  public ModelAndView helloWorld() {

    ModelAndView modelandview = new ModelAndView("HelloPage");
    modelandview.addObject("message", "Welcome to MVC");

    Employee emp = new Employee();
    emp.setId(12);
    emp.setName("Bhanu");
    modelandview.addObject("employee", emp);
    System.out.println(emp);
    return modelandview;
  }

  @RequestMapping("/welcome/{username}")
  public ModelAndView helloWorldWithName(@PathVariable("username") String name) {

    ModelAndView modelandview = new ModelAndView("HelloPage");
    modelandview.addObject("message", "Welcome to MVC " + name);

    return modelandview;
  }

  @RequestMapping("/welcome/{username}/{country}")
  public ModelAndView helloWorldWithParams(@PathVariable Map<String, String> params) {

    ModelAndView modelandview = new ModelAndView("HelloPage");
    modelandview.addObject("message",
        "Welcome to MVC " + params.get("username") + ". You are from " + params.get("country"));

    return modelandview;
  }

  @RequestMapping("/studentForm")
  public ModelAndView studentForm() {

    return new ModelAndView("Form");
  }

  @RequestMapping("/studentDetails")
  public ModelAndView studentDetails(@RequestParam Map<String, String> requestParams) {

    ModelAndView modelandview = new ModelAndView("StudentDetails");
    modelandview.addObject("name", requestParams.get("studentName"));
    modelandview.addObject("marks", requestParams.get("studentMarks"));

    return modelandview;
  }

  @RequestMapping(value = "/employeeDetailsWithModel", method = RequestMethod.POST)
  public ModelAndView studentDetailsWithMode(@Valid @ModelAttribute("employee") Employee employee,
      BindingResult result) {

    if (result.hasErrors()) {
      return new ModelAndView("Form");

    }
    System.out.println(employee);
    return new ModelAndView("employeeDetails");

  }

  /* Fetch all employee details */
  @ResponseBody
  @RequestMapping(value = "/Employees")
  public ArrayList<Employee> getEmployees() {

    Employee e1 = new Employee();
    e1.setName("Student1");
    e1.setMobileNumber(9898989909L);

    Employee e2 = new Employee();
    e2.setName("Student2");
    e2.setMobileNumber(9898989909L);

    Employee e3 = new Employee();
    e3.setName("Student3");
    e3.setMobileNumber(9898989909L);

    ArrayList<Employee> list = new ArrayList<>();
    list.add(e1);
    list.add(e2);
    list.add(e3);

    return list;
  }

  /* Fetch a Employee record bases on name */
  @ResponseBody
  @RequestMapping(value = "/Employees/{name}")
  public Employee getEmployeeByName(@PathVariable("name") String name) {

    Employee emp = new Employee();
    emp.setName(name);
    emp.setId(001);
    emp.setMobileNumber(9898787798L);
    return emp;
  }
}
