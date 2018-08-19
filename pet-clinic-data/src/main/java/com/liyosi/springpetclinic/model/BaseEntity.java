package com.liyosi.springpetclinic.model;

import java.io.Serializable;

/**
 * Created by liyosi on Aug, 2018
 */
public class BaseEntity implements Serializable {
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
