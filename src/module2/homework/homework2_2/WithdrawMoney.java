package module2.homework.homework2_2;

public class WithdrawMoney {

    final static double COMMISSION = 0.05;

     static double withdrawBalance(double balance, double withdraw) {
        double rest = balance - (withdraw + (withdraw * COMMISSION));
        double commission = withdraw * COMMISSION;
        if (rest > 0) {
            System.out.println("OK" + "\n" + commission);
        } else {
            System.out.println("NO");
            return 0;
        }
        return rest;
    }
}
