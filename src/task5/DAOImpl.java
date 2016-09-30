package task5;

public class DAOImpl implements DAO {


    @Override
    public Room save(Room room) {
        System.out.println(room + "saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room + "deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room + "updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Room find by id");
        return null;
    }

    @Override
    public Room getAll() {
        return null;
    }
}
