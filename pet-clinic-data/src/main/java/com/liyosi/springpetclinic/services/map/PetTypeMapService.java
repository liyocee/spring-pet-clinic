package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.PetType;
import com.liyosi.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
