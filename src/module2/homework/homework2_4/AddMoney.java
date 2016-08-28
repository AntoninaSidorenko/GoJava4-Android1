package module2.homework.homework2_4;

public class AddMoney {

    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund){
        double rest = 0;

        for(int i = 0; i < ownerNames.length; i++){
            if(ownerNames[i] == ownerName){
                rest = balances[i] + fund;
                System.out.println(ownerName);
            }

        }
        return rest;
    }
}
