package module4.homework;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        switch (super.getCurrency()) {
            case USD:
                limitOfWithdrawal = 100;
                break;
            case EUR:
                limitOfWithdrawal = 150;
                break;
            default:
                break;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        switch (super.getCurrency()) {
            case EUR:
                limitOfFunding = 5000;
                break;
            case USD:
                limitOfFunding = 10000;
                break;
            default:
                break;
        }
        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double monthlyRate = 0;
        if(getCurrency().equals(Currency.USD)) monthlyRate = 0.01;
        return monthlyRate;
    }

    @Override
    double getCommission(double sum) {
        double commission = 0;
        switch (super.getCurrency()) {
            case USD:
                if (sum <= 1000) commission = 0.03;
                else commission = 0.05;
                break;
            case EUR:
                if (sum <= 1000) commission = 0.1;
                else commission = 0.11;
                break;
            default:
                break;
        }
        return commission;
    }

}
