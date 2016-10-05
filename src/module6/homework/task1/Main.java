package module6.homework.task1;

/**
 * Created by Lenovo on 21.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        int [] array = {-12, -1, 54, 23, 2, 66};
        User []users = new User[5];
        users[0] = new User(12, "d", "f", 123, 234);
        users[1] = new User(12, "d", "f", 123, 234);
        users[2] = new User(13, "f", "f", 123, 234);
        users[3] = new User(14, "h", "f", 123, 234);
        users[4] = new User(15, "j", "e", 123, 234);
//        System.out.println(ArrayUtils.max(array));
//        System.out.println(ArrayUtils.multiplication(array));
//        System.out.println(ArrayUtils.secondLargest(array));
//        System.out.println(ArrayUtils.reverse(array));
//        System.out.println(ArrayUtils.reverse(array));
//        System.out.println(ArrayUtils.findEvenElements(array));
//        ArrayUtils.sum(array);
        System.out.println(UserUtils.uniqueUsers(users));


//        System.out.println(ArrayUtils.maxPositive(array));
    }
}
