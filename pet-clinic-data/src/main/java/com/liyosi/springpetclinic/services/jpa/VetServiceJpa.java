package com.liyosi.springpetclinic.services.jpa;

import com.liyosi.springpetclinic.model.Vet;
import com.liyosi.springpetclinic.repositories.VetRepository;
import com.liyosi.springpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
@Profile("jpa")
public class VetServiceJpa implements VetService {

  private final VetRepository vetRepository;

  public VetServiceJpa(VetRepository vetRepository) {
    this.vetRepository = vetRepository;
  }

  @Override
  public Vet findById(Long aLong) {
    return vetRepository.findById(aLong).orElse(null);
  }

  @Override
  public Vet save(Vet object) {
    return vetRepository.save(object);
  }

  @Override
  public Set<Vet> findAll() {
    Set<Vet> vets = new HashSet<>();
    vetRepository.findAll().forEach(vets::add);
    return vets;
  }

  @Override
  public void delete(Vet object) {
    vetRepository.delete(object);
  }

  @Override
  public void deleteById(Long aLong) {
    vetRepository.deleteById(aLong);
  }
}
