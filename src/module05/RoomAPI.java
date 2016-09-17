package module05;

public interface RoomAPI {
    Room[] findRooms(int price, int person, String city, String hotel);
}
