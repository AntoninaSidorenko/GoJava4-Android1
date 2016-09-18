package module6.webinar.statics;

/**
 * Created by Lenovo on 16.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User("a", 12);
        User user1 = new User("e", 33);

        user.setCompanyName("Google");

        user.editCompany();

        User.editCompany();

//        user1.setCompanyName("Google");
//
//        System.out.println(user1.toString());
//        System.out.println(user.toString());

    }
}
