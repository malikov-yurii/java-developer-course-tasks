package module05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {

    API apis[] = new API[]{new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        List<Room> rooms = new ArrayList<>();
        for (API api : apis)
            rooms.addAll(Arrays.asList(api.findRooms(price, persons, city, hotel)));
        return (Room[]) rooms.toArray();
    }

    public Room[] check(API api1, API api2) {
        List<Room> rooms = new ArrayList<>();
        for (Room room1 : api1.findRooms(200, 2, "Metropol", "NY"))
            for (Room room2 : api2.findRooms(200, 2, "Metropol", "NY"))
                if (room1.equals(room2))
                    rooms.add(room1);
        return (Room[]) rooms.toArray();
    }
}

