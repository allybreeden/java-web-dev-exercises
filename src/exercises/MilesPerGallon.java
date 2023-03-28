package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double numMiles = input.nextDouble();

        System.out.println("How much gas have you used? ");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("Your miles-per-gallon is " + mpg + ".");
    }
}
