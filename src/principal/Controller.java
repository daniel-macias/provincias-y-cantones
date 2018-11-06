package principal;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView mapaPrincipal;

    @FXML
    private ImageView escudoCostaRica;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mapaPrincipal.setImage(new Image("mapa-provincias-costarica.png"));

        escudoCostaRica.setImage(new Image("439px-Coat_of_arms_of_Costa_Rica.svg.png"));
    }
}
