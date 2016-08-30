package module2.homework2.task2;

public class WithdrawMoney {

    final static double COMMISSION = 0.05;

    static double withdrawBalance(double balance, double withdraw) {
        double commission = withdraw * COMMISSION;
        double rest = balance - (withdraw + (commission));

        if (rest > 0) {
            System.out.println("OK" + "\n" + commission);
        } else {
            System.out.println("NO");
            return 0;
        }
        return rest;
    }
}
