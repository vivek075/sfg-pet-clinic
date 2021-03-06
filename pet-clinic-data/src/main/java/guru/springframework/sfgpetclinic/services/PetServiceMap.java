package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj);
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
