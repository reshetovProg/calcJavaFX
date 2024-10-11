package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    private final Label label = new Label("0");
    private final Keyboard keyboard = new Keyboard(label);

    @Override
    public void start(Stage stage) throws IOException {

        keyboard.getFlowPane().setLayoutY(60);
        Group group = new Group(
                keyboard.getLabel(),
                keyboard.getFlowPane());
        Scene scene = new Scene(group, Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Калькулятор");
        stage.setWidth(216);
        stage.setHeight(350);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}