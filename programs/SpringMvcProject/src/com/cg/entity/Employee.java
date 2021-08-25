package com.cg.entity;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author bkuraman
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({ "employeeSkills" })
@JsonPropertyOrder({ "name", "id", "mobile_No", "dob", "employeeSkills", "address" })
public class Employee {

  private int id;

  // @Size(min = 5, max = 30, message="min 5 and max 30")
  @Size(min = 5, max = 30)
  @Pattern(regexp = "[^0-9]*")
  private String name;

  @JsonProperty("mobile_No")
  private Long mobileNumber;

  @Past
  private Date dob;

  private List<String> employeeSkills;

  private Address address;

  /**
   * @return id
   */
  public int getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getid}.
   */
  public void setId(int id) {

    this.id = id;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return mobileNumber
   */
  public Long getMobileNumber() {

    return this.mobileNumber;
  }

  /**
   * @param mobileNumber new value of {@link #getmobileNumber}.
   */
  public void setMobileNumber(Long mobileNumber) {

    this.mobileNumber = mobileNumber;
  }

  /**
   * @return dob
   */
  public Date getDob() {

    return this.dob;
  }

  /**
   * @param dob new value of {@link #getdob}.
   */
  public void setDob(Date dob) {

    this.dob = dob;
  }

  /**
   * @return studentSkills
   */
  public List<String> getEmployeeSkills() {

    return this.employeeSkills;
  }

  /**
   * @param studentSkills new value of {@link #getstudentSkills}.
   */
  public void setEmployeeSkills(List<String> studentSkills) {

    this.employeeSkills = studentSkills;
  }

  /**
   * @return address
   */
  public Address getAddress() {

    return this.address;
  }

  /**
   * @param address new value of {@link #getaddress}.
   */
  public void setAddress(Address address) {

    this.address = address;
  }

  @Override
  public String toString() {

    return "Employee [id=" + this.id + ", name=" + this.name + ", mobileNumber=" + this.mobileNumber + ", dob="
        + this.dob + ", employeeSkills=" + this.employeeSkills + "]";
  }
}