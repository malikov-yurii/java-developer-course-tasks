package module05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API {
    private Room[] roomsArr;

    public TripAdvisorAPI() {
        roomsArr = new Room[]{
                new Room(1, 200, 2, new Date(2000, 11, 20), "Metropol", "NY"),
                new Room(2, 200, 2, new Date(2000, 3, 21), "Riza", "Vankuver"),
                new Room(3, 300, 3, new Date(2000, 4, 22), "Viza", "Reikyavik"),
                new Room(4, 300, 3, new Date(2000, 5, 23), "Maza", "Alma-Ata"),
                new Room(5, 400, 4, new Date(2000, 6, 24), "Haza", "Ierusalim")
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
