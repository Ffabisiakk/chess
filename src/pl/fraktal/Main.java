package pl.fraktal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("ChessGame");

        SidePanel sidePanel = new SidePanel();
        Board board = new Board(sidePanel);

        HBox hBox = new HBox(board, sidePanel);

        Scene scene = new Scene(hBox, 1100, 800);
        stage.setScene(scene);
        stage.show();
    }
}
