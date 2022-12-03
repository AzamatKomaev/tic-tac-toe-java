import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic logic = new GameLogic();
        Scanner scanner = new Scanner(System.in);

        int x, y;
        char userMove;
        boolean continueGame = true;

        while (continueGame) {
            userMove = logic.getUserMove();
            if (userMove == 'x') {
                System.out.println("now it's the X player's turn");
            }
            else {
                System.out.println("now it's the O player's turn");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();

            continueGame = logic.makeMove(x, y);
            System.out.println("Table:");
            logic.printTable();

            if (!continueGame) {
                System.out.println("The game was finished! The winner is: " + userMove);
            }
        }
    }
}
