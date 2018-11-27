package principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
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


        for(Node elem : currentPanel.getChildren()) {
            if (elem.getAccessibleText() != null) {
                elem.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                    System.out.println(elem.getAccessibleText());
                    if(elem.getAccessibleText().equals("San José")){
                        cambiarEscenaA("MapaSanJose.fxml");
                    }else if(elem.getAccessibleText().equals("Alajuela")){
                        cambiarEscenaA("MapaAlajuela.fxml");
                    }else if(elem.getAccessibleText().equals("Cartago")){
                        cambiarEscenaA("MapaCartago.fxml");
                    }else if(elem.getAccessibleText().equals("Heredia")){
                        cambiarEscenaA("MapaHeredia.fxml");
                    }else if(elem.getAccessibleText().equals("Guanacaste")){
                        cambiarEscenaA("MapaGuanacaste.fxml");
                    }else if(elem.getAccessibleText().equals("Puntarenas")){
                        cambiarEscenaA("MapaPuntarenas.fxml");
                    }else if(elem.getAccessibleText().equals("Limón")){
                        cambiarEscenaA("MapaLimon.fxml");
                    }
                });
            }

        }

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

    void cambiarEscenaA(String s){
        try {
            Parent sigScn = (AnchorPane) FXMLLoader.load(getClass().getResource(s));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) currentPanel.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }
    }

}
