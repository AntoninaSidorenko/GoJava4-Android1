package module2.homework2.task1;

import module6.homework.task1.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        int[] array = {-18, -54, 35, 77, 55, -124, 653,  -40, 3, 12345};
        double[] array1 = {12.3, -456.76, 20, 14.5, 0.5, 34.94, 99.01, 943.1, 4567.6, 0.123};

        System.out.println(ArrayUtils.sum(array));

        System.out.println("sum of natural numbers = " + SumArrays.sum(array));
        System.out.println("sum of floating point numbers = " + SumArrays.sum(array1));


        System.out.println("minimum of natural numbers = " + MinMax.min(array) + "\n" +
                "maximum of natural numbers = " + MinMax.max(array));
        System.out.println("minimum of floating point numbers = " + MinMax.min(array1) + "\n" +
                "maximum of floating point numbers = " + MinMax.max(array1));

        System.out.println("maximum positive number = " + MaxPositive.maxPositive(array));
        System.out.println("maximum positive number = " + MaxPositive.maxPositive(array1));

        System.out.println("the result of multiplication of natural numbers = " + Multiplication.multiplication(array) +
                "\n" + "the result of multiplication of  of floating point numbers = " + Multiplication.multiplication(array1));

        System.out.println("module of first and last element = " + Math.abs(array[0]) + "; " + Math.abs(array[array.length - 1]));
        System.out.println("module of first and last element = " + Math.abs(array1[0]) + "; " + Math.abs(array1[array1.length - 1]));

        System.out.println("modulus of first and last element = " + Modulus.modulus(array));
        System.out.println("modulus of first and last element = " + Modulus.modulus(array1));

        System.out.println("second largest element = " + SecondLargestElement.secondLargest(array));
        System.out.println("second largest element = " + SecondLargestElement.secondLargest(array1));
    }
}
