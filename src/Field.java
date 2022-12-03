public class Field {
    private char[][] state = new char[3][3];

    /*
        Translate char state to int: It needs to compare returned array with winning positions
    */
    public int[][] translateStateToIntArray(char userMove) {
        int[][] intState = new int[3][3];
        char preventUserMove = userMove == 'x' ? 'o' : 'x';

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (state[i][j] == preventUserMove) {
                    intState[i][j] = 1;
                }
            }
        }
        return intState;
    }

    public char changeState(int x, int y, char move) {
        state[x][y] = move;
        return move == 'x' ? 'o' : 'x';
    }

    public char[][] getState() {
        return state;
    }
}
