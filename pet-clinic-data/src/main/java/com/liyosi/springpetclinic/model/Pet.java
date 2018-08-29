package com.liyosi.springpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by liyosi on Aug, 2018
 */
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

  @Column(name = "birth_date")
  private LocalDate birthDate;

  @Column(name = "name")
  private String name;

  @ManyToOne
  @JoinColumn(name = "owner_id")
  private Owner owner;

  @ManyToOne
  @JoinColumn(name = "type_id")
  private PetType petType;

  public PetType getPetType() {
    return petType;
  }

  public void setPetType(PetType petType) {
    this.petType = petType;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
