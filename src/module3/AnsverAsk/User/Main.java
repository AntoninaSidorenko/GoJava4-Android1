package module3.AnsverAsk.User;

import module3.AnsverAsk.fileSystem.TextFile;

/**
 * Created by Lenovo on 30.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String [] phone = {"iPhone", "Android", "Nokia"};
        User user = new User(phone);
        User user1 = new User();

        user1.setPhones(phone);

    }
}
