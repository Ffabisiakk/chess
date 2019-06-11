package pl.fraktal;

import javafx.geometry.Side;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import pl.fraktal.piece.*;

/**
 * Created by Hollow on 2018-09-17.
 */
public class Board extends Pane{

    private SidePanel sidePanel;

    private boolean isBlackMove;
    private Tile[][] board;

    public Board(SidePanel sidePanel){
        this.sidePanel = sidePanel;

        board = new Tile[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Tile(i * 100, j * 100, 100, 100, this);
                this.getChildren().add(board[i][j]);
            }
        }

        boardInit();
    }

    public void boardInit() {
        for (int i = 0; i < 8; i++) {
            board[i][1].setPiece(new Pawn(i, 1, Color.BLACK, "pl/fraktal/resources/Black_Pawn.png", this));
        }

        board[0][0].setPiece(new Rook(0, 0, Color.BLACK, "pl/fraktal/resources/Black_Rook.png", this));
        board[7][0].setPiece(new Rook(7, 0, Color.BLACK, "pl/fraktal/resources/Black_Rook.png", this));

        board[1][0].setPiece(new Knight(1, 0, Color.BLACK, "pl/fraktal/resources/Black_Knight.png", this));
        board[6][0].setPiece(new Knight(6, 0, Color.BLACK, "pl/fraktal/resources/Black_Knight.png", this));

        board[2][0].setPiece(new Bishop(2, 0, Color.BLACK, "pl/fraktal/resources/Black_Bishop.png", this));
        board[5][0].setPiece(new Bishop(5, 0, Color.BLACK, "pl/fraktal/resources/Black_Bishop.png", this));

        board[4][0].setPiece(new King(4, 0, Color.BLACK, "pl/fraktal/resources/Black_King.png", this));
        board[3][0].setPiece(new Queen(3, 0, Color.BLACK, "pl/fraktal/resources/Black_Queen.png", this));


        for (int i = 0; i < 8; i++) {
            board[i][6].setPiece(new Pawn(i, 6, Color.WHITE, "pl/fraktal/resources/White_Pawn.png", this));
        }

        board[0][7].setPiece(new Rook(0, 7, Color.WHITE, "pl/fraktal/resources/White_Rook.png", this));
        board[7][7].setPiece(new Rook(7, 7, Color.WHITE, "pl/fraktal/resources/White_Rook.png", this));

        board[1][7].setPiece(new Knight(1, 7, Color.WHITE, "pl/fraktal/resources/White_Knight.png", this));
        board[6][7].setPiece(new Knight(6, 7, Color.WHITE, "pl/fraktal/resources/White_Knight.png", this));

        board[2][7].setPiece(new Bishop(2, 7, Color.WHITE, "pl/fraktal/resources/White_Bishop.png", this));
        board[5][7].setPiece(new Bishop(5, 7, Color.WHITE, "pl/fraktal/resources/White_Bishop.png", this));

        board[4][7].setPiece(new King(4, 7, Color.WHITE, "pl/fraktal/resources/White_King.png", this));
        board[3][7].setPiece(new Queen(3, 7, Color.WHITE, "pl/fraktal/resources/White_Queen.png", this));

//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j].getPiece() != null){
//                    piecesOnBoard.add(board[i][j].getPiece());
//                }
//            }
//        }
    }

    public void makeMove(int initColumn, int initRow, int targetColumn, int targetRow){

        Tile targetTile = board[targetColumn][targetRow];
        Tile initTile = board[initColumn][initRow];

        if (targetTile.getPiece() != null){
            targetTile.getPiece().getImageView().setX(-100);
        }
        targetTile.setPiece(initTile.getPiece());
        targetTile.getPiece().setColumn(targetColumn);
        targetTile.getPiece().setRow(targetRow);
        targetTile.getPiece().getImageView().setX(targetColumn * 100);
        targetTile.getPiece().getImageView().setY(targetRow * 100);
        initTile.setPiece(null);

        checkPromotion(targetTile.getPiece(), targetRow);

        isBlackMove = !isBlackMove;
        if (isBlackMove) {
            sidePanel.setWhoTurnText("Black Turn");
        } else {
            sidePanel.setWhoTurnText("White Turn");
        }

    }

    public Tile getTile(int row, int col){
        return board[row][col];
    }

    public void checkPromotion(Piece movedPiece, int targetRow){
        if (movedPiece instanceof Pawn) {
            if (movedPiece.getColor() == Color.BLACK && targetRow == 7){
                System.out.println("PROMOTION BLACK");
            } else if (movedPiece.getColor() == Color.WHITE && targetRow == 0){
                System.out.println("PROMOTION WHITE");
            }

        }
    }

    public boolean isBlackMove() {
        return isBlackMove;
    }
}
