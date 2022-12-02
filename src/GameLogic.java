public class GameLogic {
    private Field field;

    GameLogic() {
        field = new Field();
    }

    private boolean checkWinningPositions() {
        char[][] state = field.getState();
        return false;
    }

    public void makeMove(int x, int y) {
        if (x > 3 || y > 3) {
            System.out.println("Wrong coordinates!");
            return;
        }

        field.changeState(x, y);
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
