package pl.konstanty.services.map;

import org.springframework.stereotype.Service;
import pl.konstanty.model.Vet;
import pl.konstanty.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap<T, ID> extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
