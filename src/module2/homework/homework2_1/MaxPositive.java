package module2.homework.homework2_1;

public class MaxPositive {

    public static int maxPositiveNumber(int[] array) {
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


}
