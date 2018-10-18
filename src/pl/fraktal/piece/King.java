package pl.fraktal.piece;

import javafx.scene.paint.Color;
import pl.fraktal.Board;
import pl.fraktal.behavior.KingBehavior;

/**
 * Created by Hollow on 2018-09-22.
 */
public class King extends Piece {

    public King(int col, int row, Color color, String imageUrl, Board board) {
        super(col, row, color, imageUrl, board);
        this.setPieceBehavior(new KingBehavior());
    }
}
