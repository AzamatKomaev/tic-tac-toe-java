public class GameLogic {
    private Field field;
    private char userMove = 'x';


    GameLogic() {
        field = new Field();
    }

    private boolean checkWinningPositions() {
        char[][] state = field.getState();
        return false;
    }

    private boolean validateCoordinates(int x, int y) {
        char[][] state = field.getState();
        if (x > 3 || y > 3) {
            return false;
        }
        return state[x][y] == 0;
    }

    public void makeMove(int x, int y) {
        if (!validateCoordinates(x, y)) {
            System.out.println("Wrong coordinates!");
            return;
        }
        userMove = field.changeState(x, y, userMove);
    }

    public char getUserMove() {
        return userMove;
    }

    public void printTable() {
        char[][] state = field.getState();

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(state[i][j] + " ");
            }
            System.out.println();
        }
    }
}
