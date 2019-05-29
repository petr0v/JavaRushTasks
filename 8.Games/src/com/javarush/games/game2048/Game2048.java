package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];


    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();

    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellColoredNumber(i, j, gameField[i][j]);

            }
        }
    }

    private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        while (gameField[y][x] != 0) {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
        }
        if (getRandomNumber(10) > 8)
            gameField[y][x] = 4;
        else
            gameField[y][x] = 2;

    }

    private Color getColorByValue(int value) {
        Color color = null;
        if (value == 0)
            color = Color.WHITESMOKE;
        if (value == 2)
            color = Color.WHITE;
        if (value == 4)
            color = Color.AQUA;
        if (value == 8)
            color = Color.SILVER;
        if (value == 16)
            color = Color.YELLOW;
        if (value == 32)
            color = Color.RED;
        if (value == 64)
            color = Color.BLUE;
        if (value == 128)
            color = Color.ORANGE;
        if (value == 256)
            color = Color.GREEN;
        if (value == 512)
            color = Color.BROWN;
        if (value == 1024)
            color = Color.PINK;
        if (value == 2048)
            color = Color.AZURE;
        return color;
    }

    private void setCellColoredNumber(int x, int y, int value) {
        if (value == 0)
            setCellValueEx(y, x, getColorByValue(value), "");
        else {
            setCellValueEx(y, x, getColorByValue(value),  String.valueOf(value));
        }
    }
}
