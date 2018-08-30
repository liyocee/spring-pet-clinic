package com.liyosi.springpetclinic.services.jpa;

import com.liyosi.springpetclinic.model.Speciality;
import com.liyosi.springpetclinic.repositories.SpecialityRepository;
import com.liyosi.springpetclinic.services.CrudService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
public class SpecialityService implements CrudService<Speciality, Long> {
  private final SpecialityRepository specialityRepository;

  public SpecialityService(SpecialityRepository specialityRepository) {
    this.specialityRepository = specialityRepository;
  }

  @Override
  public Speciality findById(Long aLong) {
    return specialityRepository.findById(aLong).orElse(null);
  }

  @Override
  public Speciality save(Speciality object) {
    return specialityRepository.save(object);
  }

  @Override
  public Set<Speciality> findAll() {
    Set<Speciality> specialities = new HashSet<>();
    specialityRepository.findAll().forEach(specialities::add);
    return specialities;
  }

  @Override
  public void delete(Speciality object) {
    specialityRepository.delete(object);
  }

  @Override
  public void deleteById(Long aLong) {
    specialityRepository.deleteById(aLong);
  }
}
