package pl.fraktal.behavior;

import javafx.scene.paint.Color;
import pl.fraktal.Board;

/**
 * Created by Hollow on 2018-09-18.
 */
public class KingBehavior extends CommonBehavior implements Behavior{

    @Override
    public boolean isSpecificMoveValid(int initColumn, int initRow, int targetColumn, int targetRow, Board board) {

        if (Math.abs(targetColumn - initColumn) <= 1 && Math.abs(targetRow - initRow) <= 1){
            return true;
        }

        return false;
    }
}
