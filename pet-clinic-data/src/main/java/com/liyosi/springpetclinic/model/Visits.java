package com.liyosi.springpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by liyosi on Aug, 2018
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visits extends BaseEntity {

  @Column(name = "date")
  private LocalDate date;

  @Column(name = "description")
  private String description;

  @ManyToOne()
  @JoinColumn(name = "pet_id")
  private Pet pet;
}
