package com.liyosi.springpetclinic.services.map;

import com.liyosi.springpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by liyosi on Aug, 2018
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

  protected Map<Long, T> map = new HashMap<>();

  public Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  public T findById(ID id) {
    return map.get(id);
  }

  public T save(T object) {

    if (object != null && object.getId() == null) {
      object.setId(getNextId());

      map.put(object.getId(), object);
    }
    return object;
  }

  public void delete(T object) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  public void deleteById(ID id) {
    map.remove(id);
  }

  private Long getNextId() {
    if (map.isEmpty())
      return 1L;

    return Collections.max(map.keySet()) + 1;
  }
}
