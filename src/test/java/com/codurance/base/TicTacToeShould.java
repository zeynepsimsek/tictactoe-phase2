package com.codurance.base;

import com.codurance.base.enums.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TicTacToeShould {

    @Test
    void fill_the_cell_with_X_when_playerX_plays() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.move(Coordinate.TOPLEFT);
        CellMarkedResponse markedResponse = new CellMarkedResponse(true);

        assertEquals(markedResponse, ticTacToe.isCellMarked(Coordinate.TOPLEFT));
    }

    @Test
    void not_mark_the_cell_with_another_position() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.move(Coordinate.TOPLEFT);
        CellMarkedResponse markedResponse = new CellMarkedResponse(false);

        assertEquals(markedResponse, ticTacToe.isCellMarked(Coordinate.TOPCENTER));
    }
}
