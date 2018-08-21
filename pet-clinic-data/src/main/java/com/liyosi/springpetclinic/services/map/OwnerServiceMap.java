package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Owner;
import com.liyosi.springpetclinic.services.OwnerService;

/**
 * Created by liyosi on Aug, 2018
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

  @Override
  public Owner save(Owner object) {
    super.save(object.getId(), object);
    return object;
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }
}
