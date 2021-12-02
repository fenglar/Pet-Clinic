package pl.marcin.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.marcin.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
