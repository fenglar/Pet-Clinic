package pl.marcin.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.marcin.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
