package pl.fraktal;

import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import pl.fraktal.resources.Clock;

public class SidePanel extends VBox {

    Text whoTurn;

    public SidePanel() {

        whoTurn = new Text("White Turn");
        whoTurn.setFont(new Font(40));
        Clock clock = new Clock(true);
        Clock clock1 = new Clock(false);
//        clock.clock();
//        clock1.clock();
        Text timers = new Text(clock.getText() + "||" + clock1.getText());
        timers.setFont(new Font(30));
        Text moves = new Text("5f-5e");
        ScrollPane scrollPane = new ScrollPane(moves);
        scrollPane.setVbarPolicy((ScrollPane.ScrollBarPolicy.ALWAYS));
        moves.setFont(new Font(20));

        this.getChildren().addAll(whoTurn, timers, scrollPane);
        this.setAlignment(Pos.TOP_CENTER);
        this.setMinWidth(300);
        this.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

    }

    public void setWhoTurnText(String text) {
        whoTurn.setText(text);
    }
}
