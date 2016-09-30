package module6.offline.task3;

/**
 * Created by Lenovo on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order(12,  true, false, "L", 120);
        Order order1 = new Order(13, true, false, "t", 123);

        Order[] ar1 = {order1};
        Order[] ar2 = {order};

    }
}
