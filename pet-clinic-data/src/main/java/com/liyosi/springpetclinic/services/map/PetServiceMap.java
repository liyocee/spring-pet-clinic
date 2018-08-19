package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Pet;
import com.liyosi.springpetclinic.services.CrudService;

/**
 * Created by liyosi on Aug, 2018
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

  @Override
  public Pet save(Pet object) {
    super.save(object.getId(), object);
    return object;
  }
}
