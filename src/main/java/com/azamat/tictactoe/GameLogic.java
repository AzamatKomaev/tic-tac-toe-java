package com.azamat.tictactoe;

import java.util.Scanner;

public class GameLogic implements WinningPositions {
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);

    private void printTable() {
        Figure[] state = field.getState();

        for (int i=0; i<9; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            System.out.print(state[i] + " ");
        }
    }


    public void start() {
        while (true) {
            int f1 = getFirstUserInput();
            field.changeState(f1, Figure.X);
            if (checkWinner(Figure.X)) return;
            printTable();

            int f2 = getSecondUserInput();
            field.changeState(f2, Figure.O);
            if (checkWinner(Figure.O)) return;
            printTable();
        }
    }

    private boolean checkWinner(Figure userMove) {
        Figure[] state = field.getState();
        int a, b, c; // indexes of each winning position

        for (int[] winningPosition: winningPositions) {
            a = winningPosition[0];
            b = winningPosition[1];
            c = winningPosition[2];
            if (state[a] == userMove && state[b] == userMove && state[c] == userMove) {
                return true;
            }
        }

        return false;

    }

    private int getFirstUserInput() {
        int firstUserInput = scanner.nextInt();
        while (!validateUserInput(firstUserInput)) {
            firstUserInput = scanner.nextInt();
        }
        return firstUserInput;
    }


    private int getSecondUserInput() {
        int secondUserInput = scanner.nextInt();
        while (!validateUserInput(secondUserInput)) {
            secondUserInput = scanner.nextInt();
        }
        return secondUserInput;
    }

    private boolean validateUserInput(int input) {
        if (input < 0 || input > 8) {
            return false;
        }

        Figure[] state = field.getState();
        return state[input] == Figure.P;
    }
}
