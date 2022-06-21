package com.codurance.base;

import com.codurance.base.enums.Coordinate;

public class TicTacToe {
    public void move(Coordinate coordinate) {
    }

    public CellMarkedResponse isCellMarked(Coordinate coordinate) {
        return new CellMarkedResponse(true);
    }
}
