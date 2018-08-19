package com.liyosi.springpetclinic.services;

import com.liyosi.springpetclinic.model.Pet;

import java.util.Set;


/**
 * Created by liyosi on Aug, 2018
 */
public interface PetService {

  public Pet findById(Long id);

  public Pet save(Pet pet);

  public Set<Pet> findAll();
}
