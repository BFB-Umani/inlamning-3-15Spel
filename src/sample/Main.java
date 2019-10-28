package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    Group root = new Group();
    GridPane gridScene = new GridPane();
    Image bg = new Image("file:background_game_board.jpg");
    Image button1 = new Image("file:button_1.jpg");
    Image button2 = new Image("file:button_2.jpg");
    Image button3 = new Image("file:button_3.jpg");
    Image button4 = new Image("file:button_4.jpg");
    Image button5 = new Image("file:button_5.jpg");
    Image button6 = new Image("file:button_6.jpg");
    Image button7 = new Image("file:button_7.jpg");
    Image button8 = new Image("file:button_8.jpg");
    Image button9 = new Image("file:button_9.jpg");
    Image button10 = new Image("file:button_10.jpg");
    Image button11 = new Image("file:button_11.jpg");
    Image button12 = new Image("file:button_12.jpg");
    Image button13 = new Image("file:button_13.jpg");
    Image button14 = new Image("file:button_14.jpg");
    Image button15 = new Image("file:button_15.jpg");
    ImageView background = new ImageView(bg);
    ImageView b1 = new ImageView(button1);
    ImageView b2 = new ImageView(button2);
    ImageView b3 = new ImageView(button3);
    ImageView b4 = new ImageView(button4);
    ImageView b5 = new ImageView(button5);
    ImageView b6 = new ImageView(button6);
    ImageView b7 = new ImageView(button7);
    ImageView b8 = new ImageView(button8);
    ImageView b9 = new ImageView(button9);
    ImageView b10 = new ImageView(button10);
    ImageView b11 = new ImageView(button11);
    ImageView b12 = new ImageView(button12);
    ImageView b13 = new ImageView(button13);
    ImageView b14 = new ImageView(button14);
    ImageView b15 = new ImageView(button15);
    Label btn1 = new Label("",b1);
    Label btn2 = new Label("",b2);
    Label btn3 = new Label("",b3);
    Label btn4 = new Label("",b4);
    Label btn5 = new Label("",b5);
    Label btn6 = new Label("",b6);
    Label btn7 = new Label("",b7);
    Label btn8 = new Label("",b8);
    Label btn9 = new Label("",b9);
    Label btn10 = new Label("",b10);
    Label btn11 = new Label("",b11);
    Label btn12 = new Label("",b12);
    Label btn13 = new Label("",b13);
    Label btn14 = new Label("",b14);
    Label btn15 = new Label("",b15);
    Label btn16 = new Label("");
    //fel

    @Override
    public void start(Stage primaryStage){
        primaryStage.setResizable(false);
        root.getChildren().addAll(background);
        root.getChildren().addAll(gridScene);
        gridScene.setHgap(2);
        gridScene.setVgap(2);
        gridScene.setPadding(new Insets(90, 0, 0, 150));
        gridScene.add(btn1, 0,0);
        gridScene.add(btn2, 1,0);
        gridScene.add(btn3, 2,0);
        gridScene.add(btn4, 3,0);
        gridScene.add(btn5, 0,1);
        gridScene.add(btn6, 1,1);
        gridScene.add(btn7, 2,1);
        gridScene.add(btn8, 3,1);
        gridScene.add(btn9, 0,2);
        gridScene.add(btn10, 1,2);
        gridScene.add(btn11, 2,2);
        gridScene.add(btn12, 3,2);
        gridScene.add(btn13, 0,3);
        gridScene.add(btn14, 1,3);
        gridScene.add(btn15, 2,3);
        gridScene.add(btn16, 3,3);
        btn16.setVisible(false);
        btn1.setOnMouseClicked(this::handle);
        btn2.setOnMouseClicked(this::handle);
        btn3.setOnMouseClicked(this::handle);
        btn4.setOnMouseClicked(this::handle);
        btn5.setOnMouseClicked(this::handle);
        btn6.setOnMouseClicked(this::handle);
        btn7.setOnMouseClicked(this::handle);
        btn8.setOnMouseClicked(this::handle);
        btn9.setOnMouseClicked(this::handle);
        btn10.setOnMouseClicked(this::handle);
        btn11.setOnMouseClicked(this::handle);
        btn12.setOnMouseClicked(this::handle);
        btn13.setOnMouseClicked(this::handle);
        btn14.setOnMouseClicked(this::handle);
        btn15.setOnMouseClicked(this::handle);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Sliding puzzle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void handle(MouseEvent mouseEvent) {
        Label button = (Label) mouseEvent.getSource();
        if(gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button) -1 && gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button)) {
            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(button));
            gridScene.setColumnIndex(button, gridScene.getColumnIndex(button) - 1);
        }
        else if(gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button) + 1 && gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button)) {
            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(button));
            gridScene.setColumnIndex(button, gridScene.getColumnIndex(button) + 1);
        }
        else if(gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button) + 1 && gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button)) {
            gridScene.setRowIndex(btn16, gridScene.getRowIndex(button));
            gridScene.setRowIndex(button, gridScene.getRowIndex(button) + 1);
        }
        else if(gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button) - 1 && gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button)) {
            gridScene.setRowIndex(btn16, gridScene.getRowIndex(button));
            gridScene.setRowIndex(button, gridScene.getRowIndex(button) - 1);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}


