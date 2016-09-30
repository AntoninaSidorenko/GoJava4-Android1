package module6.offline.task3;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by Lenovo on 19.09.2016.
 */
public class ArrayUtils {
    Order [] check(Order[]ar1, Order[]ar2){
        int count = 0; /* сколько совпадений, пробегаем по всем ордерам эрея1, и пробегаем по всем ордерам эпея2 и пишем сравнения по айдишникам, если айдишник будет одинаковый */
        for (Order order1: ar1) {
            for (Order order2:ar2){
                if(order1.equals(order2)) count++;
            }

        }
        Order []res = new Order[count];

        int index = 0;
        for (Order order1:ar1) {
            for (Order order2:ar2){
                if (order1.equals(order2)){
                    res[index] = order1;
                    index++;
                }
            }


        }
        return res;

    }

    static Order[]unique(Order[]order){
        return null;
    }


    static Order[] getactive(Order[] orders){
        Order[] ordersRes = new Order[orders.length];
        int index = 0;
        for(Order order : ordersRes){
            if(order.isActtive() && order.isDone())
                ordersRes[index++] = order;
        }
        return deleteOrders(orders);
    }

    private static Order[] deleteOrders(Order[] orders) {
        return null;
    }
}
