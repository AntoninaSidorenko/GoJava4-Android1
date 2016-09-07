package module4.homework;

import static module4.homework.Currency.EUR;

/*
USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
limit of funding - 10000 if EUR and no limit if USD
monthly rate - 1% with USD and 1.5% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
6% if EUR and up to 1000 and 8% if EUR and more than 1000
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        switch (super.getCurrency()) {
            case USD:
                limit = 1000;
                break;
            case EUR:
                limit = 1200;
                break;
            default:
                break;
        }
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        switch (super.getCurrency()) {
            case EUR:
                limitOfFunding = 10000;
                break;
            case USD:
                limitOfFunding = Integer.MAX_VALUE;
                break;
            default:
                break;
        }

        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthlyRate = 0.0;
        switch (super.getCurrency()) {
            case USD:
                monthlyRate = 0.01;
                break;
            case EUR:
                monthlyRate = 0.05;
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
                if (sum <= 1000) commission = 0.06;
                else commission = 0.08;
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
