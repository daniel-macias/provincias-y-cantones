package principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContMapaGuanacaste implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for(Node elem : panel.getChildren()) {
            if (elem.getAccessibleText() != null) {
                elem.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                    System.out.println(elem.getAccessibleText());
                    for(Canton c : Main.Provincias.get(2).getListaDeCantones()){
                        if(c.getNombre().equals(elem.getAccessibleText())){
                            System.out.println(c.getNombre() + " Encontrado");
                            Main.cantonAMostrar = c;
                            cargarDetallesCanton();
                        }
                    }
                });
            }
        }
    }

    private void cargarDetallesCanton(){  //Acepta el id de escena a cual quiere cambiar
        try {
            Parent sigScn = (AnchorPane) FXMLLoader.load(getClass().getResource("InformacionCanton.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) panel.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }
    }

    @FXML
    private AnchorPane panel;

    @FXML
    void regresarAMenu(ActionEvent event) {
        try {
            Parent sigScn = (GridPane) FXMLLoader.load(getClass().getResource("sample.fxml"));

            Scene newScene = new Scene(sigScn);

            Stage curStage = (Stage) panel.getScene().getWindow();

            curStage.setScene(newScene);
        }catch (IOException ex){
            System.out.println("Error al cargar la otras escena");
            System.out.println(ex.getCause());
        }
    }
}
