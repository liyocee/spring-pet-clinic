package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Vet;
import com.liyosi.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
}
