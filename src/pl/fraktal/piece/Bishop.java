package pl.fraktal.piece;

import javafx.scene.paint.Color;
import pl.fraktal.Board;
import pl.fraktal.behavior.BishopBehavior;

/**
 * Created by Hollow on 2018-09-23.
 */
public class Bishop extends Piece {

    public Bishop(int col, int row, Color color, String imageUrl, Board board) {
        super(col, row, color, imageUrl, board);
        this.setPieceBehavior(new BishopBehavior());
    }
}
