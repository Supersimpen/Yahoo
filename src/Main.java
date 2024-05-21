import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Det här är higher or lower");
        System.out.println("Jag valde ett nummer mellan 1 o 100");

        int randomNumber = random.nextInt(100) + 1;
        int funnynumber = 69;
        int toomuch = 100;
        int toolittl = 1;
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Gissa min vän: ");
            guess = scanner.nextInt();
            attempts++;


            if (guess == funnynumber) {
                System.out.println("Du borde skämmas");
            } else if (guess > toomuch) {
                System.out.println("kan du räkna?");
            } else if (guess < toolittl) {
                System.out.println("Du kan verkligen inte räkna.");
            } else if (guess > randomNumber) {
                System.out.println("ae det var lägre.");
            } else if (guess < randomNumber) {
                System.out.println("ae det var högre.");
            } else {
                guessedCorrectly = true;
                System.out.println("Jävlar du gissa rätt, " + randomNumber + " var svaret!");
                System.out.println("Det tog dig " + attempts + " försök.");
            }
        }

        scanner.close();
    }
}
