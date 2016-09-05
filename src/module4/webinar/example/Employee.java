package module4.webinar.example;

public abstract class Employee {
    String name;
    int balance;
    int salary;

    abstract void paySalary();

    void printBalanse(){
        System.out.println(balance);
    }

    void greeting(){
        System.out.println("Good morning" + name);
    }

}
