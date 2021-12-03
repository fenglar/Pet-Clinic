package pl.marcin.petclinic.services;

import pl.marcin.petclinic.model.Owner;
import pl.marcin.petclinic.model.Vet;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
