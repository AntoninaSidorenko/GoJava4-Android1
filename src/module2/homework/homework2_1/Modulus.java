package module2.homework.homework2_1;

public class Modulus {
    public static int modulus(int[] array) {
        int modulus = array[0] % array[array.length - 1];
        return modulus;
    }

    public static double modulus(double[] array){
        double modulus = array[0] % array[array.length - 1];
        return modulus;
    }

}
