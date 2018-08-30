package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Visits;
import com.liyosi.springpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class VisitMapService extends AbstractMapService<Visits, Long> implements CrudService<Visits, Long> {

  @Override
  public Visits save(Visits visit) {
    if (visit.getPet() == null || visit.getPet().getId() == null ||
        visit.getPet().getOwner() == null || visit.getPet().getOwner().getId() == null) {

      throw new RuntimeException("Invalid visit");
    }

    return super.save(visit);
  }
}
