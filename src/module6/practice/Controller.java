package module6.practice;


public class Controller {
    private Store store = new Store("Kiev");

    private DAOImpl dao = new DAOImpl();

    void makeOrder(User user, Item item) {
        Order order = new Order(item, user);
        store.getOrders()[Store.getIndex()] = order;

        dao.save(order);
    }

    void makeOrder(User user, Item item) {
        Order order = new Order(item, user);
        store.getOrders()[Store.getIndex()] = order;

        dao.save(order);
    }






}
