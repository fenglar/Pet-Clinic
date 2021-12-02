package pl.marcin.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.marcin.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
