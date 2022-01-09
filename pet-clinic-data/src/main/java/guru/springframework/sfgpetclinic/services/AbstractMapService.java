package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
      return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T obj) {
        if(obj!=null) {
            if(obj.getId()==null) {
                obj.setId(getNextId());
            }
            map.put(obj.getId(), obj);
        } else {
            throw new RuntimeException("Object cannot be null..");
        }
        return obj;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T obj) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(obj));
    }

    private Long getNextId() {
        Long nextID = null;
        try {
            nextID = Collections.max(map.keySet())+1;
        } catch (NoSuchElementException e) {
            nextID = 1L;
        }
        return nextID;
    }
}
