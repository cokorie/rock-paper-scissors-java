public class RockPaperScissors {
    public static void main(String[] args)
    {
        String rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your move (r, p, or s)");
        String playerMove = scanner.nextLine();
    }
}