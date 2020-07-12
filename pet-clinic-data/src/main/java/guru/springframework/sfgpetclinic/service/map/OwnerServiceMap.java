package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService implements CrudService {


    public Set<Owner> findAll() {
        return super.findAll();
    }

    public Owner findById(Long id) {
        return map.get(id);
    }


    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public void delete(Owner object) {
        super.delete(object);
    }

    public Owner save(Owner object) {
        return super.save(object);
    }
}
