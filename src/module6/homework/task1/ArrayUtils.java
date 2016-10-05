package module6.homework.task1;


public final class ArrayUtils {

    public static int sum(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            index += array[i];
        }
        return index;

    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];

        }
        return max;
    }

    public static int maxPositive(int[] array) {
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < 0) continue;
            if (maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }

    public static int multiplication(int[] array) {
        int result = 1;
        for (int number : array) {
            result *= number;
        }
        return result;
    }

    static int secondLargest(int[] array) {
        int max = array[0];
        int second = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                second = max;
                max = array[i];
            }
        }

        return second;
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            for (int j = i - 1; j >= 0; j--) {
                int left = array[j];
                if (index > left) {
                    array[j + 1] = left;
                    array[j] = index;
                } else {
                    break;
                }
            }
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        return array;
    }

    public static String findEvenElements(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        return " ";
    }


}


