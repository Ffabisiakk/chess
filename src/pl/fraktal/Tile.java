package pl.fraktal;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import pl.fraktal.piece.Piece;

/**
 * Created by Hollow on 2018-09-17.
 */
public class Tile extends Rectangle {

    Piece piece;
    Color color;

    public Tile(int x, int y, int width, int height, Board board) {
        super(x, y, width, height);

        if ((x + y) % 200 == 0) {
            color = Color.WHITE;
        } else {
            color = Color.CHOCOLATE;
        }
        this.setFill(color);

        this.setOnMouseDragged(event -> {

            if (this.getPiece() != null){
                getPiece().getImageView().setX(event.getX() - 50);
                getPiece().getImageView().setY(event.getY() - 50);
            }
        });

        this.setOnMouseReleased(event -> {

            if (this.getPiece() != null){
                int initColumn = this.getPiece().getColumn() / 100;
                int initRow = this.getPiece().getRow() / 100;
                int targetColumn = (int) (event.getX() / 100);
                int targetRow = (int) (event.getY() / 100);

                if (this.getPiece().getPieceBehavior().isMoveValid(initColumn, initRow, targetColumn, targetRow, board)){
                    board.makeMove(initColumn, initRow, targetColumn, targetRow);
                } else {
                    getPiece().getImageView().setX(getX());
                    getPiece().getImageView().setY(getY());
                }
            }
        });
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }
}
