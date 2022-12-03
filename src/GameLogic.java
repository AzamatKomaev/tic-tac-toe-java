import java.util.Arrays;

public class GameLogic implements WinningPositions {
    private Field field;
    private char userMove = 'x';


    GameLogic() {
        field = new Field();
    }

    private boolean checkWinningPositions() {
        int[][] intState = field.translateStateToIntArray(userMove);

        for (int[][] winningPosition : winningPositions) {
            if (Arrays.deepEquals(intState, winningPosition)) {
                return true;
            }
        }

        return false;
    }

    private boolean validateCoordinates(int x, int y) {
        char[][] state = field.getState();
        if (x > 3 || y > 3) {
            return false;
        }
        return state[x][y] == 0;
    }

    public boolean makeMove(int x, int y) {
        if (!validateCoordinates(x, y)) {
            System.out.println("Wrong coordinates!");
            return true;
        }

        userMove = field.changeState(x, y, userMove);
        return !checkWinningPositions();
    }

    public char getUserMove() {
        return userMove;
    }

    public void printTable() {
        char[][] state = field.getState();

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (state[i][j] == 0) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(state[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
