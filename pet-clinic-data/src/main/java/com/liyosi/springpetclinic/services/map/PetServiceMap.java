package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Pet;
import com.liyosi.springpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
