package com.azamat.tictactoe;

import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);


    public void start() {
        while (checkWinner() != null) {
            Integer f1 = getFirstUserInput();
            System.out.println(field);
            Integer f2 = getSecondUserInput();
            System.out.println(field);
            field.changeState(f1, Figure.O);
            checkWinner();
            field.changeState(f2, Figure.X);
        }
    }

    private String checkWinner() {
        return null;
    }

    private Integer getFirstUserInput() {
        Integer firstUserInput = scanner.nextInt();

        while (validateUserInput(firstUserInput)) {
            firstUserInput = scanner.nextInt();
        }
        return firstUserInput;
    }


    private Integer getSecondUserInput() {
        Integer secondUserInput = scanner.nextInt();

        return secondUserInput;
    }

    private boolean validateUserInput(Integer input) {
        return false;
    }
}
