package module05;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Operation \"save\"  :  object \"" + room + "\"");
        return room;
    }

    @Override
    public Room delete(Room room) {
        System.out.println("Operation \"delete\"  :  object \"" + room + "\"");
        return room;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Operation \"update\"  :  object \"" + room + "\"");
        return room;
    }

    @Override
    public Room findBy(Room room) {
        System.out.println("Operation \"findBy\"  :  object \"" + room + "\"");
        return room;
    }
}
