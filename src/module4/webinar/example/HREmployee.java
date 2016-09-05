package module4.webinar.example;

/**
 * Created by Lenovo on 02.09.2016.
 */
public class HREmployee extends Employee {
    @Override
    void paySalary() {
        double balance = salary * 1.1;
    }

    public HREmployee() {
    }
}
