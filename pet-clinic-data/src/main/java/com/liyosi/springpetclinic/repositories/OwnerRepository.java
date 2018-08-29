package com.liyosi.springpetclinic.repositories;

import com.liyosi.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by liyosi on Aug, 2018
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Owner findByLastName(String lastName);
}
