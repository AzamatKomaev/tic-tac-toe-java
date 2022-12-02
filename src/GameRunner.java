import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic logic = new GameLogic();
        Scanner scanner = new Scanner(System.in);

        int x, y;

        while (true) {
            if (logic.getUserMove() == 'x') {
                System.out.println("now it's the X player's turn");
            } else {
                System.out.println("now it's the O player's turn");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();

            logic.makeMove(x, y);
            System.out.println("Table:");
            logic.printTable();
        }
    }
}
