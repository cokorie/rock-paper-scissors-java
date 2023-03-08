public class RockPaperScissors {
    public static void main(String[] args)
    {
        String rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];
    }
}