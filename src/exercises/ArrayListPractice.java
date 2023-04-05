package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int wordLength = input.nextInt();

        input.close();

        ArrayList<String> words = new ArrayList<>();

        words.add("Kiwi");
        words.add("Banana");
        words.add("Raspberry");
        words.add("Avocado");
        words.add("Blackberries");
        words.add("Jelly");
        words.add("Books");

        for (String word : words) {
            if (word.length() == wordLength) {
                System.out.println(word);
            } else {
                System.out.println("There are no " + wordLength + " letter words");
            }
        }
    }
}
