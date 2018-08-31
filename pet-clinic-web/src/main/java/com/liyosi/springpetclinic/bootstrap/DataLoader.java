package com.liyosi.springpetclinic.bootstrap;

import com.liyosi.springpetclinic.model.*;
import com.liyosi.springpetclinic.services.OwnerService;
import com.liyosi.springpetclinic.services.PetTypeService;
import com.liyosi.springpetclinic.services.SpecialityService;
import com.liyosi.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by liyosi on Aug, 2018
 */
@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;
  private final PetTypeService petTypeService;
  private final SpecialityService specialityService;

  public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
    this.specialityService = specialityService;
  }

  @Override
  public void run(String... args) throws Exception {

    if (petTypeService.findAll().size() == 0)
      loadData();
  }

  private void loadData() {
    PetType dog = new PetType();
    dog.setName("Dog");
    PetType saveDogType = petTypeService.save(dog);

    PetType cat = new PetType();
    dog.setName("Cat");
    PetType saveCatType = petTypeService.save(cat);

    System.out.println("Loaded Pet Types...");

    Speciality radiology = new Speciality();
    radiology.setDescription("Radiology");
    Speciality savedRadiology = specialityService.save(radiology);

    Speciality dentistry = new Speciality();
    dentistry.setDescription("Dentistry");
    Speciality savedDentistry = specialityService.save(dentistry);

    Speciality surgery = new Speciality();
    surgery.setDescription("Surgery");
    Speciality savedSurgery = specialityService.save(surgery);

    System.out.println("Loaded specialities..");

    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");
    owner1.setAddress("123 Brickrel");
    owner1.setCity("Miami");
    owner1.setTelephone("12122121");


    Pet mikesPet = new Pet();
    mikesPet.setName("Mikes Dog");
    mikesPet.setPetType(dog);
    mikesPet.setBirthDate(LocalDate.now());

    owner1.getPets().add(mikesPet);

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenane");
    owner2.setAddress("123 Lincoln Blvd");
    owner2.setCity("New York");
    owner2.setTelephone("2121212");

//    Owner.builder().address("fa").firstName("kl").lastName("blea").telephone("faj").build();

    Pet fionasCat = new Pet();
    fionasCat.setName("Fionas CAt");
    fionasCat.setPetType(cat);
    fionasCat.setBirthDate(LocalDate.now());

    owner2.getPets().add(fionasCat);

    ownerService.save(owner2);

    System.out.println("Loaded owners....");


    Vet vet1 = Vet.builder()
        .firstName("Sam")
        .lastName("Axe").build();

    vet1.getSpecialities().add(savedRadiology);

    vetService.save(vet1);

    Vet vet2 = Vet.builder().firstName("Jessie").lastName("Porter").build();

    vet2.getSpecialities().add(savedSurgery);

    vetService.save(vet2);

    System.out.println("Loaded vets..");
  }
}
