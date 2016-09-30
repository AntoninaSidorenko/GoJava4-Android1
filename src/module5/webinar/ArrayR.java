package module5.webinar;

import java.util.Arrays;

public class ArrayR {

    int[] numbers = {12, 34, 54, 23, 5, 0};

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "ArrayR{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public int[] array(int[] f) {
        int index = 0;
        for (int d : f) {
            if (d != 0) index++;
        }
        int[] aR = new int[index];
        for (int i = 0; i < index; i++) {
            aR[i] = f[i];

        }

        return aR;
    }

}


//    public Words[] recreateArray([] rooms) {
//        int k = 0;
//        for (Room room : rooms) {
//            if (room != null) k++;
//        }
//        Room[] roomsArray = new Room[k];
//        for (int i = 0; i < k; i++) {
//            roomsArray[i] = rooms[i];
//        }
//        return roomsArray;
//    }
