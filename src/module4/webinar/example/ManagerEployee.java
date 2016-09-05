package module4.webinar.example;

/**
 * Created by Lenovo on 02.09.2016.
 */
public  class ManagerEployee extends Employee {
    @Override
    void paySalary() {
        balance += salary * 1.1;
    }
}
