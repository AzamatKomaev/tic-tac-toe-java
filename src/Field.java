public class Field {
    private char[][] state = new char[3][3];


    public char changeState(int x, int y, char move) {
        state[x][y] = move;
        return move == 'x' ? 'o' : 'x';
    }

    public char[][] getState() {
        return state;
    }
}
