package com.liyosi.springpetclinic.model;

import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
public class Owner extends Person {
  private Set<Pet> pets;
  private String address;
  private String city;
  private String telephone;

  public Owner(Set<Pet> pets, String address, String city, String telephone) {
    this.pets = pets;
    this.address = address;
    this.city = city;
    this.telephone = telephone;
  }

  public Set<Pet> getPets() {
    return pets;
  }

  public void setPets(Set<Pet> pets) {
    this.pets = pets;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
}
