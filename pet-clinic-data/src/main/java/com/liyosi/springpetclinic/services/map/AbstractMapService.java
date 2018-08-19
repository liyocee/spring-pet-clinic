package com.liyosi.springpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by liyosi on Aug, 2018
 */
public abstract class AbstractMapService<T, ID> {

  protected Map<ID, T> map = new HashMap<>();

  public Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  public T findById(ID id) {
    return map.get(id);
  }

  public T save(ID id, T object) {
    map.put(id, object);
    return object;
  }

  public void delete(T object) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  public void deleteById(ID id) {
    map.remove(id);
  }
}
