public class RockPaperScissors {
    public static void main(String[] args)
    {

    Scanner scanner = new Scanner(System.in);
    while(true) {
        String rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        String playerMove;

        while(true) {
                System.out.println("Please enter your move (r, p, or s)");
                playerMove = scanner.nextLine();
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
                    break;
            }
            System.out.println(playerMove + " is not a valid move.");

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            }
            else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win");
                }
            }

            else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You lose");
                } else if (computerMove.equals("r")) {
                    System.out.println("You win");
                }
            }

            else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You lose");
                } else if (computerMove.equals("p")) {
                    System.out.println("You win");
                }
            }

            System.out.println("Play again? (Y/N)");
            String playAgain = scanner.nextLine();
        }
    }
}