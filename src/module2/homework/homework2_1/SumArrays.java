package module2.homework.homework2_1;

public class SumArrays {

    public static int sum(int[] calculateArray){
        int sum = 0;
        for(int i = 0; i < calculateArray.length; i++ ){
            sum += calculateArray[i];
        }
        return sum;
    }
    public static double sum(double[] calculateArray){
        double sum1 = 0;
        for(int i = 0; i < calculateArray.length; i++){
            sum1 += calculateArray[i];
        }
        return sum1;
    }

}
