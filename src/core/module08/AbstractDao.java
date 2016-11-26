package core.module08;

import java.util.List;

public interface AbstractDao<T extends TypeWithId> {
    T save(T object);
    void delete(T object);
    void deleteAll(List<T> list);
    void saveAll(List<T> list);
    List<T> getList();
    void deleteById(long id);
    T get(long id);
}
