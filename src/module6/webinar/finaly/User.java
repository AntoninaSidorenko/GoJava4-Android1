package module6.webinar.finaly;

/**
 * Created by Lenovo on 16.09.2016.
 */
public class User {
    private String name;
    private int age;
    private String lastName;

    private final String cityOfBirth;

    private final static String companyName = "GoIt";

    public User(String name, int age, String cityOfBirth) {
        this.name = name;
        this.age = age;
        this.cityOfBirth = cityOfBirth;
    }

    void someLogic(){
        String result = name + lastName;


    }
}
