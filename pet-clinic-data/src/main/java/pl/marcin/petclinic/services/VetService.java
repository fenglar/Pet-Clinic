package pl.marcin.petclinic.services;

import pl.marcin.petclinic.model.Owner;
import pl.marcin.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
