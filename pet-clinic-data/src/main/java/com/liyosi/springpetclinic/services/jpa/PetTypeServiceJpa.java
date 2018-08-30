package com.liyosi.springpetclinic.services.jpa;

import com.liyosi.springpetclinic.model.PetType;
import com.liyosi.springpetclinic.repositories.PetTypeRepository;
import com.liyosi.springpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
@Profile("jpa")
public class PetTypeServiceJpa implements PetTypeService {
  private final PetTypeRepository petTypeRepository;

  public PetTypeServiceJpa(PetTypeRepository petTypeRepository) {
    this.petTypeRepository = petTypeRepository;
  }

  @Override
  public PetType findById(Long aLong) {
    return petTypeRepository.findById(aLong).orElse(null);
  }

  @Override
  public PetType save(PetType object) {
    return petTypeRepository.save(object);
  }

  @Override
  public Set<PetType> findAll() {
    Set<PetType> petTypes = new HashSet<>();
    petTypeRepository.findAll().forEach(petTypes::add);
    return petTypes;
  }

  @Override
  public void delete(PetType object) {
    petTypeRepository.delete(object);
  }

  @Override
  public void deleteById(Long aLong) {
    petTypeRepository.deleteById(aLong);
  }
}
