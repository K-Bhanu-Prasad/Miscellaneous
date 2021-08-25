package com.cg.entity;

import javax.validation.constraints.Size;

/**
 * @author bkuraman
 *
 */
public class Address {

  @Size(min = 5, max = 20)
  private String country;

  private String state;

  private String city;

  private Long pincode;

  /**
   * @return country
   */
  public String getCountry() {

    return this.country;
  }

  /**
   * @param country new value of {@link #getcountry}.
   */
  public void setCountry(String country) {

    this.country = country;
  }

  /**
   * @return state
   */
  public String getState() {

    return this.state;
  }

  /**
   * @param state new value of {@link #getstate}.
   */
  public void setState(String state) {

    this.state = state;
  }

  /**
   * @return city
   */
  public String getCity() {

    return this.city;
  }

  /**
   * @param city new value of {@link #getcity}.
   */
  public void setCity(String city) {

    this.city = city;
  }

  /**
   * @return pincode
   */
  public Long getPincode() {

    return this.pincode;
  }

  /**
   * @param pincode new value of {@link #getpincode}.
   */
  public void setPincode(Long pincode) {

    this.pincode = pincode;
  }

  @Override
  public String toString() {

    return "Address [country=" + this.country + ", state=" + this.state + ", city=" + this.city + ", pincode="
        + this.pincode + "]";
  }

}
