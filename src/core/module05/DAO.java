package core.module05;

public interface DAO {
    Room save(Room room);
    Room delete(Room room);
    Room update(Room room);
    Room findBy(Room room);
}
