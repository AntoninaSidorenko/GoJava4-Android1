package module4.homework;

public abstract class Bank {
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }
    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract double getMonthlyRate();

    abstract double getCommission(double sum);

    public double moneyPaidMonthlyForSalary(){
        double monthlySalaryEmploees = getNumberOfEmployees()*getAvrSalaryOfEmployee();
        return monthlySalaryEmploees;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }



//    @Override
//    public String toString() {
//        return "Bank{" +
//                "id=" + id +
//                ", bankCountry='" + bankCountry + '\'' +
//                ", currency=" + currency +
//                ", numberOfEmployees=" + numberOfEmployees +
//                ", avrSalaryOfEmployee=" + avrSalaryOfEmployee +
//                ", rating=" + rating +
//                ", totalCapital=" + totalCapital +
//                '}';
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Bank bank = (Bank) o;
//
//        if (id != bank.id) return false;
//        if (numberOfEmployees != bank.numberOfEmployees) return false;
//        if (Double.compare(bank.avrSalaryOfEmployee, avrSalaryOfEmployee) != 0) return false;
//        if (rating != bank.rating) return false;
//        if (totalCapital != bank.totalCapital) return false;
//        if (bankCountry != null ? !bankCountry.equals(bank.bankCountry) : bank.bankCountry != null) return false;
//        return currency == bank.currency;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = (int) (id ^ (id >>> 32));
//        result = 31 * result + (bankCountry != null ? bankCountry.hashCode() : 0);
//        result = 31 * result + (currency != null ? currency.hashCode() : 0);
//        result = 31 * result + numberOfEmployees;
//        temp = Double.doubleToLongBits(avrSalaryOfEmployee);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        result = 31 * result + (int) (rating ^ (rating >>> 32));
//        result = 31 * result + (int) (totalCapital ^ (totalCapital >>> 32));
//        return result;
//
//    }
}
