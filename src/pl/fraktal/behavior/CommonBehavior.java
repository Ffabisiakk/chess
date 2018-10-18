package pl.fraktal.behavior;

import javafx.scene.paint.Color;
import pl.fraktal.Board;

/**
 * Created by Hollow on 2018-09-18.
 */
public abstract class CommonBehavior implements Behavior{

    Board board;
    Color initPieceColor, targetPieceColor;

    public boolean isMoveValid(int initColumn, int initRow, int targetColumn, int targetRow, Board board){

        if (targetColumn > 7 || targetColumn < 0 || targetRow > 7 || targetRow < 0) {
            return false;
        } else if (targetColumn == initColumn && targetRow == initRow){
            return false;
        }

        initPieceColor = board.getTile(initColumn, initRow).getPiece().getColor();

        if ((board.isBlackMove() && initPieceColor.equals(Color.WHITE)) || (!board.isBlackMove() && initPieceColor.equals(Color.BLACK))) {
            return false;
        }

        try {
            targetPieceColor = board.getTile(targetColumn, targetRow).getPiece().getColor();
        } catch (NullPointerException e){
            targetPieceColor = null;
        }

        if (board.getTile(initColumn, initRow).getPiece() == null) {
            return false;
        } else if (initPieceColor == targetPieceColor){
            return false;
        } else if (!isSpecificMoveValid(initColumn, initRow, targetColumn, targetRow, board)){
            return false;
        }
        return true;
    }

    public abstract boolean isSpecificMoveValid(int initColumn, int initRow, int targetColumn, int targetRow, Board board);

//    public boolean isAnyObstacles (int initColumn, int initRow, int targetColumn, int targetRow, Board board) {
//        if (initColumn == targetColumn) {
//            for (int i = initRow + 1; i < targetRow; i++) {
//
//            }
//        }
//    }
}
