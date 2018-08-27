package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Owner;
import com.liyosi.springpetclinic.services.OwnerService;
import com.liyosi.springpetclinic.services.PetService;
import com.liyosi.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

  private final PetTypeService petTypeService;
  private final PetService petService;

  public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
    this.petTypeService = petTypeService;
    this.petService = petService;
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }

  @Override
  public Owner save(Owner object) {
    if (object != null) {
      if (object.getPets() != null) {
        object.getPets().forEach(pet -> {
          if (pet.getPetType().getId() != null) {
            pet.setPetType(petTypeService.save(pet.getPetType()));
          } else {
            throw new RuntimeException("Pet Type is required");
          }

          if (pet.getId() == null) {
            pet.setId((petService.save(pet).getId()));
          }
        });
      }
      return super.save(object);
    } else {
      return null;
    }

  }
}
