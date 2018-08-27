package com.liyosi.springpetclinic.model;

/**
 * Created by liyosi on Aug, 2018
 */
public class Speciality extends BaseEntity {

  private String description;

  public Speciality(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
