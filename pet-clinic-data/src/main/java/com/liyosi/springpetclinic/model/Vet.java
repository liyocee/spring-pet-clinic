package com.liyosi.springpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
@Entity
@Table(name = "vet")
public class Vet extends Person {

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
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
