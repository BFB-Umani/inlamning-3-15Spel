package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main extends Application {
    Group root = new Group();
    TilePane newGamePane = new TilePane();
    GridPane gridScene = new GridPane();
    Image bg = new Image("file:background_game_board.jpg");
    Image button1 = new Image("file:button_1.png");
    Image button2 = new Image("file:button_2.png");
    Image button3 = new Image("file:button_3.png");
    Image button4 = new Image("file:button_4.png");
    Image button5 = new Image("file:button_5.png");
    Image button6 = new Image("file:button_6.png");
    Image button7 = new Image("file:button_7.png");
    Image button8 = new Image("file:button_8.png");
    Image button9 = new Image("file:button_9.png");
    Image button10 = new Image("file:button_10.png");
    Image button11 = new Image("file:button_11.png");
    Image button12 = new Image("file:button_12.png");
    Image button13 = new Image("file:button_13.png");
    Image button14 = new Image("file:button_14.png");
    Image button15 = new Image("file:button_15.png");
    Image quitButtonImage = new Image("file:Quit.png");
    Image newGameButtonImage = new Image("file:NewGame.png");
    Image youWonImage = new Image("file:YouWon.png");
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
    ImageView quitButtonImageView = new ImageView(quitButtonImage);
    ImageView newGameImageView = new ImageView(newGameButtonImage);
    ImageView youWonImageView = new ImageView(youWonImage);
    Label btn1 = new Label("", b1);
    Label btn2 = new Label("", b2);
    Label btn3 = new Label("", b3);
    Label btn4 = new Label("", b4);
    Label btn5 = new Label("", b5);
    Label btn6 = new Label("", b6);
    Label btn7 = new Label("", b7);
    Label btn8 = new Label("", b8);
    Label btn9 = new Label("", b9);
    Label btn10 = new Label("", b10);
    Label btn11 = new Label("", b11);
    Label btn12 = new Label("", b12);
    Label btn13 = new Label("", b13);
    Label btn14 = new Label("", b14);
    Label btn15 = new Label("", b15);
    Label btn16 = new Label("");
    Label youWonLabel = new Label("", youWonImageView);
    Button newGame = new Button("New game");
    Button winGameButton = new Button("win game!");
    Label quitButton = new Label("", quitButtonImageView);
    Label winNewGame = new Label("", newGameImageView);
    List buttonList = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16);
    List correctbuttonList = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16);

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setResizable(false);
        root.getChildren().addAll(background);
        root.getChildren().addAll(gridScene);
        root.getChildren().addAll(newGamePane);

        newGamePane.setAlignment(Pos.TOP_RIGHT);
        newGamePane.getChildren().add(newGame);
        newGamePane.getChildren().add(winGameButton);
        gridScene.setHgap(2);
        gridScene.setVgap(2);
        gridScene.setPadding(new Insets(90, 0, 0, 150));
        startGame();
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
        winGameButton.setOnAction(actionEvent -> {
            int buttonIndex = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    gridScene.setRowIndex((Label) correctbuttonList.get(buttonIndex), i);
                    gridScene.setColumnIndex((Label) correctbuttonList.get(buttonIndex), j);
                    buttonIndex++;
                }
            }
            boolean winGame = winGameCalculation();
            if (winGame) {
                winGameMessage();
            }
        });


        newGame.setOnAction(actionEvent -> {
            shuffleNewGame();
        });

        Scene scene = new Scene(root);
        primaryStage.setTitle("Sliding puzzle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void startGame() {

        Collections.shuffle(buttonList);
        int buttonIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gridScene.add((Label) buttonList.get(buttonIndex), i, j);
                buttonIndex++;
            }
        }

    }

    private void handle(MouseEvent mouseEvent) {
        Label button = (Label) mouseEvent.getSource();
        if (gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button) - 1 && gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button)) {
            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(button));
            gridScene.setColumnIndex(button, gridScene.getColumnIndex(button) - 1);
        } else if (gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button) + 1 && gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button)) {
            gridScene.setColumnIndex(btn16, gridScene.getColumnIndex(button));
            gridScene.setColumnIndex(button, gridScene.getColumnIndex(button) + 1);
        } else if (gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button) + 1 && gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button)) {
            gridScene.setRowIndex(btn16, gridScene.getRowIndex(button));
            gridScene.setRowIndex(button, gridScene.getRowIndex(button) + 1);
        } else if (gridScene.getRowIndex(btn16) == gridScene.getRowIndex(button) - 1 && gridScene.getColumnIndex(btn16) == gridScene.getColumnIndex(button)) {
            gridScene.setRowIndex(btn16, gridScene.getRowIndex(button));
            gridScene.setRowIndex(button, gridScene.getRowIndex(button) - 1);
        }
        boolean winGame = winGameCalculation();
        if (winGame) {
            winGameMessage();
        }
    }

    private boolean winGameCalculation() {
        int buttonIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gridScene.getColumnIndex((Label) correctbuttonList.get(buttonIndex)) != j || gridScene.getRowIndex((Label) correctbuttonList.get(buttonIndex)) != i) {
                    return false;
                }
                buttonIndex++;
            }
        }
        return true;
    }

    private void winGameMessage() {

        Stage dialogStage = new Stage();
        HBox hBox = new HBox(youWonLabel, quitButton, winNewGame);
        quitButton.setCursor(Cursor.HAND);
        winNewGame.setCursor(Cursor.HAND);

        quitButton.setOnMouseClicked(actionEvent -> {
            System.exit(0);
        });
        winNewGame.setOnMouseClicked(actionEvent -> {
            shuffleNewGame();
            dialogStage.close();
        });

        dialogStage.setScene(new Scene(hBox));
        dialogStage.show();

    }

    private void shuffleNewGame() {
        Collections.shuffle(buttonList);
        int buttonIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gridScene.setColumnIndex((Label) buttonList.get(buttonIndex), j);
                gridScene.setRowIndex((Label) buttonList.get(buttonIndex), i);
                buttonIndex++;
            }
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}


