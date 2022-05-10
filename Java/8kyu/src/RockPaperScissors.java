// https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(mySolution("rock", "scissors"));
        System.out.println(mySolution("scissors", "paper"));
    }

    private static String mySolution(String player1, String player2) {
        boolean isPlayer1Won = false;
        boolean isDraw = false;
        if (player1.equals(player2)) {
            isDraw = true;
        } else {
            if (player1.equals("rock") && player2.equals("scissors")) {
                isPlayer1Won = true;
            }
            if (player1.equals("scissors") && player2.equals("paper")) {
                isPlayer1Won = true;
            }
            if (player1.equals("paper") && player2.equals("rock")) {
                isPlayer1Won = true;
            }
        }

        if (isDraw) { return "Draw!"; }

        return String.format("Player %s won!", isPlayer1Won ? 1 : 2);
    }


}
