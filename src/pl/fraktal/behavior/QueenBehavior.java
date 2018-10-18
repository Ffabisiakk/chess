package pl.fraktal.behavior;

import javafx.scene.paint.Color;
import pl.fraktal.Board;

/**
 * Created by Hollow on 2018-09-18.
 */
public class QueenBehavior extends CommonBehavior implements Behavior{

    @Override
    public boolean isSpecificMoveValid(int initColumn, int initRow, int targetColumn, int targetRow, Board board) {

        if (targetColumn == initColumn){
            return true;
        } else if (initRow == targetRow) {
            return true;
        } else if (targetColumn - initColumn == targetRow - initRow){
            return true;
        } else if (initColumn + initRow == targetColumn + targetRow) {
            return true;
        }
        return false;
    }
}
