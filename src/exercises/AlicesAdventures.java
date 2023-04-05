package exercises;
import java.util.Scanner;

public class AlicesAdventures {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstSentence = "Alice was beginning to get very tired of sitting by her" +
                "sister on the bank, and of having nothing to do: once or" +
                "twice she had peeped into the book her sister was" +
                "reading, but it had no pictures or conversations in it," +
                "'and what is the use of a book,' thought Alice 'without" +
                "pictures or conversation?'";


        System.out.println("Enter a word to search for: ");
        String search = input.nextLine();

        if (firstSentence.contains(search)) {
            System.out.println("Index of word: " +firstSentence.indexOf(search));
            System.out.println("Length of word: " + search.length());

            firstSentence = firstSentence.substring(0, firstSentence.indexOf(search)) + firstSentence.substring((firstSentence.indexOf(search) + search.length() + 1), firstSentence.length());

            System.out.println("New sentence: ");
            System.out.println(firstSentence);
        } else {
            System.out.println("The word was not found in the first sentence.");
        }
    }
}
