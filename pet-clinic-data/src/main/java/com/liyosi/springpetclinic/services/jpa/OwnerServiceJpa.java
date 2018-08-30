package com.liyosi.springpetclinic.services.jpa;

import com.liyosi.springpetclinic.model.Owner;
import com.liyosi.springpetclinic.repositories.OwnerRepository;
import com.liyosi.springpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
@Profile("jpa")
public class OwnerServiceJpa implements OwnerService {

  private final OwnerRepository ownerRepository;

  public OwnerServiceJpa(OwnerRepository ownerRepository) {
    this.ownerRepository = ownerRepository;
  }

  @Override
  public Owner findByLastName(String lastName) {
    return ownerRepository.findByLastName(lastName);
  }

  @Override
  public Owner findById(Long aLong) {
    return ownerRepository.findById(aLong).orElse(null);
  }

  @Override
  public Owner save(Owner object) {
    return ownerRepository.save(object);
  }

  @Override
  public Set<Owner> findAll() {
    Set<Owner> owners = new HashSet<>();
    ownerRepository.findAll().forEach(owners::add);
    return owners ;
  }

  @Override
  public void delete(Owner object) {
    ownerRepository.delete(object);
  }

  @Override
  public void deleteById(Long aLong) {
    ownerRepository.deleteById(aLong);

  }
}
