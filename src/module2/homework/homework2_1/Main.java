package module2.homework.homework2_1;

public class Main {
    public static void main(String[] args) {
        int [] array = {14, 54, 35, 77, -55, 124, -653, 40, -3, 12345};
        double [] array1 = {12.3, -456.76, 20, 14.5, 0.5, 34.94, 99.01, 943.1, 4567.6, 0.123};

        SumArrays sumArrays = new SumArrays();
        System.out.println(sumArrays.sumArray(array));
        System.out.println(sumArrays.sumArray1(array1));
    }
}
