package pl.fraktal.behavior;

import javafx.scene.paint.Color;
import pl.fraktal.Board;

/**
 * Created by Hollow on 2018-09-18.
 */
public class PawnBehavior extends CommonBehavior implements Behavior{

    @Override
    public boolean isSpecificMoveValid(int initColumn, int initRow, int targetColumn, int targetRow, Board board) {

        if (initPieceColor == Color.WHITE){
            if (targetPieceColor == null && board.getTile(initColumn, initRow - 1).getPiece() == null && initRow == 6 && targetRow == 4 && initColumn == targetColumn) {
                return true;
            } else if (targetPieceColor == null && initRow - 1 == targetRow && initColumn == targetColumn){
                return true;
            } else if (targetPieceColor == Color.BLACK && (initRow - 1 == targetRow) && (initColumn + 1 == targetColumn || initColumn - 1 == targetColumn)){
                return true;
            }
        }

        if (initPieceColor == Color.BLACK){
            if (targetPieceColor == null && board.getTile(initColumn, initRow + 1).getPiece() == null && initRow == 1 && targetRow == 3 && initColumn == targetColumn) {
                return true;
            } else if (targetPieceColor == null && initRow + 1 == targetRow && initColumn == targetColumn){
                return true;
            } else if (targetPieceColor == Color.WHITE && (initRow + 1 == targetRow) && (initColumn + 1 == targetColumn || initColumn - 1 == targetColumn)){
                return true;
            }
        }

        return false;
    }
}
