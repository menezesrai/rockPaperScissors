import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // This entire code will be written in english as to make it easier for anyone to understand.
        // I also belive that when I actually get to work as a Dev I should write my code in english.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};
        String playAgain;

        do {
            int userScore = 0;
            int computerScore = 0;

            // Sections that guarantees it will be a best of three.
            while (userScore < 2 && computerScore < 2) {
                System.out.println("Jo-kem-po! (Rock, Paper, Scissors): ");
                String userMove = scanner.nextLine();

                if (!userMove.equalsIgnoreCase("Rock") && !userMove.equalsIgnoreCase("Paper") && !userMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("That's not a valid move, please try again!");
                    continue;
                }

                // Computer move based on random Integer.
                int computerMove_ = random.nextInt(3);
                String computerMove = options[computerMove_];
                System.out.println("Computer move: " + computerMove);

                if (userMove.equalsIgnoreCase(computerMove)) {
                    System.out.println("It's a tie!");
                } else if ((userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
                           (userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
                           (userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
                    System.out.println("Congratulations! You've won the battle, but not the war");
                    userScore++;
                } else {
                    System.out.println("Computer wins this round!");
                    computerScore++;
                }

                // Scoreboard.

                System.out.println("Score: You " + userScore + " - " + computerScore + " Computer");
            }

            // Final result.

            if (userScore == 2) {
                System.out.println("Congratulations! You won it all!!.");
            } else {
                System.out.println("Sorry! But you just lost to the computer!.");
                System.out.println("Better luck next time!.");
            }

            // Play again feature.

            System.out.println("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
