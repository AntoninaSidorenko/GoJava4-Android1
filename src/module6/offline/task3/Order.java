package module6.offline.task3;

import module6.offline.task1.task2.User;

/**
 * Created by Lenovo on 19.09.2016.
 */
public class Order {
    private long id;
    private boolean isActtive;
    private boolean isDone;
    private String itemName;
    private int price;

    private User user;

    public Order(long id, boolean isActtive, boolean isDone, String itemName, int price) {
        this.id = id;
        this.isActtive = isActtive;
        this.isDone = isDone;
        this.itemName = itemName;
        this.price = price;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public boolean isActtive() {
        return isActtive;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (isActtive != order.isActtive) return false;
        if (isDone != order.isDone) return false;
        if (price != order.price) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        return user != null ? user.equals(order.user) : order.user == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (isActtive ? 1 : 0);
        result = 31 * result + (isDone ? 1 : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
