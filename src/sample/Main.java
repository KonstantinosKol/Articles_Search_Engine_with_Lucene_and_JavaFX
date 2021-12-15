package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainLayout.fxml"));
        primaryStage.setTitle("Articles Search Engine");
        primaryStage.setScene(new Scene(root, 1215, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        LuceneTester.main(args);
        launch(args);
    }
}
