package pl.fraktal.piece;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import pl.fraktal.Board;
import pl.fraktal.behavior.Behavior;

/**
 * Created by Hollow on 2018-09-17.
 */
public abstract class Piece extends Parent{

    private int column, row;
    private Color color;
    private Image image;
    private ImageView imageView;
    private Behavior pieceBehavior;

    public Piece (int col, int row, Color color, String imageUrl, Board board) {
        this.column = col * 100;
        this.row = row * 100;
        this.color = color;

        image = new Image(imageUrl);
        imageView = new ImageView(image);
        imageView.setX(column);
        imageView.setY(this.row);
        imageView.setFitWidth(95);
        imageView.setFitHeight(95);
        imageView.setMouseTransparent(true);

        board.getChildren().addAll(this, imageView);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setColumn(int column) {
        this.column = column * 100;
    }

    public void setRow(int row) {
        this.row = row * 100;
    }

    public Color getColor() {
        return color;
    }

    public void setPieceBehavior(Behavior pieceBehavior) {
        this.pieceBehavior = pieceBehavior;
    }

    public Behavior getPieceBehavior() {
        return pieceBehavior;
    }
}
