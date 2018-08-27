package com.liyosi.springpetclinic.model;

import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
public class Owner extends Person {
  private Set<Pet> pets;

  public Owner(Set<Pet> pets) {
    this.pets = pets;
  }

  public Set<Pet> getPets() {
    return pets;
  }

  public void setPets(Set<Pet> pets) {
    this.pets = pets;
  }
}
