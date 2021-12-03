package pl.marcin.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.marcin.petclinic.model.PetType;
import pl.marcin.petclinic.services.PetTypeService;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return null;
    }

    @Override
    public PetType findById(Long id) {
        return null;
    }

    @Override
    public PetType save(PetType object) {
        return null;
    }

    @Override
    public void delete(PetType object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
