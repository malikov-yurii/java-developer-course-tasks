package module05;

public interface RoomDAO {
    Room save(Room room);
    Room delete(Room room);
    Room update(Room room);
    Room findBy(Room room);
}
