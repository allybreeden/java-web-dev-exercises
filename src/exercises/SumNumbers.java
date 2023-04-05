package exercises;

import java.util.ArrayList;

public class SumNumbers {
    public static int sumEven(ArrayList<Integer> arr) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total+= integer;
            }
        }
        return total;
    }
//    public static int sumEven(ArrayList<Integer> arr) {
//        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
//        int total = 0;
//        for (int integer : arr) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//        return total;
//    }
}
