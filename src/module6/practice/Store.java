package module6.practice;

import module6.offline.task3.*;

/**
 * Created by Lenovo on 20.09.2016.
 */
public class Store {
    private  Item []items = new Item[5];
    private Order []orders = new Order[10];
    private String city;
    private static int index = 0;


    public Store(String city) {
        this.city = city;
//
//        items[0] = new Item(11, "BMV", "Kiev", 100);
//        items[1] = new Item(12, "opel", "Poltava", 122);
//        items[2] = new Item(13, "Honda", "Lviv", 345);
//        items[3] = new Item(14, "Skoda", "Dnepr",643 );
//        items[4] = new Item(15, "Volvo", "Odessa", 432);

    }

    public Order[] getOrders() {
        return orders;
    }

    public static int getIndex() {
        return index;
    }

    public Item[] getItems() {
        return items;
    }

    public String getCity() {
        return city;
    }
}
