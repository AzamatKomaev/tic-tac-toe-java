public class Field {
    private char[][] state = new char[3][3];
    private char userMove = 'x';

    public void changeState(int x, int y) {
        state[x][y] = userMove;

        if (userMove == 'x') {
            userMove = 'o';
        } else {
            userMove = 'x';
        }
    }

    public char[][] getState() {
        return state;
    }
}
