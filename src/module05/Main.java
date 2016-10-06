package module05;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println(controller.requestRooms(200, 2, "NY", "Metropol"));
        System.out.println(controller.requestRooms(200, 2, "LA", "Plaza"));
        System.out.println(controller.requestRooms(300, 3, "Moscow", "Verkhovina"));
        System.out.println(controller.check(new BookingComAPI(), new GoogleAPI()));
        System.out.println(controller.check(new TripAdvisorAPI(), new GoogleAPI()));
        System.out.println(controller.check(new BookingComAPI(), new TripAdvisorAPI()));

    }
}
