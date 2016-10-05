package module6.practice;

/**
 * Created by Lenovo on 03.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        User user = new User(11, "Denis", "Test", "Poltava");
        Item item = new Item();
        item.setName("BMV");
        item.setCityStored("Kiev");

        controller.makeOrder(user, item);


    }
}
