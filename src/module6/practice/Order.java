package module6.practice;

import java.util.Date;

public class Order {
    private Item item;
    private User user;
    private Date date;
    private static int counter;

    private boolean isActive;
    private boolean isShipped;

    public Order(Item item, User user) {
        this.item = item;
        this.user = user;
        this.date = new Date();

        this.isActive = true;
        this.isShipped = false;
    }

}
