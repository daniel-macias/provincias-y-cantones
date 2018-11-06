package principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private AnchorPane currentPanel;

    @FXML
    private ImageView mapaPrincipal;

    @FXML
    private ImageView escudoCostaRica;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    void mostrarBuscarCanton(ActionEvent event) {
        try {
            Parent sigScn = (AnchorPane) FXMLLoader.load(getClass().getResource("BuscarCanton.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) currentPanel.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }

    }

    @FXML
    void mostrarInformacion(ActionEvent event) {
        try {
            Parent sigScn = (AnchorPane) FXMLLoader.load(getClass().getResource("Informacion.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) currentPanel.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }
    }

    @FXML
    void mostrarListaCantones(ActionEvent event) {
        try {
            Parent sigScn = (AnchorPane) FXMLLoader.load(getClass().getResource("ListaCantones.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) currentPanel.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }

    }

    @FXML
    void mostrarListaProvincias(ActionEvent event) {
        try {
            Parent sigScn = (AnchorPane) FXMLLoader.load(getClass().getResource("ListaProvincias.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) currentPanel.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }

    }

    @FXML
    void mostrarMapaPrincipal(ActionEvent event) {
        System.out.println("Ya está en esta página");
    }

}
