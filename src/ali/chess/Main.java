package ali.chess;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("views/chessBoard.fxml"));
        root.setStyle("-fx-background-color: #cccccc");
        primaryStage.setTitle("Chess Game");
        primaryStage.setScene(new Scene(root,600,600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
