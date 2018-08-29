package com.liyosi.springpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
@Entity
@Table(name = "owners")
public class Owner extends Person {

  @Column(name = "address")
  private String address;

  @Column(name = "city")
  private String city;

  @Column(name = "telephone")
  private String telephone;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
  private Set<Pet> pets = new HashSet<>();

  public Owner() {
  }

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
