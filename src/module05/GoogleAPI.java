package module05;

import java.util.Date;

public class GoogleAPI implements RoomAPI {
    private Room[] rooms;

    public GoogleAPI() {
        rooms = new Room[]{
                new Room(1, 200, 2, new Date(2000, 11 , 20), "Metropol", "NY"),
                new Room(2, 200, 2, new Date(2000, 11 , 21), "Metropol", "NY"),
                new Room(3, 300, 3, new Date(2000, 11 , 22), "Metropol", "NY"),
                new Room(4, 300, 3, new Date(2000, 11 , 23), "Metropol", "NY"),
                new Room(5, 400, 4, new Date(2000, 11 , 24), "Metropol", "NY"),
        };
    }

    @Override
    public Room[] findRooms(int price, int person, String city, String hotel) {
        return null;
    }
}

