package principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ContListaProvincias {

    @FXML
    private AnchorPane currentPanel;

    @FXML
    private ImageView escudoCostaRica;

    @FXML
    private TableView<?> tablaProvincias;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableColumn<?, ?> colCabecera;

    @FXML
    private TableColumn<?, ?> colPoblacion;

    @FXML
    private TableColumn<?, ?> colArea;

    @FXML
    private TableColumn<?, ?> colGentilicio;

    @FXML
    private TableColumn<?, ?> colNumCantones;

    @FXML
    private TableColumn<?, ?> colNumDistritos;

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
        System.out.println("Ya está en esta página");

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
