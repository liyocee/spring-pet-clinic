package com.liyosi.springpetclinic.services;

import com.liyosi.springpetclinic.model.Owner;

/**
 * Created by liyosi on Aug, 2018
 */
public interface OwnerService extends CrudService<Owner, Long> {

  public Owner findByLastName(String lastName);
}
