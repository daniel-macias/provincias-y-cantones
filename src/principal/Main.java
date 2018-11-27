package principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static Canton cantonAMostrar;

    public static ArrayList<Provincia> Provincias=new ArrayList<Provincia>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Organización territorial de Costa Rica");
        primaryStage.setScene(new Scene(root, 1088, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {

        //Cantones de Limon
        ArrayList <Canton> LimonList=new ArrayList<Canton>();
        Canton Guacimo=new Canton("Guácimo", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Gu%C3%A1cimo");
        Guacimo.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Costa_Rica_-_Limon_-_Guacimo.svg/530px-Costa_Rica_-_Limon_-_Guacimo.svg.png");
        Guacimo.setEscudo("https://upload.wikimedia.org/wikipedia/commons/a/a4/Escudo_de_Guacimo-Limon.png");
        Canton CLimon=new Canton("Limon", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Lim%C3%B3n");
        CLimon.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Costa_Rica_-_Limon_-_Limon.svg/530px-Costa_Rica_-_Limon_-_Limon.svg.png");
        CLimon.setEscudo("https://upload.wikimedia.org/wikipedia/commons/d/d2/Escudo_de_Limon-Limon.png");
        Canton Matina=new Canton("Matina", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Matina");
        Matina.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Costa_Rica_-_Limon_-_Matina.svg/530px-Costa_Rica_-_Limon_-_Matina.svg.png");
        Matina.setEscudo("https://upload.wikimedia.org/wikipedia/commons/d/da/Escudo_de_Matina-Limon.png");
        Canton Pococi=new Canton("Pococi", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Pococ%C3%AD");
        Pococi.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Costa_Rica_-_Limon_-_Pococi.svg/530px-Costa_Rica_-_Limon_-_Pococi.svg.png");
        Pococi.setEscudo("https://upload.wikimedia.org/wikipedia/commons/e/e2/Escudo_de_Pococi-Limon.png");
        Canton Siquirres=new Canton("Siquirres", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Siquirres");
        Siquirres.setUbicacion(" https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Costa_Rica_-_Limon_-_Siquirres.svg/530px-Costa_Rica_-_Limon_-_Siquirres.svg.png");
        Siquirres.setEscudo("https://upload.wikimedia.org/wikipedia/commons/b/bb/Escudo_de_Siquirres-Limon.png");
        Canton Talamanca=new Canton("Talamanca","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Talamanca");
        Talamanca.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Costa_Rica_-_Limon_-_Talamanca.svg/530px-Costa_Rica_-_Limon_-_Talamanca.svg.png");
        Talamanca.setEscudo("https://upload.wikimedia.org/wikipedia/commons/9/92/Escudo_de_Talamanca-Limon.png");
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
        BuenosAires.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Costa_Rica_-_Puntarenas_-_Buenos_Aires.svg/732px-Costa_Rica_-_Puntarenas_-_Buenos_Aires.svg.png");
        BuenosAires.setEscudo("https://upload.wikimedia.org/wikipedia/commons/d/d7/Buenos.Aires.canton.png");
        Canton Corredores=new Canton("Corredores","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Corredores");
        Corredores.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Costa_Rica_-_Puntarenas_-_Corredores.svg/732px-Costa_Rica_-_Puntarenas_-_Corredores.svg.png");
        Corredores.setEscudo("https://upload.wikimedia.org/wikipedia/commons/c/c8/Corredores.canton.png");
        Canton CotoBrus=new Canton("Coto Brus","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Coto_Brus");
        CotoBrus.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Costa_Rica_-_Puntarenas_-_Coto_Brus.svg/732px-Costa_Rica_-_Puntarenas_-_Coto_Brus.svg.png");
        CotoBrus.setEscudo("https://upload.wikimedia.org/wikipedia/commons/8/84/Coto.Brus.canton.png");
        Canton Esparza=new Canton("Esparza","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Esparza");
        Esparza.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Costa_Rica_-_Puntarenas_-_Esparza.svg/732px-Costa_Rica_-_Puntarenas_-_Esparza.svg.png");
        Esparza.setEscudo("https://upload.wikimedia.org/wikipedia/commons/e/ea/Escudo-de-esparza.png");
        Canton Garabito=new Canton("Garabito", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Garabito");
        Garabito.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Costa_Rica_-_Puntarenas_-_Garabito.svg/732px-Costa_Rica_-_Puntarenas_-_Garabito.svg.png");
        Garabito.setEscudo("https://upload.wikimedia.org/wikipedia/commons/b/be/Garabito.canton.gif");
        Canton Golfito=new Canton("Golfito", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Golfito");
        Golfito.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Costa_Rica_-_Puntarenas_-_Golfito.svg/732px-Costa_Rica_-_Puntarenas_-_Golfito.svg.png");
        Golfito.setEscudo("https://upload.wikimedia.org/wikipedia/commons/a/a2/Golfito.canton.gif");
        Canton MontesOro=new Canton("Montes de Oro", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Montes_de_Oro");
        MontesOro.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Costa_Rica_-_Puntarenas_-_Montes_de_Oro.svg/732px-Costa_Rica_-_Puntarenas_-_Montes_de_Oro.svg.png");
        MontesOro.setEscudo("https://upload.wikimedia.org/wikipedia/commons/a/ab/EscudoMontesDeOro.jpg");
        Canton Osa=new Canton("Osa","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Osa");
        Osa.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Costa_Rica_-_Puntarenas_-_Osa.svg/732px-Costa_Rica_-_Puntarenas_-_Osa.svg.png");
        Osa.setEscudo("https://upload.wikimedia.org/wikipedia/commons/f/f1/Osa.canton.gif");
        Canton Parrita= new Canton("Parrita","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Parrita");
        Parrita.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Costa_Rica_-_Puntarenas_-_Parrita.svg/732px-Costa_Rica_-_Puntarenas_-_Parrita.svg.png");
        Parrita.setEscudo("https://upload.wikimedia.org/wikipedia/commons/e/e2/Parrita.canton.gif");
        Canton CPuntarenas= new Canton("Puntarenas", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Puntarenas");
        CPuntarenas.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Costa_Rica_-_Puntarenas_-_Puntarenas.svg/732px-Costa_Rica_-_Puntarenas_-_Puntarenas.svg.png");
        CPuntarenas.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Escudo_de_Puntarenas.svg/771px-Escudo_de_Puntarenas.svg.png");
        Canton Quepos= new Canton("Quepos","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Quepos");
        Quepos.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Costa_Rica_-_Puntarenas_-_Aguirre.svg/732px-Costa_Rica_-_Puntarenas_-_Aguirre.svg.png");
        Quepos.setEscudo("https://upload.wikimedia.org/wikipedia/commons/d/df/Aguirre.canton.png");
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
        Abangares.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Costa_Rica_-_Guanacaste_-_Abangares.svg/464px-Costa_Rica_-_Guanacaste_-_Abangares.svg.png");
        Abangares.setEscudo("https://upload.wikimedia.org/wikipedia/commons/4/4c/Abangares.canton.png");
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
        Bagaces.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Costa_Rica_-_Guanacaste_-_Bagaces.svg/464px-Costa_Rica_-_Guanacaste_-_Bagaces.svg.png");
        Bagaces.setEscudo("---");
        Canias.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Costa_Rica_-_Guanacaste_-_Ca%C3%B1as.svg/464px-Costa_Rica_-_Guanacaste_-_Ca%C3%B1as.svg.png");
        Canias.setEscudo("https://upload.wikimedia.org/wikipedia/commons/3/32/Canas.canton.png");
        Carrillo.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Costa_Rica_-_Guanacaste_-_Carrillo.svg/464px-Costa_Rica_-_Guanacaste_-_Carrillo.svg.png");
        Carrillo.setEscudo("https://upload.wikimedia.org/wikipedia/commons/2/25/Carrillo.canton.png");
        Nicoya.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Costa_Rica_-_Guanacaste_-_Nicoya.svg/464px-Costa_Rica_-_Guanacaste_-_Nicoya.svg.png");
        Nicoya.setEscudo("https://upload.wikimedia.org/wikipedia/commons/b/bb/Nicoya.canton.gif");
        Hojancha.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Costa_Rica_-_Guanacaste_-_Hojancha.svg/464px-Costa_Rica_-_Guanacaste_-_Hojancha.svg.png");
        Hojancha.setEscudo("https://upload.wikimedia.org/wikipedia/commons/d/da/Hojancha.canton.gif");
        LaCruz.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Costa_Rica_-_Guanacaste_-_La_Cruz.svg/464px-Costa_Rica_-_Guanacaste_-_La_Cruz.svg.png");
        LaCruz.setEscudo("https://upload.wikimedia.org/wikipedia/commons/e/e5/La.Cruz.canton.gif");
        Liberia.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Costa_Rica_-_Guanacaste_-_Liberia.svg/464px-Costa_Rica_-_Guanacaste_-_Liberia.svg.png");
        Liberia.setEscudo("https://upload.wikimedia.org/wikipedia/commons/f/f9/Liberia.canton.gif");
        Nandayure.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Costa_Rica_-_Guanacaste_-_Nandayure.svg/464px-Costa_Rica_-_Guanacaste_-_Nandayure.svg.png");
        Nandayure.setEscudo("https://upload.wikimedia.org/wikipedia/commons/2/20/Nandayure.canton.gif");
        SantaCruz.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Costa_Rica_-_Guanacaste_-_Santa_Cruz.svg/464px-Costa_Rica_-_Guanacaste_-_Santa_Cruz.svg.png");
        SantaCruz.setEscudo("https://upload.wikimedia.org/wikipedia/commons/1/1a/Santa.Cruz.canton.gif");
        Tilaran.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Costa_Rica_-_Guanacaste_-_Tilaran.svg/464px-Costa_Rica_-_Guanacaste_-_Tilaran.svg.png");
        Tilaran.setEscudo("https://upload.wikimedia.org/wikipedia/commons/d/dd/Tilaran.canton.gif");
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
        Barva.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Costa_Rica_-_Heredia_-_Barva.svg/245px-Costa_Rica_-_Heredia_-_Barva.svg.png");
        Barva.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Escudo_de_Barva-Heredia.png/76px-Escudo_de_Barva-Heredia.png");
        Belen.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Costa_Rica_-_Heredia_-_Belen.svg/245px-Costa_Rica_-_Heredia_-_Belen.svg.png");
        Belen.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Escudo_de_Belen-Heredia.png/72px-Escudo_de_Belen-Heredia.png");
        Flores.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Costa_Rica_-_Heredia_-_Flores.svg/245px-Costa_Rica_-_Heredia_-_Flores.svg.png");
        Flores.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Escudo_de_Flores-Heredia.png/79px-Escudo_de_Flores-Heredia.png");
        CHeredia.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Costa_Rica_-_Heredia_-_Heredia.svg/245px-Costa_Rica_-_Heredia_-_Heredia.svg.png");
        CHeredia.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Escudo_de_Heredia.svg/67px-Escudo_de_Heredia.svg.png");
        SanIsidro.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Costa_Rica_-_Heredia_-_San_Isidro.svg/245px-Costa_Rica_-_Heredia_-_San_Isidro.svg.png");
        SanIsidro.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Escudo_de_San_Isidro-Heredia.png/74px-Escudo_de_San_Isidro-Heredia.png");
        SanPablo.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Costa_Rica_-_Heredia_-_San_Pablo.svg/245px-Costa_Rica_-_Heredia_-_San_Pablo.svg.png");
        SanPablo.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Escudo_de_San_Pablo-Heredia.png/70px-Escudo_de_San_Pablo-Heredia.png");
        SanRafael.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Costa_Rica_-_Heredia_-_San_Rafael.svg/245px-Costa_Rica_-_Heredia_-_San_Rafael.svg.png");
        SanRafael.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Escudo_de_San_Rafael-Heredia.png/75px-Escudo_de_San_Rafael-Heredia.png");
        SantaBarbara.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Costa_Rica_-_Heredia_-_Santa_Barbara.svg/245px-Costa_Rica_-_Heredia_-_Santa_Barbara.svg.png");
        SantaBarbara.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Escudo_de_Santa_Barbara-Heredia.png/83px-Escudo_de_Santa_Barbara-Heredia.png");
        SantoDomingo.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Costa_Rica_-_Heredia_-_Santo_Domingo.svg/245px-Costa_Rica_-_Heredia_-_Santo_Domingo.svg.png");
        SantoDomingo.setEscudo("---");
        Sarapiqui.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Costa_Rica_-_Heredia_-_Sarapiqui.svg/245px-Costa_Rica_-_Heredia_-_Sarapiqui.svg.png");
        Sarapiqui.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Escudo_del_Cant%C3%B3n_de_Sarapiqu%C3%AD.png/71px-Escudo_del_Cant%C3%B3n_de_Sarapiqu%C3%AD.png");
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
        Alvarado.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Costa_Rica_-_Cartago_-_Alvarado.svg/614px-Costa_Rica_-_Cartago_-_Alvarado.svg.png");
        Alvarado.setEscudo("https://upload.wikimedia.org/wikipedia/commons/e/e6/Alvaradoescudo.png");
        CCartago.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Costa_Rica_-_Cartago_-_Cartago.svg/614px-Costa_Rica_-_Cartago_-_Cartago.svg.png");
        CCartago.setEscudo("https://upload.wikimedia.org/wikipedia/commons/4/4a/Escudo_cartagin%C3%A9s.jpg");
        ElGuarco.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Costa_Rica_-_Cartago_-_El_Guarco.svg/614px-Costa_Rica_-_Cartago_-_El_Guarco.svg.png");
        ElGuarco.setEscudo("https://upload.wikimedia.org/wikipedia/commons/6/60/El.Guarco.canton.png");
        Jimenez.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Costa_Rica_-_Cartago_-_Jimenez.svg/614px-Costa_Rica_-_Cartago_-_Jimenez.svg.png");
        Jimenez.setEscudo("https://upload.wikimedia.org/wikipedia/commons/0/0d/Jimenez.canton.gif");
        LaUnion.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Costa_Rica_-_Cartago_-_La_Union.svg/250px-Costa_Rica_-_Cartago_-_La_Union.svg.png");
        LaUnion.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/UnionEscudo.png/75px-UnionEscudo.png");
        Oreamuno.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Costa_Rica_-_Cartago_-_Oreamuno.svg/250px-Costa_Rica_-_Cartago_-_Oreamuno.svg.png");
        Oreamuno.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Oreamuno.canton.gif/65px-Oreamuno.canton.gif");
        Paraiso.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Costa_Rica_-_Cartago_-_Paraiso.svg/250px-Costa_Rica_-_Cartago_-_Paraiso.svg.png");
        Paraiso.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Paraiso.canton.gif/81px-Paraiso.canton.gif");
        Turrialba.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Costa_Rica_-_Cartago_-_Turrialba.svg/250px-Costa_Rica_-_Cartago_-_Turrialba.svg.png");
        Turrialba.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Turrialba.canton.gif/72px-Turrialba.canton.gif");
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
        CAlajuela.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Costa_Rica_-_Alajuela_-_Alajuela.svg/250px-Costa_Rica_-_Alajuela_-_Alajuela.svg.png");
        CAlajuela.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Alajuela.canton.png/58px-Alajuela.canton.png");
        Atenas.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Costa_Rica_-_Alajuela_-_Atenas.svg/250px-Costa_Rica_-_Alajuela_-_Atenas.svg.png");
        Atenas.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Atenas.canton.png/55px-Atenas.canton.png");
        Grecia.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Costa_Rica_-_Alajuela_-_Grecia.svg/250px-Costa_Rica_-_Alajuela_-_Grecia.svg.png");
        Grecia.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Grecia.canton.gif/60px-Grecia.canton.gif");
        Guatuso.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Costa_Rica_-_Alajuela_-_Guatuso.svg/250px-Costa_Rica_-_Alajuela_-_Guatuso.svg.png ");
        Guatuso.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Guatuso.canton.GIF/66px-Guatuso.canton.GIF");
        LosChiles.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Costa_Rica_-_Alajuela_-_Los_Chiles.svg/250px-Costa_Rica_-_Alajuela_-_Los_Chiles.svg.png");
        LosChiles.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Los.Chiles.canton.gif/78px-Los.Chiles.canton.gif");
        Naranjo.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Costa_Rica_-_Alajuela_-_Naranjo.svg/250px-Costa_Rica_-_Alajuela_-_Naranjo.svg.png");
        Naranjo.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Naranjo.canton.gif/65px-Naranjo.canton.gif");
        Orotina.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Costa_Rica_-_Alajuela_-_Orotina.svg/250px-Costa_Rica_-_Alajuela_-_Orotina.svg.png");
        Orotina.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Orotina.canton.gif/82px-Orotina.canton.gif");
        Palmares.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Costa_Rica_-_Alajuela_-_Palmares.svg/250px-Costa_Rica_-_Alajuela_-_Palmares.svg.png");
        Palmares.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/A1_escudo_palmares.PNG/73px-A1_escudo_palmares.PNG");
        Poas.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Costa_Rica_-_Alajuela_-_Poas.svg/250px-Costa_Rica_-_Alajuela_-_Poas.svg.png");
        Poas.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Poas.canton.gif/68px-Poas.canton.gif");
        RioCuarto.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/Costa_Rica_Alajuela_location_map.svg/250px-Costa_Rica_Alajuela_location_map.svg.png");
        RioCuarto.setEscudo("---");
        SanCarlos.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/Costa_Rica_-_Alajuela_-_San_Carlos.svg/250px-Costa_Rica_-_Alajuela_-_San_Carlos.svg.png");
        SanCarlos.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/San.Carlos.canton.gif/70px-San.Carlos.canton.gif");
        SanMateo.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/Costa_Rica_-_Alajuela_-_San_Mateo.svg/250px-Costa_Rica_-_Alajuela_-_San_Mateo.svg.png");
        SanMateo.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/San.Mateo.canton.gif/64px-San.Mateo.canton.gif");
        SanRamon.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Costa_Rica_-_Alajuela_-_San_Ramon.svg/250px-Costa_Rica_-_Alajuela_-_San_Ramon.svg.png");
        SanRamon.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Escudo_del_Cant%C3%B3n_San_Ramon.jpg/58px-Escudo_del_Cant%C3%B3n_San_Ramon.jpg");
        Upala.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Costa_Rica_-_Alajuela_-_Upala.svg/250px-Costa_Rica_-_Alajuela_-_Upala.svg.png");
        Upala.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Escudo_Cantonal_Upala.jpg/68px-Escudo_Cantonal_Upala.jpg");
        ValverdeVega.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Costa_Rica_-_Alajuela_-_Valverde_Vega.svg/250px-Costa_Rica_-_Alajuela_-_Valverde_Vega.svg.png");
        ValverdeVega.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Valverde.Vega.canton.gif/79px-Valverde.Vega.canton.gif");
        Zarcero.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Costa_Rica_-_Alajuela_-_Zarcero.svg/250px-Costa_Rica_-_Alajuela_-_Zarcero.svg.png");
        Zarcero.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Zarcero-escudo.JPG/57px-Zarcero-escudo.JPG");
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
        Canton SantaAna= new Canton("Santa Ana", "https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Santa_Ana_(Costa_Rica)");
        Canton Tarrazu=new Canton("Tarrazú","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Tarraz%C3%BA");
        Canton Tibas=new Canton("Tibás","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Tib%C3%A1s");
        Canton Turrubares=new Canton("Turrubares","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_Turrubares");
        Canton VasquezC=new Canton("Vásquez de Coronado","https://es.wikipedia.org/wiki/Cant%C3%B3n_de_V%C3%A1squez_de_Coronado");
        Acosta.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Costa_Rica_-_San_Jose_-_Acosta.svg/250px-Costa_Rica_-_San_Jose_-_Acosta.svg.png");
        Acosta.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/San_Ignacio_de_Acosta._Costa_Rica.jpg/250px-San_Ignacio_de_Acosta._Costa_Rica.jpg");
        Alajuelita.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Costa_Rica_-_San_Jose_-_Alajuelita.svg/250px-Costa_Rica_-_San_Jose_-_Alajuelita.svg.png");
        Alajuelita.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/EscudoAlajuelita.gif/76px-EscudoAlajuelita.gif");
        Aserri.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Costa_Rica_-_San_Jose_-_Aserri.svg/250px-Costa_Rica_-_San_Jose_-_Aserri.svg.png");
        Aserri.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Aserri.canton.png/72px-Aserri.canton.png");
        Curridabat.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Costa_Rica_-_San_Jose_-_Curridabat.svg/250px-Costa_Rica_-_San_Jose_-_Curridabat.svg.png");
        Curridabat.setEscudo("---");
        Desamparados.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Costa_Rica_-_San_Jose_-_Desamparados.svg/250px-Costa_Rica_-_San_Jose_-_Desamparados.svg.png");
        Desamparados.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/EscudoDesamparados.gif/69px-EscudoDesamparados.gif");
        Dota.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Costa_Rica_-_San_Jose_-_Dota.svg/250px-Costa_Rica_-_San_Jose_-_Dota.svg.png");
        Dota.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Escudo_Canton_de_Dota.png/74px-Escudo_Canton_de_Dota.png");
        Escazu.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Costa_Rica_-_San_Jose_-_Escazu.svg/250px-Costa_Rica_-_San_Jose_-_Escazu.svg.png");
        Escazu.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Escazu.canton.gif/74px-Escazu.canton.gif");
        Goicoechea.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Costa_Rica_-_San_Jose_-_Goicoechea.svg/250px-Costa_Rica_-_San_Jose_-_Goicoechea.svg.png");
        Goicoechea.setEscudo("---");
        LeonCC.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Costa_Rica_-_San_Jose_-_Leon_Cortes_Castro.svg/250px-Costa_Rica_-_San_Jose_-_Leon_Cortes_Castro.svg.png");
        LeonCC.setEscudo("---");
        MontesOca.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Costa_Rica_-_San_Jose_-_Montes_de_Oca.svg/250px-Costa_Rica_-_San_Jose_-_Montes_de_Oca.svg.png");
        MontesOca.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/EscudoMdO.jpg/88px-EscudoMdO.jpg");
        Mora.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Costa_Rica_-_San_Jose_-_Mora.svg/250px-Costa_Rica_-_San_Jose_-_Mora.svg.png");
        Mora.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Escudo_cant%C3%B3n_de_Mora.png/77px-Escudo_cant%C3%B3n_de_Mora.png");
        Moravia.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Costa_Rica_-_San_Jose_-_Moravia.svg/250px-Costa_Rica_-_San_Jose_-_Moravia.svg.png");
        Moravia.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/EscudoMoravia.gif/75px-EscudoMoravia.gif");
        PerezZ.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Costa_Rica_-_San_Jose_-_Perez_Zeledon.svg/245px-Costa_Rica_-_San_Jose_-_Perez_Zeledon.svg.png");
        PerezZ.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Perez.Zeledon.canton.gif/68px-Perez.Zeledon.canton.gif");
        Puriscal.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Costa_Rica_-_San_Jose_-_Puriscal.svg/250px-Costa_Rica_-_San_Jose_-_Puriscal.svg.png");
        Puriscal.setEscudo("---");
        CSanJose.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Costa_Rica_-_San_Jose_-_San_Jose.svg/250px-Costa_Rica_-_San_Jose_-_San_Jose.svg.png");
        CSanJose.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Blason_de_San_Jos%C3%A9_%28Costa_Rica%29.svg/69px-Blason_de_San_Jos%C3%A9_%28Costa_Rica%29.svg.png");
        SantaAna.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Escudo_de_Santa_Ana.png/88px-Escudo_de_Santa_Ana.png");
        SantaAna.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Costa_Rica_-_San_Jose_-_Santa_Ana.svg/250px-Costa_Rica_-_San_Jose_-_Santa_Ana.svg.png");
        Tarrazu.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Costa_Rica_-_San_Jose_-_Tarrazu.svg/250px-Costa_Rica_-_San_Jose_-_Tarrazu.svg.png");
        Tarrazu.setEscudo("---");
        Tibas.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Costa_Rica_-_San_Jose_-_Tibas.svg/250px-Costa_Rica_-_San_Jose_-_Tibas.svg.png");
        Tibas.setEscudo("---");
        Turrubares.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/EscudodeTibas.gif/77px-EscudodeTibas.gif");
        Turrubares.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Costa_Rica_-_San_Jose_-_Turrubares.svg/250px-Costa_Rica_-_San_Jose_-_Turrubares.svg.png");
        VasquezC.setUbicacion("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Costa_Rica_-_San_Jose_-_Vasquez_de_Coronado.svg/250px-Costa_Rica_-_San_Jose_-_Vasquez_de_Coronado.svg.png");
        VasquezC.setEscudo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Escudo_del_Canton_V%C3%A1zquez_de_Coronado_2.jpg/56px-Escudo_del_Canton_V%C3%A1zquez_de_Coronado_2.jpg");
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
        SanJoseList.add(SantaAna);
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
