package module3.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User("d", 12, 2, "r", 5, "g");
        user.setCompanyName("nnnnn");
        System.out.println(user.companyNameLength(user.getCompanyName()));
//        user.setMonthsOfEmployment(12);
//        System.out.println(user.monthIncreaser(13));
    }
}
