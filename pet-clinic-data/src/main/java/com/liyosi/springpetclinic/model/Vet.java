package com.liyosi.springpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "vet")
public class Vet extends Person {

  @Builder
  public Vet(String firstName, String lastName, Set<Speciality> specialities) {
    super(firstName, lastName);
    this.specialities = specialities;
  }

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
  private Set<Speciality> specialities = new HashSet<>();
}
