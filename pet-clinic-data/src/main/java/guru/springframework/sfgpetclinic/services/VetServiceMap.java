package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
