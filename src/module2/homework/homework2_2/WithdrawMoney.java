package module2.homework.homework2_2;

public class WithdrawMoney {

    final static double COMMISSION = 0.05;

    static double withdrawBalance(double balance, double withdraw) {
        double rest = balance - (withdraw + (withdraw * COMMISSION));
        if (rest > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return rest;
    }
}
