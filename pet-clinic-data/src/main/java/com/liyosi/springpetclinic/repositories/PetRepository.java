package com.liyosi.springpetclinic.repositories;

import com.liyosi.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by liyosi on Aug, 2018
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
