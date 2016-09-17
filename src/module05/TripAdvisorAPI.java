package module05;

import java.util.Date;

public class TripAdvisorAPI implements API {
    private Room[] rooms;

    public TripAdvisorAPI() {
        rooms = new Room[]{
            new Room(1, 200, 2, new Date(2000, 11 , 20), "Giza", "NY"),
                    new Room(2, 200, 2, new Date(2000, 3 , 21), "Riza", "Vankuver"),
                    new Room(3, 300, 3, new Date(2000, 4 , 22), "Viza", "Reikyavik"),
                    new Room(4, 300, 3, new Date(2000, 5 , 23), "Maza", "Alma-Ata"),
                    new Room(5, 400, 4, new Date(2000, 6 , 24), "Haza", "Ierusalim")
        };
    }

    @Override
    public Room[] findRooms(int price, int person, String city, String hotel) {
        return null;
    }
}
