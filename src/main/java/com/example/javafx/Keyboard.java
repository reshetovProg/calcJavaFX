package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

public class Keyboard {

    private String actionBtn = "";

    public Label getLabel() {
        return label;
    }

    private final Label label;

    private static final String[] btnLabels = {
            "AC", "+/-", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "C", "0", ".", "="};

    private final FlowPane flowPane;

    Keyboard(Label label) {
        this.label = label;
        label.setTextFill(Color.WHITE);
        label.setMinHeight(60);
        label.setFont(new Font("Arial", 24));
        List<Node> btns = new ArrayList<>();
        for (int i = 0, n = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                Button btn = new Button();
                btn.setText(btnLabels[n++]);
                btn.setPrefSize(50,50);
                btn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        actionBtn=btn.getText();
                        label.setText(actionBtn);
                    }
                });
                btns.add(btn);
            }
        }
        flowPane = new FlowPane();
        flowPane.getChildren().addAll(btns);
        flowPane.setOrientation(Orientation.HORIZONTAL);
        flowPane.setMaxWidth(200);
    }

    public FlowPane getFlowPane() {
        return flowPane;
    }

    public String getActionBtn() {
        return actionBtn;
    }
}
