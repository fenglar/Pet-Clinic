package pl.marcin.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.marcin.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
