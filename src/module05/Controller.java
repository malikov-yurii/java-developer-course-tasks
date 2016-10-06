package module05;

import java.util.*;

public class Controller {

    Set<API> apis = new HashSet<>(Arrays.asList(new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()));

    public Set<Room> requestRooms(int price, int persons, String city, String hotel) {
        Set<Room> resultSet = new HashSet<>();
        for (API api : apis)
            resultSet.addAll(api.findRooms(price, persons, city, hotel));
        return resultSet;
    }

    public Set<Room> check(API api1, API api2) {
        Set<Room> resultSet = new HashSet<>();
        for (Room room1 : api1.findRooms(200, 2, "NY", "Metropol"))
            for (Room room2 : api2.findRooms(200, 2, "NY", "Metropol"))
                if (room1.equals(room2))
                    resultSet.add(room1);
        return resultSet;
    }
}

