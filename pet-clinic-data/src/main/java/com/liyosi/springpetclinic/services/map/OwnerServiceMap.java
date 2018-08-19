package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Owner;
import com.liyosi.springpetclinic.services.CrudService;

/**
 * Created by liyosi on Aug, 2018
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

  @Override
  public Owner save(Owner object) {
    super.save(object.getId(), object);
    return object;
  }
}
