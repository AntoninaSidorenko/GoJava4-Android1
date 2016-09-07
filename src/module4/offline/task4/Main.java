package module4.offline.task4;

/**
 * Created by Lenovo on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        AbstractDAO dao = new TaskDAOImplemention();
        dao.find(12);
    }
}
