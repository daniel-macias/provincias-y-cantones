package principal;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LectorJSOUP {

    public static String sacarInformacion(String link){
        String aRetornar = "";
        try {
            Document doc = Jsoup.connect(link).userAgent("Mozilla/17.0").get();

            Elements info = doc.select("div.mw-parser-output");
            for(Element cuerpo : info){
                aRetornar += cuerpo.getElementsByTag("p").text();
            }

            for(Element cuerpo : info){
                aRetornar += cuerpo.getElementsByTag("table").size();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return aRetornar;

    }
}
