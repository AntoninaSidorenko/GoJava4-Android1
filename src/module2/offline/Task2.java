package module2.offline;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {10, 40, 50, 42, 54, 50, 200, 60};
        int n = 10;
        double result = containsCount(array, n);

        if(result == 1){
            System.out.println("yes");
        }
        if(result == 0){
            System.out.println("no");
        }
        if(result > 1){
            System.out.println(containsCount(array, n));
        }
    }

    static double containsCount(int[] array, int n) {
        int k = 0;
        for (int item : array) {
            if (item == n) {
                k++;
            }
        }
        return k;
    }


}


