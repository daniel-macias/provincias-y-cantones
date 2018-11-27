package principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContInformacionCanton implements Initializable {

    @FXML
    private AnchorPane panel;

    @FXML
    private Text nombreCanton;

    @FXML
    private TextArea informacion;

    @FXML
    private ImageView escudo;

    @FXML
    private ImageView ubicacion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        informacion.setText(LectorJSOUP.sacarInformacion(Main.cantonAMostrar.getLink()));
        nombreCanton.setText(Main.cantonAMostrar.getNombre());
        if(!Main.cantonAMostrar.getEscudo().equals("---")|| !Main.cantonAMostrar.getEscudo().equals("")){
            try{
                escudo.setImage(new Image(Main.cantonAMostrar.getEscudo()));
            }catch (Exception e){
                System.out.println("No hay imagen");
            }

        }

        if(!Main.cantonAMostrar.getUbicacion().equals("---")|| !Main.cantonAMostrar.getUbicacion().equals("")){
            ubicacion.setImage(new Image(Main.cantonAMostrar.getUbicacion()));
        }


    }

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
