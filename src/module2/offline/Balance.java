package module2.offline;

public class Balance {
    static double withdraw(double balance, double withdrawal, double commission) {
        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {

//        double balance = 100;
//        double withdraw = 30.5;
//        double commission = 10.5;


        double balanceAfter = withdraw(100, 30.5, 10.5);

        if (balanceAfter >= 0) {
            System.out.println("ok");
            System.out.println(balanceAfter);
        } else {
            System.out.println("no");
        }
    }

}
