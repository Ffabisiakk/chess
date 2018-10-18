package pl.fraktal.behavior;

import pl.fraktal.Board;

/**
 * Created by Hollow on 2018-09-18.
 */
public interface Behavior {

    public boolean isMoveValid(int initColumn, int initRow, int targetColumn, int targetRow, Board board);
}
