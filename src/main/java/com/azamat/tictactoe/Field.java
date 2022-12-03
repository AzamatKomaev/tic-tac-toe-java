package com.azamat.tictactoe;

import java.util.Arrays;

public class Field {
    private Figure[] state = new Figure[9];

    public Field() {
        Arrays.fill(state, Figure.P);
    }

    public void changeState(int index, Figure move) {
        state[index] = move;
    }

    public Figure[] getState() {
        return state;
    }
}
