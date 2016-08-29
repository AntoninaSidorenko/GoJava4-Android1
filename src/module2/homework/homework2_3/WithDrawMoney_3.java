package module2.homework.homework2_3;


public class WithDrawMoney_3 {

    static double COMMISSION = 0.05;
    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    static double withdrawBalance(String ownerName, double withdrawal) {
        double rest = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                rest = balances[i] - (withdrawal + (withdrawal * COMMISSION));
                if (rest >= 0)
                    System.out.print(ownerName + " " + withdrawal + " ");

            } else if (rest < 0) {
                System.out.println(ownerName + " NO");
                return 0;
            }
        }

        return rest;
    }

}





