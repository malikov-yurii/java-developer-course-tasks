package module05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {
    private Room[] roomsArr;

    public BookingComAPI() {
        roomsArr = new Room[]{
                new Room(1, 200, 2, new Date(2000, 11, 20), "Metropol", "NY"),
                new Room(2, 200, 2, new Date(2000, 11, 21), "Plaza", "LA"),
                new Room(3, 300, 3, new Date(2000, 11, 22), "Verkhovina", "Moscow"),
                new Room(4, 300, 3, new Date(2000, 11, 23), "Patong Resort", "LA"),
                new Room(5, 400, 4, new Date(2000, 11, 24), "Metropol", "Moscow"),
        };
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        List<Room> roomsList = new ArrayList<>();
        for (Room room :
                roomsArr) {
            if (room.getPrice() == price &&
                    room.getPersons() == persons &&
                    room.getCityName().equals(city) &&
                    room.getHotelName().equals(hotel))
                roomsList.add(room);
        }
        return roomsList != null ? roomsList.toArray(new Room[]{}) : null;
    }
}
