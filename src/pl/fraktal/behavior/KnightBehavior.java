package pl.fraktal.behavior;

import pl.fraktal.Board;

/**
 * Created by Hollow on 2018-09-18.
 */
public class KnightBehavior extends CommonBehavior implements Behavior{

    @Override
    public boolean isSpecificMoveValid(int initColumn, int initRow, int targetColumn, int targetRow, Board board) {

        if ( Math.abs(initColumn - targetColumn) == 1 && Math.abs(initRow - targetRow) == 2){
            return true;
        } else if ( Math.abs(initColumn - targetColumn) == 2 && Math.abs(initRow - targetRow) == 1){
            return true;
        }
        return false;
    }
}
