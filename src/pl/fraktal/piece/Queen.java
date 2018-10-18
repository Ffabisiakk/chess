package pl.fraktal.piece;

import javafx.scene.paint.Color;
import pl.fraktal.Board;
import pl.fraktal.behavior.QueenBehavior;

/**
 * Created by Hollow on 2018-09-22.
 */
public class Queen extends Piece {
    public Queen(int col, int row, Color color, String imageUrl, Board board) {
        super(col, row, color, imageUrl, board);
        setPieceBehavior(new QueenBehavior());
    }
}
