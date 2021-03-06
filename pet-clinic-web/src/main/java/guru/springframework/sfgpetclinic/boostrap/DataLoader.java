package guru.springframework.sfgpetclinic.boostrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.PetTypeService;
import guru.springframework.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService=petTypeService;
    }






    @Override
    public void run(String... args) throws Exception {

        PetType dog=new PetType();
        dog.setName("Dog");
        PetType savedDogType=petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("Cat");
        PetType saveCatType=petTypeService.save(cat);



        Owner owner1=new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAdress("Avoja  62");
        owner1.setCity("Podgorica");
        owner1.setTelephone("067220609");

        Pet mikesPet=new Pet();
        mikesPet.setPetType(savedDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rocco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2=new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenane");
        owner2.setAdress("Avoja  62");
        owner2.setCity("Podgorica");
        owner2.setTelephone("067220609");

        Pet fioansCat=new Pet();
        fioansCat.setName("Just Cat");
        fioansCat.setBirthDate(LocalDate.now());
        fioansCat.setOwner(owner2);
        fioansCat.setPetType(saveCatType);
        owner2.getPets().add(fioansCat);
        ownerService.save(owner2);
        System.out.println("Loaded Owners...");

        Vet vet1=new Vet();
       // vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2=new Vet();
       // vet2.setId(2L);
        vet2.setFirstName("Jesie ");
        vet2.setLastName("Portew");
        vetService.save(vet2);

        System.out.println("Loaded vet...");






    }
}
