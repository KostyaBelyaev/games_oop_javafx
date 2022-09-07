package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && (monoHor(board, index) || monoVert(board, index))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoHor(int[][] boart, int row) {
        boolean result = true;
        for (int i = 0; i < boart[row].length; i++) {
            if (boart[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVert(int[][] boart, int cell) {
        boolean result = true;
        for (int i = 0; i < boart.length; i++) {
            if (boart[i][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}

