package module7.practice.sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetEx implements Comparable<String>{

    @Override
    public int compareTo(String o) {
        return 0;
    }

    public static void main(String[] args) {


        Set <String> set = new HashSet<>();

        set.add("item");
        set.add("item1");
        set.add("item");

        System.out.println(set);

        Set<User> users = new HashSet<>();
        users.add(new User(1, "j"));
        users.add(new User(9, "d"));
        users.add(new User(9, "d"));



        System.out.println(users);

        Set<User> users1 = new HashSet<>();
        users.add(new User(1, "j"));
        users.add(new User(9, "d"));
        users.add(new User(9, "d"));

        System.out.println(users);






    }
}
