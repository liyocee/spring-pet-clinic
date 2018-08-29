package com.liyosi.springpetclinic.repositories;

import com.liyosi.springpetclinic.model.Visits;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by liyosi on Aug, 2018
 */
public interface VisitRepository extends CrudRepository<Visits, Long> {
}
