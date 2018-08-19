package com.liyosi.springpetclinic.services;

import com.liyosi.springpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
public interface OwnerService {

  public Owner findByLastName(String lastName);

  public Owner findById(Long id);

  public Owner save(Owner owner);

  public Set<Owner> findAll();
}
