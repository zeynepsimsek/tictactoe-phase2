package com.codurance.base;

import java.util.Objects;

public class CellMarkedResponse {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CellMarkedResponse that = (CellMarkedResponse) o;
        return Objects.equals(marked, that.marked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marked);
    }

    private Boolean marked;

    public CellMarkedResponse(boolean marked) {
        this.marked = marked;
    }
}
