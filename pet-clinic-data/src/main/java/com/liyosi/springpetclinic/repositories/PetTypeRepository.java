package com.liyosi.springpetclinic.repositories;

import com.liyosi.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by liyosi on Aug, 2018
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
