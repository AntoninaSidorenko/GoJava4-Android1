package module4.homework;

/*EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
limit of funding - 20000 if EUR and 10000 if USD
monthly rate - 0% with USD and 1% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
2% if EUR and up to 1000 and 4% if EUR and more than 1000
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        switch (super.getCurrency()) {
            case USD:
                limit = 2000;
                break;
            case EUR:
                limit = 2200;
                break;
            default:
                System.out.println("");
        }
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        switch (super.getCurrency()) {
            case EUR:
                limitOfFunding = 20000;
                break;
            case USD:
                limitOfFunding = 10000;
                break;
            default:
                System.out.println("think, what i want put here");
                break;

        }
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthlyRate = 0;
        switch (super.getCurrency()) {
            case EUR:
                monthlyRate = 0.01;
                break;
            default:
                break;
        }
        return monthlyRate;
    }

    @Override
    double getCommission(double sum) {
        double commission = 0;
        switch (super.getCurrency()) {
            case USD:
                if (sum <= 1000) commission = 0.05;
                else commission = 0.07;
                break;
            case EUR:
                if (sum <= 1000) commission = 0.02;
                else commission = 0.04;
                break;
            default:
                break;
        }

        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
