package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Vet;
import com.liyosi.springpetclinic.services.SpecialityService;
import com.liyosi.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  private final SpecialityService specialityService;

  public VetServiceMap(SpecialityService specialityService) {
    this.specialityService = specialityService;
  }

  @Override
  public Vet save(Vet object) {

   if (object != null)  {
     object.getSpecialities().forEach(speciality -> {
      if (speciality.getId() == null)  {
        speciality.setId((specialityService.save(speciality)).getId());
      }
     });
     return super.save(object);
   }
   return null;
  }
}
