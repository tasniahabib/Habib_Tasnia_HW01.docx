
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Player A, enter R, P, or S: ");
        String playerA = input.nextLine();

        if (!playerA.equalsIgnoreCase("R")
                && !playerA.equalsIgnoreCase("P")
                && !playerA.equalsIgnoreCase("S")) {
            System.out.println("Invalid move for Player A!");
            System.exit(0);
        }

        System.out.print("Player B, enter R, P, or S: ");
        String playerB = input.nextLine();

        if (!playerB.equalsIgnoreCase("R")
                && !playerB.equalsIgnoreCase("P")
                && !playerB.equalsIgnoreCase("S")) {
            System.out.println("Invalid move for Player B!");
            System.exit(0);
        }

        playerA = playerA.toUpperCase();
        playerB = playerB.toUpperCase();

        if (playerA.equals(playerB)) {
            System.out.println("It's a Tie!");
        } else if (playerA.equals("R") && playerB.equals("S")) {
            System.out.println("Rock breaks Scissors");
            System.out.println("Player A wins!");
        } else if (playerA.equals("P") && playerB.equals("R")) {
            System.out.println("Paper covers Rock");
            System.out.println("Player A wins!");
        } else if (playerA.equals("S") && playerB.equals("P")) {
            System.out.println("Scissors cuts Paper");
            System.out.println("Player A wins!");
        } else if (playerB.equals("R") && playerA.equals("S")) {
            System.out.println("Rock breaks Scissors");
            System.out.println("Player B wins!");
        } else if (playerB.equals("P") && playerA.equals("R")) {
            System.out.println("Paper covers Rock");
            System.out.println("Player B wins!");
        } else {
            System.out.println("Scissors cuts Paper");
            System.out.println("Player B wins!");
        }

        input.close();
    }
}

