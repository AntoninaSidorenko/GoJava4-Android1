package module2.homework.homework2_1;

public class Main {
    public static void main(String[] args) {
        int[] array = {-18, -54, 35, 77, 55, -124, 653, -40, 3, 12345};
        double[] array1 = {12.3, -456.76, 20, 14.5, 0.5, 34.94, 99.01, 943.1, 4567.6, 0.123};

        System.out.println("the sum of natural numbers = " + SumArrays.sumArray(array));
        System.out.println("the sum of floating point numbers = " + SumArrays.sumArray1(array1));


        System.out.println("the minimum of natural numbers = " + MinMax.getMin(array) + "\n" +
                            "the maximum of natural numbers = " +  MinMax.getMax(array));
        System.out.println("the minimum of floating point numbers = " + MinMax.getMin(array1) + "\n" +
                "the maximum of floating point numbers = " +  MinMax.getMax(array1));

        System.out.println("the maximum positive number = " + MaxPositive.maxPositiveNumber(array));

        System.out.println("the result of multiplication of natural numbers = " + Multiplication.multiplication(array) +
        "\n" + "the result of multiplication of  of floating point numbers = " + Multiplication.multiplication(array1));

        System.out.println(Math.abs(array[0]) + Math.abs(array[9]));
        System.out.println(Math.abs(array1[0]) + Math.abs(array[9]));


    }
}
