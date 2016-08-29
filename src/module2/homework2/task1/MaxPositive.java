package module2.homework2.task1;

public class MaxPositive {

    public static int maxPositive(int[] array) {
        int maxPositive = 0;
        for (int number : array) {
            if (number < 0) {
                continue;
            }
            if (maxPositive < number) {
                maxPositive = number;
            }
        }
        return maxPositive;
    }

    public static double maxPositive(double[] array) {
        double maxPositive = 0;
        for (double number : array) {
            if (number < 0) {
                continue;
            }
            if (maxPositive < number) {
                maxPositive = number;
            }

        }
        return maxPositive;
    }


}
