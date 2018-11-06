package principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Organización territorial de Costa Rica");
        primaryStage.setScene(new Scene(root, 1088, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println(LectorJSOUP.sacarInformacion("https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Jos%C3%A9"));

        System.out.println("hOLA");

        launch(args);

    }
}
