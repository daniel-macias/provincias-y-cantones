package principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicArrowButton;
import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.Collections;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Organización territorial de Costa Rica");
        primaryStage.setScene(new Scene(root, 1088, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        ArrayList<Provincia> Provincias=new ArrayList<Provincia>();
        //Cantones de Limon
        ArrayList <Canton> LimonList=new ArrayList<Canton>();
        Canton Guacimo=new Canton("Guacimo", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Gu%C3%A1cimo");
        Canton CLimon=new Canton("Limon", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Lim%C3%B3n");
        Canton Matina=new Canton("Matina", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Matina");
        Canton Pococi=new Canton("Pococi", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Pococ%C3%AD");
        Canton Siquirres=new Canton("Siquirres", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Siquirres");
        Canton Talamanca=new Canton("Talamanca","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Talamanca");
        LimonList.add(Guacimo);
        LimonList.add(CLimon);
        LimonList.add(Matina);
        LimonList.add(Pococi);
        LimonList.add(Siquirres);
        LimonList.add(Talamanca);
        Provincia Limon=new Provincia("Limon");
        Limon.setListaDeCantones(LimonList);

        //Cantones de Puntarenas
        ArrayList<Canton> PuntarenasList=new ArrayList<Canton>();
        Canton BuenosAires=new Canton("Buenos Aires","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Buenos_Aires");
        Canton Corredores=new Canton("Corredores","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Corredores");
        Canton CotoBrus=new Canton("Coto Brus","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Coto_Brus");
        Canton Esparza=new Canton("Esparza","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Esparza");
        Canton Garabito=new Canton("Garabito", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Garabito");
        Canton Golfito=new Canton("Golfito", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Golfito");
        Canton MontesOro=new Canton("Montes de Oro", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Montes_de_Oro");
        Canton Osa=new Canton("Osa","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Osa");
        Canton Parrita= new Canton("Parrita","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Parrita");
        Canton CPuntarenas= new Canton("Puntarenas", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Puntarenas");
        Canton Quepos= new Canton("Quepos","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Quepos");
        PuntarenasList.add(BuenosAires);
        PuntarenasList.add(Corredores);
        PuntarenasList.add(CotoBrus);
        PuntarenasList.add(Esparza);
        PuntarenasList.add(Garabito);
        PuntarenasList.add(Golfito);
        PuntarenasList.add(MontesOro);
        PuntarenasList.add(Osa);
        PuntarenasList.add(Parrita);
        PuntarenasList.add(CPuntarenas);
        PuntarenasList.add(Quepos);
        Provincia Puntarenas=new Provincia("Puntarenas");
        Puntarenas.setListaDeCantones(PuntarenasList);

        //Cantones de Guanacaste
        ArrayList<Canton> GuanacasteList=new ArrayList<Canton>();
        Canton Abangares=new Canton("Abangares","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Abangares");
        Canton Bagaces=new Canton("Bagaces","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Bagaces");
        Canton Canias=new Canton("Cañas","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Ca%C3%B1as");
        Canton Carrillo=new Canton("Carrillo", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Carrillo");
        Canton Nicoya=new Canton("Nicoya", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Nicoya");
        Canton Hojancha=new Canton("Hojancha","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Hojancha");
        Canton LaCruz=new Canton("La Cruz", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_La_Cruz");
        Canton Liberia=new Canton("Liberia","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Liberia");
        Canton Nandayure=new Canton("Nandayure","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Nandayure");
        Canton SantaCruz=new Canton("Santa Cruz","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Santa_Cruz_(Costa_Rica)");
        Canton Tilaran=new Canton("Tilarán","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Tilar%C3%A1n");
        GuanacasteList.add(Abangares);
        GuanacasteList.add(Bagaces);
        GuanacasteList.add(Canias);
        GuanacasteList.add(Carrillo);
        GuanacasteList.add(Nicoya);
        GuanacasteList.add(Hojancha);
        GuanacasteList.add(LaCruz);
        GuanacasteList.add(Liberia);
        GuanacasteList.add(Nandayure);
        GuanacasteList.add(SantaCruz);
        GuanacasteList.add(Tilaran);
        Provincia Guanacaste=new Provincia("Guanacaste");
        Guanacaste.setListaDeCantones(GuanacasteList);

        //Cantones de Heredia
        ArrayList<Canton> HerediaList=new ArrayList<Canton>();
        Canton Barva=new Canton("Barva","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Barva");
        Canton Belen=new Canton("Belén","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Bel%C3%A9n");
        Canton Flores=new Canton("Flores","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Flores");
        Canton CHeredia=new Canton("Heredia","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Heredia");
        Canton SanIsidro=new Canton("San Isidro","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Isidro");
        Canton SanPablo=new Canton("San Pablo","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Pablo_(Costa_Rica)");
        Canton SanRafael=new Canton("San Rafael","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Rafael");
        Canton SantaBarbara=new Canton("Santa Bárbara","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Santa_B%C3%A1rbara");
        Canton SantoDomingo=new Canton("Santo Domingo","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Santo_Domingo_(Costa_Rica)");
        Canton Sarapiqui=new Canton("Sarapiquí","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Sarapiqu%C3%AD");
        HerediaList.add(Barva);
        HerediaList.add(Belen);
        HerediaList.add(Flores);
        HerediaList.add(CHeredia);
        HerediaList.add(SanIsidro);
        HerediaList.add(SanPablo);
        HerediaList.add(SanRafael);
        HerediaList.add(SantaBarbara);
        HerediaList.add(SantoDomingo);
        HerediaList.add(Sarapiqui);
        Provincia Heredia=new Provincia("Heredia");
        Heredia.setListaDeCantones(HerediaList);

        //Cantones de Cartago
        ArrayList<Canton> CartagoList=new ArrayList<Canton>();
        Canton Alvarado=new Canton("Alvarado","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Alvarado");
        Canton CCartago=new Canton("Cartago","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Cartago");
        Canton ElGuarco=new Canton("El Guarco","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_El_Guarco");
        Canton Jimenez=new Canton("Jiménez","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Jim%C3%A9nez");
        Canton LaUnion=new Canton("La Unión","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_La_Uni%C3%B3n");
        Canton Oreamuno=new Canton("Oreamuno","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Oreamuno");
        Canton Paraiso=new Canton("Paraíso","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Para%C3%ADso");
        Canton Turrialba=new Canton("Turrialba","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Turrialba");
        CartagoList.add(Alvarado);
        CartagoList.add(CCartago);
        CartagoList.add(ElGuarco);
        CartagoList.add(Jimenez);
        CartagoList.add(LaUnion);
        CartagoList.add(Oreamuno);
        CartagoList.add(Paraiso);
        CartagoList.add(Turrialba);
        Provincia Cartago=new Provincia("Cartago");
        Cartago.setListaDeCantones(CartagoList);

        //Cantones de Alajuela
        ArrayList<Canton> AlajuelaList=new ArrayList<Canton>();
        Canton CAlajuela=new Canton("Alajuela","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Alajuela");
        Canton Atenas=new Canton("Atenas","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Atenas");
        Canton Grecia=new Canton("Grecia","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Grecia");
        Canton Guatuso=new Canton("Guatuso","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Guatuso");
        Canton LosChiles=new Canton("Los Chiles","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Los_Chiles");
        Canton Naranjo=new Canton("Naranjo","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Naranjo");
        Canton Orotina=new Canton("Orotina","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Orotina");
        Canton Palmares=new Canton("Palmares","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Palmares");
        Canton Poas=new Canton("Poás","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Po%C3%A1s");
        Canton RioCuarto=new Canton("Río Cuarto","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_R%C3%ADo_Cuarto");
        Canton SanCarlos=new Canton("San Carlos","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Carlos");
        Canton SanMateo=new Canton("San Mateo","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Mateo");
        Canton SanRamon=new Canton("San Ramón","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Ram%C3%B3n");
        Canton Upala=new Canton("Upala","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Upala");
        Canton ValverdeVega=new Canton("Valverde Vega","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Valverde_Vega");
        Canton Zarcero=new Canton("Zarcero","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Zarcero");
        AlajuelaList.add(CAlajuela);
        AlajuelaList.add(Atenas);
        AlajuelaList.add(Grecia);
        AlajuelaList.add(Guatuso);
        AlajuelaList.add(LosChiles);
        AlajuelaList.add(Naranjo);
        AlajuelaList.add(Orotina);
        AlajuelaList.add(Palmares);
        AlajuelaList.add(Poas);
        AlajuelaList.add(RioCuarto);
        AlajuelaList.add(SanCarlos);
        AlajuelaList.add(SanMateo);
        AlajuelaList.add(SanRamon);
        AlajuelaList.add(Upala);
        AlajuelaList.add(ValverdeVega);
        AlajuelaList.add(Zarcero);
        Provincia Alajuela=new Provincia("Alajuela");
        Alajuela.setListaDeCantones(AlajuelaList);

        //Cantones de San Jose
        ArrayList<Canton> SanJoseList=new ArrayList<Canton>();
        Canton Acosta=new Canton("Acosta","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Acosta");
        Canton Alajuelita=new Canton("Alajuelita","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Alajuelita");
        Canton Aserri=new Canton("Aserrí","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Aserr%C3%AD");
        Canton Curridabat=new Canton("Curridabat","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Curridabat");
        Canton Desamparados=new Canton("Desamparados","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Desamparados");
        Canton Dota= new Canton("Dota","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Dota");
        Canton Escazu=new Canton("Escazú","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Escaz%C3%BA");
        Canton Goicoechea=new Canton("Goicoechea","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Goicoechea");
        Canton LeonCC=new Canton("León Cortés Castro","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Le%C3%B3n_Cort%C3%A9s_Castro");
        Canton MontesOca=new Canton("Montes de Oca","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Montes_de_Oca");
        Canton Mora=new Canton("Mora","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Mora");
        Canton Moravia= new Canton("Moravia","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Moravia");
        Canton PerezZ=new Canton("Pérez Zeledón","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_P%C3%A9rez_Zeled%C3%B3n");
        Canton Puriscal=new Canton("Puriscal","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Puriscal");
        Canton CSanJose= new Canton("San José","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Jos%C3%A9");
        Canton Tarrazu=new Canton("Tarrazú","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Tarraz%C3%BA");
        Canton Tibas=new Canton("Tibás","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Tib%C3%A1s");
        Canton Turrubares=new Canton("Turrubares","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Turrubares");
        Canton VasquezC=new Canton("Vásquez de Coronado","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_V%C3%A1squez_de_Coronado");
        SanJoseList.add(Acosta);
        SanJoseList.add(Alajuelita);
        SanJoseList.add(Aserri);
        SanJoseList.add(Curridabat);
        SanJoseList.add(Desamparados);
        SanJoseList.add(Dota);
        SanJoseList.add(Escazu);
        SanJoseList.add(Goicoechea);
        SanJoseList.add(LeonCC);
        SanJoseList.add(MontesOca);
        SanJoseList.add(Mora);
        SanJoseList.add(Moravia);
        SanJoseList.add(PerezZ);
        SanJoseList.add(Puriscal);
        SanJoseList.add(CSanJose);
        SanJoseList.add(Tarrazu);
        SanJoseList.add(Tibas);
        SanJoseList.add(Turrubares);
        SanJoseList.add(VasquezC);
        Provincia SanJose=new Provincia("San José");
        SanJose.setListaDeCantones(SanJoseList);

        //ArrayList de Provincias
        Provincias.add(Limon);
        Provincias.add(Puntarenas);
        Provincias.add(Guanacaste);
        Provincias.add(Heredia);
        Provincias.add(Cartago);
        Provincias.add(Alajuela);
        Provincias.add(SanJose);

        //Recorrido de las provincias
        for (Provincia i:Provincias) {
            i.Descendingsort();
        }

        for (Provincia i:Provincias) {
            ArrayList<Canton> probando=i.getListaDeCantones();
            for(Canton c:probando){
                System.out.println(c.getNombre());
            }
            System.out.println("");
        }

        System.out.println(LectorJSOUP.sacarInformacion("https://es.wikipedia.org/wiki/Cant%C3%B3n_de_San_Jos%C3%A9"));

        System.out.println("hOLA");

        launch(args);

    }
}
