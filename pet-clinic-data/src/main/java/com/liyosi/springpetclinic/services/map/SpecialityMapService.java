package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.Speciality;
import com.liyosi.springpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by liyosi on Aug, 2018
 */
@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
