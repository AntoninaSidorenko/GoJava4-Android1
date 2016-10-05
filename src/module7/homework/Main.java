package module7.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User(11, "A", "B", "C", 1200);
        User user1 = new User(12, "Q", "W", "E", 1300);
        User user2 = new User(13, "Y", "T", "R", 1400);
        User user3 = new User(14, "U", "I", "O", 1500);
        User user4 = new User(15, "K", "L", "P", 1600);
        User user5 = new User(16, "J", "H", "G", 1700);
        User user6 = new User(17, "S", "D", "F", 1800);
        User user7 = new User(18, "Z", "B", "C", 1900);
        User user8 = new User(19, "X", "V", "N", 1000);
        User user9 = new User(10, "A", "Q", "W", 11200);

        Order order = new Order(21, 120, Currency.UAH, "F", "q", user);
        Order order1 = new Order(22, 120, Currency.UAH, "F", "q", user1);
        Order order2 = new Order(23, 120, Currency.UAH, "F", "q", user2);
        Order order3 = new Order(24, 120, Currency.UAH, "F", "q", user3);
        Order order4 = new Order(25, 120, Currency.UAH, "F", "q", user4);
        Order order5 = new Order(26, 120, Currency.UAH, "F", "q", user5);
        Order order6 = new Order(27, 120, Currency.UAH, "F", "q", user6);
        Order order7 = new Order(28, 120, Currency.UAH, "F", "q", user7);
        Order order8 = new Order(29, 120, Currency.UAH, "F", "q", user8);
        Order order9 = new Order(211, 120, Currency.UAH, "F", "q", user9);


        ArrayList<Order> orders = new ArrayList<>();
        orders.add(0, order);
        orders.add(1, order1);
        orders.add(2, order2);
        orders.add(3, order3);
        orders.add(4, order4);
        orders.add(5, order5);
        orders.add(6, order6);
        orders.add(7, order7);
        orders.add(8, order8);
        orders.add(9, order9);

        System.out.println(orders);


    }
}
