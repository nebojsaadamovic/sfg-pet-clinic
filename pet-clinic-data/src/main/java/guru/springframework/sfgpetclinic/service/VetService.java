package guru.springframework.sfgpetclinic.service;


import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public class VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
