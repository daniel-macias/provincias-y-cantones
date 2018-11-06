package principal;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ContBuscarCanton {

    @FXML
    private AnchorPane currentPanel;

    @FXML
    private ImageView escudoCostaRica;

    @FXML
    private JFXTextField cantonABuscar;

    @FXML
    private Text info;

    @FXML
    void buscar(ActionEvent event) {

    }

    @FXML
    void mostrarBuscarCanton(ActionEvent event) {
        System.out.println("Ya está en esta página");
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
        try {
            Parent sigScn = (GridPane) FXMLLoader.load(getClass().getResource("sample.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) currentPanel.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }
    }

}
