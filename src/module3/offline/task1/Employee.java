package module3.offline.task1;

public class Employee extends Person{
    protected String adress;
    protected int salary;

    public Employee(String name, int age, String lastName, String adress, int salary) {
        super(name, age, lastName);
        this.adress = adress;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

}
