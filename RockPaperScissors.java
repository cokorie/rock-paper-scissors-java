import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {

    Scanner scanner = new Scanner(System.in);
    while(true) {
        String rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        String playerMove;

        while(true) {
                System.out.println("Please enter your move: (r, p, or s)");
                playerMove = scanner.nextLine();
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
                    break;
            }
            System.out.println(playerMove + " is not a valid move! Please enter a valid response.");

            if (playerMove.equals(computerMove)) {
                System.out.println("Tie game.");
            }
            else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                }
            }

            else if (playerMove.equals("P")) {
                if (computerMove.equals("S")) {
                    System.out.println("You lost!");
                } else if (computerMove.equals("R")) {
                    System.out.println("You won!");
                }
            }

            else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You win!");
                }
            }

            System.out.println("PLAY AGAIN? (Y/N)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("Y")) {
                break;
            }

            scanner.close();
        }
    }
}