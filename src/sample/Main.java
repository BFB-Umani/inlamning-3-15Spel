package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    GridPane gridScene = new GridPane();
    ActionEvent buttonswitch = new ActionEvent();
    Button btn1 = new Button("1");
    Button btn2 = new Button("2");
    Button btn3 = new Button("3");
    Button btn4 = new Button("4");
    Button btn5 = new Button("5");
    Button btn6 = new Button("6");
    Button btn7 = new Button("7");
    Button btn8 = new Button("8");
    Button btn9 = new Button("9");
    Button btn10 = new Button("10");
    Button btn11 = new Button("11");
    Button btn12 = new Button("12");
    Button btn13 = new Button("13");
    Button btn14 = new Button("14");
    Button btn15 = new Button("15");
    Button btn16 = new Button("TOM");



    @Override
    public void start(Stage primaryStage) throws Exception{
        gridScene.setHgap(10);
        gridScene.setVgap(10);
        btn1.setMinSize(100,100);
        btn2.setMinSize(100,100);
        btn3.setMinSize(100,100);
        btn4.setMinSize(100,100);
        btn5.setMinSize(100,100);
        btn6.setMinSize(100,100);
        btn7.setMinSize(100,100);
        btn8.setMinSize(100,100);
        btn9.setMinSize(100,100);
        btn10.setMinSize(100,100);
        btn11.setMinSize(100,100);
        btn12.setMinSize(100,100);
        btn13.setMinSize(100,100);
        btn14.setMinSize(100,100);
        btn15.setMinSize(100,100);
        btn16.setMinSize(100,100);
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
        btn1.setOnAction(this::handle);
        btn2.setOnAction(this::handle);
        btn3.setOnAction(this::handle);
        btn4.setOnAction(this::handle);
        btn5.setOnAction(this::handle);
        btn6.setOnAction(this::handle);
        btn7.setOnAction(this::handle);
        btn8.setOnAction(this::handle);
        btn9.setOnAction(this::handle);
        btn10.setOnAction(this::handle);
        btn11.setOnAction(this::handle);
        btn12.setOnAction(this::handle);
        btn13.setOnAction(this::handle);
        btn14.setOnAction(this::handle);
        btn15.setOnAction(this::handle);
        Scene scene = new Scene(gridScene, 460,460);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public void handle(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        System.out.println(gridScene.getColumnIndex(button));
        if(gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button) - 1) {
            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(button));
            gridScene.setColumnIndex(button, gridScene.getColumnIndex(button) - 1);
        }
        else if(gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button) + 1) {
            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(button));
            gridScene.setColumnIndex(button, gridScene.getColumnIndex(button) + 1);
        }
        else if(gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button) + 1) {
            gridScene.setRowIndex(btn16, gridScene.getRowIndex(button));
            gridScene.setRowIndex(button, gridScene.getRowIndex(button) + 1);
        }
        else if(gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button) - 1) {
            gridScene.setRowIndex(btn16, gridScene.getRowIndex(button));
            gridScene.setRowIndex(button, gridScene.getRowIndex(button) - 1);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
