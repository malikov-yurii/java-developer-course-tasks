package module05;

import java.util.Set;

public interface API {
    Set<Room> findRooms(int price, int persons, String city, String hotel);
}
