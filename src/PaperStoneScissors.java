import java.util.Random;
import java.util.Scanner;

public class PaperStoneScissors {

    private static final String Rock = "Rock";
    private static final String Paper = "Paper";
    private static final String Scissors = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();

        while (!playerMove.equals("no")) {


            if (playerMove.equals("r") || playerMove.equals("rock")) {
                playerMove = Rock;
            } else if (playerMove.equals("p") || playerMove.equals("paper")) {
                playerMove = Paper;
            } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
                playerMove = Scissors;
            } else {
                System.out.println("Invalid Input. Try Again...");
                return;
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);

            String computerMove = "";

            switch (computerRandomNumber) {
                case 0:
                    computerMove = Rock;
                    break;
                case 1:
                    computerMove = Paper;
                    break;
                case 2:
                    computerMove = Scissors;
                    break;
            }

            if (computerMove.equals("Rock")) {
                System.out.printf("The computer chose %s.%n", computerMove);
            } else if (computerMove.equals("Paper")) {
                System.out.printf("The computer chose %s.%n", computerMove);
            } else if (computerMove.equals("Scissors")) {
                System.out.printf("The computer chose %s.%n", computerMove);
            }

            if ((playerMove.equals(Rock) && computerMove.equals(Scissors)) ||
                    (playerMove.equals(Paper) && computerMove.equals(Rock)) ||
                    (playerMove.equals(Scissors) && computerMove.equals(Paper))) {
                System.out.println("You win.");
            } else if ((computerMove.equals(Rock) && playerMove.equals(Rock)) ||
                    (computerMove.equals(Paper) && playerMove.equals(Paper)) ||
                    computerMove.equals(Scissors) && playerMove.equals(Scissors)) {
                System.out.println("This game was a draw.");
            } else {
                System.out.println("You lose.");
            }
            System.out.println();
            System.out.println("Do you want another game ? (yes / no): ");
            playerMove = scanner.nextLine();
            if (playerMove.equals("yes")) {
                System.out.println("Choose [r]ock, [p]aper or [s]cissors: ");
                playerMove = scanner.nextLine();
            } else {
                System.out.println("Good Bye !");
            }
        }

    }
}
