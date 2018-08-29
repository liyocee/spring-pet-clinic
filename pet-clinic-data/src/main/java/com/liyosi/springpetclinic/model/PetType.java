package com.liyosi.springpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by liyosi on Aug, 2018
 */
@Entity
@Table(name = "pet_types")
public class PetType extends BaseEntity {

  @Column(name = "name")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
