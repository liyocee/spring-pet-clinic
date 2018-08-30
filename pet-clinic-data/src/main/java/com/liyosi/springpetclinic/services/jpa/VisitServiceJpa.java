package com.liyosi.springpetclinic.services.jpa;

import com.liyosi.springpetclinic.model.Visits;
import com.liyosi.springpetclinic.repositories.VisitRepository;
import com.liyosi.springpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
@Profile("jpa")
public class VisitServiceJpa implements VisitService {

  private VisitRepository visitRepository;

  public VisitServiceJpa(VisitRepository visitRepository) {
    this.visitRepository = visitRepository;
  }

  @Override
  public Visits findById(Long aLong) {
    return visitRepository.findById(aLong).orElse(null);
  }

  @Override
  public Visits save(Visits object) {
    return visitRepository.save(object);
  }

  @Override
  public Set<Visits> findAll() {
    Set<Visits> visits = new HashSet<>();
    visitRepository.findAll().forEach(visits::add);
    return visits;
  }

  @Override
  public void delete(Visits object) {
    visitRepository.delete(object);
  }

  @Override
  public void deleteById(Long aLong) {
    visitRepository.deleteById(aLong);
  }
}
