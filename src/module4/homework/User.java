package module4.homework;

public class User {

    private double balance;
    private Bank bank;
    private String name;
    private long id;
    private int numberOfEmployee;
    private double salaryOfEmploee;
    private long totalCapital;


    public User(double balance, Bank bank, String name, long id, int numberofEmployee, double salaryOfEmploee, long totalCapital) {
        this.balance = balance;
        this.bank = bank;
        this.name = name;
        this.id = id;
        this.numberOfEmployee = numberofEmployee;
        this.salaryOfEmploee = salaryOfEmploee;
        this.totalCapital = totalCapital;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public double getSalaryOfEmploee() {
        return salaryOfEmploee;
    }

    public void setSalaryOfEmploee(double salaryOfEmploee) {
        this.salaryOfEmploee = salaryOfEmploee;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public int getNumberofEmployee() {
        return numberOfEmployee;
    }

    public void setNumberofEmployee(int numberofEmployee) {
        this.numberOfEmployee = numberofEmployee;
    }

    public double getAvrSallaryOfEmployee() {
        return salaryOfEmploee;
    }

    public void setAvrSallaryOfEmployee(double avrSallaryOfEmployee) {
        this.salaryOfEmploee = avrSallaryOfEmployee;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    @Override
    public String toString() {
        return "User{" +
                "balance=" + balance +
                ", bank=" + bank +
                ", name=" + name +
                ", id=" + id +
                ", numberofEmployee=" + numberOfEmployee +
                ", avrSallaryOfEmployee=" + salaryOfEmploee +
                ", totalCapital=" + totalCapital +
                '}';
    }
}
