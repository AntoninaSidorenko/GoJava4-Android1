package module2.homework2.task1;

public class Multiplication {
    public static int multiplication(int [] array){
        int  product = 1;
        for (int number : array){
            product *= number;
        }
        return product;
    }

    public static double multiplication(double[] array){
        int product = 1;
        for (double number : array){
            product *= number;

        }
        return product;

    }

}
