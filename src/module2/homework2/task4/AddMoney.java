package module2.homework2.task4;

public class AddMoney {

    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund){
        double rest = 0;

        for(int i = 0; i < ownerNames.length; i++){
            if(ownerName.equals(ownerNames[i])){
                rest = balances[i] + fund;
                System.out.print(ownerName + " ");
                break;
            }

        }
        return rest;
    }
}
