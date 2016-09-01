package module2.homework2.task3;


public class WithdrawMoney {

    static double COMMISSION = 0.05;
    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    static double withdrawBalance(String ownerName, double withdrawal) {
        double rest = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                rest = balances[i] - (withdrawal + (withdrawal * COMMISSION));

                if (rest >= 0) {
                    System.out.print(ownerName + " " + withdrawal + " ");

                } else {
                    System.out.println(ownerName + " NO");
                }
                break;
            }
        }
        return rest;
    }
}





