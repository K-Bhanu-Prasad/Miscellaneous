package com.cg.controllers;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;

/**
 * @author bkuraman
 *
 */
@RestController
public class Controller2 {

  /* Fetch all employee details */

  @RequestMapping(value = "/Employees2")
  public ArrayList<Employee> getEmployees2() {

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

  @RequestMapping(value = "/Employees2/{name}")
  public Employee getEmployeeByName2(@PathVariable("name") String name) {

    Employee emp = new Employee();
    emp.setName(name);
    emp.setId(001);
    emp.setMobileNumber(9898787798L);
    return emp;
  }

  @RequestMapping(value = "/updateEmployee/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  public boolean updateEmployee(@PathVariable("name") String name, @RequestBody Employee emp) {

    System.out.println("Employee name : " + name);
    System.out.println("Employee Id: " + emp.getId());
    // System.out.println("Employee mobile number: " + emp.getMobileNumber());
    return true;
  }
}
