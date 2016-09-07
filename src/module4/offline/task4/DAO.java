package module4.offline.task4;

public interface DAO {
    Object save(Object user);

    Object update(Object user);

    boolean delete(Object user);

    Object find(long id);
}
