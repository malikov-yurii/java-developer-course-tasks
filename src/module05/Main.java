package module05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println(Arrays.toString(controller.requestRooms(200, 2, "NY", "Metropol")));
        System.out.println(Arrays.toString(controller.requestRooms(200, 2, "LA", "Plaza")));
        System.out.println(Arrays.toString(controller.requestRooms(300, 3, "Moscow", "Verkhovina")));
        System.out.println(Arrays.toString(controller.check(new BookingComAPI(), new GoogleAPI())));
        System.out.println(Arrays.toString(controller.check(new TripAdvisorAPI(), new GoogleAPI())));
        System.out.println(Arrays.toString(controller.check(new BookingComAPI(), new TripAdvisorAPI())));

    }
}
