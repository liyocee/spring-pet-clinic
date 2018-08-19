package com.liyosi.springpetclinic.model;

/**
 * Created by liyosi on Aug, 2018
 */
public class PetType extends BaseEntity {

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;
}
