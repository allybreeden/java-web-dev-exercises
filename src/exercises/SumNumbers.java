package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class SumNumbers {
    public static void main(ArrayList<Integer> arr) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
//        return total;
    }
}
