package principal;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LectorJSOUP {

    public static void sacarInformacion(){
        try {
            Document doc = Jsoup.connect("https://es.wikipedia.org/wiki/Anexo:Cantones_de_Costa_Rica").userAgent("Mozilla/17.0").get();

            Elements tabla = doc.select("table.sortable wikitable jquery-tablesorter");
            System.out.println(tabla.isEmpty());
            for(Element cuerpo : tabla){
                Elements unicoCuerpo = cuerpo.select("tbody");
                for(Element fila : unicoCuerpo){
                    Elements filas = unicoCuerpo.select("tr");
                    for(Element row : filas){
                        Elements rows = filas.select("td");
                        for(Element aImprimir : rows){
                            System.out.println(aImprimir.text());

                        }
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
