package com.liyosi.springpetclinic.bootstrap;

import com.liyosi.springpetclinic.model.Owner;
import com.liyosi.springpetclinic.model.Vet;
import com.liyosi.springpetclinic.services.OwnerService;
import com.liyosi.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by liyosi on Aug, 2018
 */
@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception {

    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenane");

    ownerService.save(owner2);

    System.out.println("Loaded owners....");

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");

    vetService.save(vet2);

    System.out.println("Loaded vets..");
  }
}
