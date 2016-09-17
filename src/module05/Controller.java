package module05;

import java.util.*;

public class Controller {

    API apis[] = new API[]{new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Set<Room> roomsSet= new HashSet<>();
        for (API api : apis){
            Room roomsArr[] = api.findRooms(price, persons, city, hotel);
            if (roomsArr != null)
                roomsSet.addAll(Arrays.asList(roomsArr));
        }
        return roomsSet != null ? roomsSet.toArray(new Room[]{}) : null;
    }

    public Room[] check(API api1, API api2) {
        Set<Room> roomsSet = new HashSet<>();
        for (Room room1 : api1.findRooms(200, 2, "NY", "Metropol"))
            for (Room room2 : api2.findRooms(200, 2, "NY", "Metropol"))
                if (room1.equals(room2))
                    roomsSet.add(room1);
        return roomsSet.toArray(new Room[]{});
    }
}

