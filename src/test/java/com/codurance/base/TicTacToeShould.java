package com.codurance.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TicTacToeShould {

    @Test
    void fill_the_cell_with_X_when_playerX_plays() {
        TicTacToe ticTacToe = new TicTacToe();
        MoveResponse response = ticTacToe.move(Coordinate.TOPLEFT);

        assertEquals("X", response.getBoardDto().getCell(Coordinate.TOPLEFT));
    }
}
