package com.liyosi.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
public class Vet extends Person {

  private Set<Speciality> specialities = new HashSet<>();

  public Vet() {
  }

  public Vet(Set<Speciality> specialities) {
    this.specialities = specialities;
  }

  public Set<Speciality> getSpecialities() {
    return specialities;
  }

  public void setSpecialities(Set<Speciality> specialities) {
    this.specialities = specialities;
  }
}
