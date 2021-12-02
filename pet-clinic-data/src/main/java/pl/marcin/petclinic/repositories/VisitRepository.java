package pl.marcin.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.marcin.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
