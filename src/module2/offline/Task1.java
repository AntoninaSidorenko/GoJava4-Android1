package module2.offline;

public class Task1 {

    public static void main(String[] args) {

        int[] balances = {12, 34, 55, 1235, 532, 3427};
        String[] owner = {"Alena", "Oksana", "Pir", "Sem", "Sany"};

        System.out.println(balancesSum(balances));
    }

    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; i < balances.length; j++) {
                if(balances[j] > 1000) result [i] = names[j];

            }
        }
        return result;
    }


}


//        int sum = 0;
////        for (int i = 0; i < balence.length; i++) {
//

//        int sum1 = 0;
//        for (int balances : balence) {
//
//            if (balances > 1000 && balances < 5000) {
//                sum += balances;
//            }
//        }
//
//        System.out.println(sum);
//    }






