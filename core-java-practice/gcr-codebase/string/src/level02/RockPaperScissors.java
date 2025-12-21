package level02;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    enum Choice {
        ROCK, PAPER, SCISSORS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of games to play: ");
        int totalGames = scanner.nextInt();

        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        String[][] gameResults = new String[totalGames][2];

        for (int i = 0; i < totalGames; i++) {
            System.out.println("\nGame " + (i + 1));
            Choice userChoice = getUserChoice(scanner);
            Choice computerChoice = getComputerChoice(rand);
            String winner = determineWinner(userChoice, computerChoice);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                ties++;
            }

            gameResults[i][0] = userChoice.toString();
            gameResults[i][1] = computerChoice.toString();

            System.out.println("Your choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoice);
            System.out.println("Winner: " + winner);
        }

        displayResults(gameResults, userWins, computerWins, ties);
        scanner.close();
    }

    public static Choice getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice (rock, paper, scissors): ");
        while (true) {
            String input = scanner.next().toLowerCase();
            switch (input) {
                case "rock":
                    return Choice.ROCK;
                case "paper":
                    return Choice.PAPER;
                case "scissors":
                    return Choice.SCISSORS;
                default:
                    System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
            }
        }
    }

    public static Choice getComputerChoice(Random rand) {
        int choiceNum = rand.nextInt(3);
        switch (choiceNum) {
            case 0:
                return Choice.ROCK;
            case 1:
                return Choice.PAPER;
            case 2:
                return Choice.SCISSORS;
            default:
                return Choice.ROCK; // Default case, should not occur
        }
    }

    public static String determineWinner(Choice userChoice, Choice computerChoice) {
        if (userChoice == computerChoice) {
            return "Tie";
        }

        // Rule checks
        if ((userChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) ||
            (userChoice == Choice.PAPER && computerChoice == Choice.ROCK) ||
            (userChoice == Choice.SCISSORS && computerChoice == Choice.PAPER)) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static void displayResults(String[][] gameResults, int userWins, int computerWins, int ties) {
        int totalGamesPlayed = gameResults.length;
        System.out.println("\n================= Game Results =================");
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Game#", "Your Choice", "Computer Choice", "Winner");
        for (int i = 0; i < totalGamesPlayed; i++) {
            System.out.printf("%-10d %-15s %-15s %-10s\n",
                    i + 1,
                    gameResults[i][0],
                    gameResults[i][1],
                    (determineWinner(getChoiceFromString(gameResults[i][0]), getChoiceFromString(gameResults[i][1]))));
        }

        System.out.println("\n========== Overall Statistics ==========");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);

        double userWinPercent = (double) userWins / totalGamesPlayed * 100;
        double computerWinPercent = (double) computerWins / totalGamesPlayed * 100;

        System.out.printf("User Win Percentage: %.2f%%\n", userWinPercent);
        System.out.printf("Computer Win Percentage: %.2f%%\n", computerWinPercent);
    }

    public static Choice getChoiceFromString(String choiceStr) {
        return Choice.valueOf(choiceStr);
    }
}