import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number!");
        System.out.println("The computer will pick a number from 1 to 100 and you have 5 chances to guess it!");
        System.out.println("Please type in a number 1 to 100");

        Random rand = new Random();
        int upperBound = 100;
        int pickedNumber = rand.nextInt(upperBound) + 1;

        Scanner in = new Scanner(System.in);
        int guessesLeft = 5;

        while (guessesLeft > 0) {
            int guess = in.nextInt();

            if (guess == pickedNumber) {
                System.out.println("Congratulations. You won! " + pickedNumber + " was the correct answer");
                break;
            } else if (guess > pickedNumber) {
                System.out.println("Sorry, " + guess + " is too high.");
            } else {
                System.out.println("Sorry, " + guess + " is too low.");
            }

            guessesLeft--;
        }

        if (guessesLeft == 0) {
            System.out.println("Sorry, you lost. The answer was " + pickedNumber);
        }

    }
}
