package extraProblems;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private static int lowerBound = 1;
    private static int upperBound = 100;
    private static int currentGuess;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");

        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            currentGuess = generateGuess();
            System.out.println("Is your number " + currentGuess + "?");
            String feedback = getUserFeedback();

            switch (feedback.toLowerCase()) {
                case "higher":
                case "h":
                    updateLowerBound();
                    break;
                case "lower":
                case "l":
                    updateUpperBound();
                    break;
                case "correct":
                case "c":
                    System.out.println("Yay! I guessed your number correctly!");
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'higher', 'lower', or 'correct'.");
            }
        }

        scanner.close();
    }

    private static int generateGuess() {
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    private static String getUserFeedback() {
        System.out.println("Please respond with 'higher', 'lower', or 'correct':");
        return scanner.nextLine().trim();
    }

    private static void updateLowerBound() {
        if (currentGuess < upperBound) {
            lowerBound = currentGuess + 1;
        }
    }

    private static void updateUpperBound() {
        if (currentGuess > lowerBound) {
            upperBound = currentGuess - 1;
        }
    }
}