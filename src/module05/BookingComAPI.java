package module05;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI() {
        rooms = new Room[]{
            new Room(1, 200, 2, new Date(2000, 11 , 20), "Metropol", "NY"),
            new Room(2, 200, 2, new Date(2000, 11 , 21), "Plaza", "LA"),
            new Room(3, 300, 3, new Date(2000, 11 , 22), "Verkhovina", "Moscow"),
            new Room(4, 300, 3, new Date(2000, 11 , 23), "Patong Resort", "LA"),
            new Room(5, 400, 4, new Date(2000, 11 , 24), "Metropol", "Moscow"),
        };
    }

    @Override
    public Room[] findRooms(int price, int person, String city, String hotel) {
        return null;
    }
}
