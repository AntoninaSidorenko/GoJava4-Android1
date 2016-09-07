package module4.offline.task4;

/**
 * Created by Lenovo on 05.09.2016.
 */
public class UserDAO implements DAO {
    @Override
    public Object save(Object user) {
        User user1 = (User) user;
        System.out.println(user.toString() + "saved");
        return user1;
    }

    @Override
    public Object update(Object user) {
        System.out.println(user.toString() + "update");
        return user;

    }

    @Override
    public boolean delete(Object user) {
        System.out.println(user.toString() + "delete");
        return true;
    }

    @Override
    public Object find(long id) {
        User user = new User("Roma");
        user.setId(id);
        System.out.println(user.toString() + "found");
        return user;
    }
}
