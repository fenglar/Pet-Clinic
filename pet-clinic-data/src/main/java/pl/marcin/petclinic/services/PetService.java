package pl.marcin.petclinic.services;

import pl.marcin.petclinic.model.Owner;
import pl.marcin.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
