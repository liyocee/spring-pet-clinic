package com.liyosi.springpetclinic.services;

import com.liyosi.springpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
public interface VetService {

  public Vet findById(Long id);

  public Vet save(Vet vet);

  public Set<Vet> findAll();
}
