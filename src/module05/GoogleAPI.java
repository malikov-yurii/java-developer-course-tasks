package module05;

import java.util.Date;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI() {
        rooms = new Room[]{
                new Room(1, 200, 2, new Date(2000, 11 , 3), "Luch", "Gotem"),
                new Room(2, 200, 2, new Date(2000, 11 , 3), "Vostok", "SPB"),
                new Room(3, 300, 3, new Date(2000, 12 , 3), "Rostok", "Kiev"),
                new Room(4, 300, 3, new Date(2000, 12 , 1), "Mostok", "Lviv"),
                new Room(5, 400, 4, new Date(2000, 11 , 2), "Listok", "Ekaterinburg"),
        };
    }

    @Override
    public Room[] findRooms(int price, int person, String city, String hotel) {
        return null;
    }
}

