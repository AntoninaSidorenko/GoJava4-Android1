package module6.webinar.statics;

/**
 * Created by Lenovo on 16.09.2016.
 */
public class User {
    private String firstName;
    private int age;

    private static String companyName;
    {
//        int length = firstName.length();
        companyName = "IBM";
        System.out.println("block");
        log();
    }

    static void log(){
        System.out.println("Start");
    }

    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        User.companyName = companyName;
    }

    @Override
    public String toString() {
        return companyName;
    }

    static String editCompany(){
        if(companyName != null && !companyName.equals("GlobalLogi"));
        companyName = "Global";
        return companyName;
    }
     void gender(){
        firstName += "Mr.";
    }
















}
