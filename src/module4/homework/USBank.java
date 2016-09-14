package module4.homework;

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
        double monthlyRate;
        if (getCurrency().equals(Currency.USD)) monthlyRate = 0.01;
        else monthlyRate = 0.02;
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
}
