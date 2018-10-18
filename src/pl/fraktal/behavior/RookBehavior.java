package pl.fraktal.behavior;

import pl.fraktal.Board;

/**
 * Created by Hollow on 2018-09-18.
 */
public class RookBehavior extends CommonBehavior implements Behavior{

    @Override
    public boolean isSpecificMoveValid(int initColumn, int initRow, int targetColumn, int targetRow, Board board) {

        if (targetColumn == initColumn){
            return true;
        } else if (initRow == targetRow) {
            return true;
        }
        return false;
    }
}
