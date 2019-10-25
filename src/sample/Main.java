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
    Button btn1 = new Button();
    Button btn2 = new Button();
    Button btn3 = new Button();
    Button btn4 = new Button();
    Button btn5 = new Button();
    Button btn6 = new Button();
    Button btn7 = new Button();
    Button btn8 = new Button();
    Button btn9 = new Button();
    Button btn10 = new Button();
    Button btn11 = new Button();
    Button btn12 = new Button();
    Button btn13 = new Button();
    Button btn14 = new Button();
    Button btn15 = new Button();
    Button btn16 = new Button();



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
        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");
        btn10.setText("10");
        btn11.setText("11");
        btn12.setText("12");
        btn13.setText("13");
        btn14.setText("14");
        btn15.setText("15");
        btn16.setText("tom!");
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
//        btn8.setOnAction((EventHandler<ActionEvent>) buttonswitch, btn8);
//        btn7.setOnAction(this::handle);
        Scene scene = new Scene(gridScene, 460,460);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void bSwitch(ActionEvent buttonswitch, Button button) {

        System.out.println(gridScene.getColumnIndex(btn7));
        if(gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button) - 1) {
            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(btn8));
            gridScene.setColumnIndex(btn8, gridScene.getColumnIndex(btn8) - 1);
        }
        else if(gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(btn8) + 1) {
            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(btn8));
            gridScene.setColumnIndex(btn8, gridScene.getColumnIndex(btn8) - 1);
        }
    }

//    @Override
//    public void handle(Event event) {
//        System.out.println(gridScene.getColumnIndex(btn7));
//        if(gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(btn8) - 1) {
//            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(btn8));
//            gridScene.setColumnIndex(btn8, gridScene.getColumnIndex(btn8) - 1);
//        }
//        else if(gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(btn8) + 1) {
//            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(btn8));
//            gridScene.setColumnIndex(btn8, gridScene.getColumnIndex(btn8) - 1);
//        }
//    }
}
