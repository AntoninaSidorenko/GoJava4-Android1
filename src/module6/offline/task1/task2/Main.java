package module6.offline.task1.task2;

/**
 * Created by Lenovo on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("first user counter" + User.getCounter());

        new User();
        new User();
        new User();

        System.out.println("second user counter" + User.getCounter());
    }
}
