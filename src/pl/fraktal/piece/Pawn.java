package pl.fraktal.piece;

import javafx.scene.paint.Color;
import pl.fraktal.Board;
import pl.fraktal.behavior.PawnBehavior;
import pl.fraktal.piece.Piece;

/**
 * Created by Hollow on 2018-09-17.
 */
public class Pawn extends Piece {

    public Pawn(int col, int row, Color color, String imageUrl, Board board) {
        super(col, row, color, imageUrl, board);
        this.setPieceBehavior(new PawnBehavior());
    }
}
