package module7.practice;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Lenovo on 30.09.2016.
 */
public class QuaueEx {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.add("Item1");
        queue.add("Item2");
        queue.add("Item3");
        queue.add("Item4");

        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue.element());

    }
}
