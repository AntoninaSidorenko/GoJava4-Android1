package module7.practice;

import module7.practice.sets.User;

import java.util.Comparator;

/**
 * Created by Lenovo on 30.09.2016.
 */
public class CustomComparator implements Comparator <User>{
    @Override
    public int compare(User o1, User o2) {
        return o2.getAge() - o1.getAge();
    }
}
