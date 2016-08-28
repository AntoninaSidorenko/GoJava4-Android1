package module2.homework.homework2_1;

public class SecondLargestElement {
    public static int secondLargest(int[] array) {
        int max = array[0];
        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            }
        }
        return secondLargest;
    }

    public static double secondLargest(double[] array){
        double max = array[0];
        double secondLargest = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i] ){
                secondLargest = max;
                max = array[i];
            }
        }
        return secondLargest;
    }

}
