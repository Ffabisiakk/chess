package pl.fraktal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ChessGame");
        Board board = new Board();

        Scene scene = new Scene(board, 800, 800);
        stage.setScene(scene);
        stage.show();
    }
}
