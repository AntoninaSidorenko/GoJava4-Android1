package module4.homework;

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
        double monthlyRate;
        if(getCurrency().equals(Currency.USD))monthlyRate = 0.01;
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
                if (sum <= 1000) commission = 0.02;
                else commission = 0.04;
                break;
            default:
                break;
        }

        return commission;
    }

}
