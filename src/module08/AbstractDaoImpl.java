package module08;

import java.util.ArrayList;
import java.util.List;

public class AbstractDaoImpl<T extends BaseItem> implements AbstractDao<T> {
//  I'd like to create Map<Long, T> database = new HashMap<>(); but task 8.2 said it should be List out;
    List<T> out = new ArrayList<>();

    @Override
    public T save(T object) {
        return out.add(object) ? object : null;
    }

    @Override
    public void delete(T object) {
//        if (out.remove(object))
//            System.out.println("Removal failed: " + object + " was not found in out");
        out.remove(object);
    }

    @Override
    public void deleteAll(List<T> list) {
        out.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        out.addAll(list);
    }

    @Override
    public List<T> getList() {
        return out;
    }

    @Override
    public void deleteById(long id) {
        for (T item : out)
            if (item.getId() == id)
                out.remove(item);
    }

    @Override
    public T get(long id) {
        for (T item : out)
            if (item.getId() == id)
                return item;
        return null;
    }
}
