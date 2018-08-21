package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Vet;
import com.liyosi.springpetclinic.services.VetService;

/**
 * Created by liyosi on Aug, 2018
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  @Override
  public Vet save(Vet object) {
    super.save(object.getId(), object);
    return object;
  }
}
