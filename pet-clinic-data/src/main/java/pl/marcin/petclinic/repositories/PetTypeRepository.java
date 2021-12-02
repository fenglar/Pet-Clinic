package pl.marcin.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.marcin.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
