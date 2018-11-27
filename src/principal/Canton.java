package principal;

public class Canton {
    private String nombre;
    private String link;
    private String escudo;
    private String ubicacion;

    public Canton(String nombre, String link){
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getLink() {
        return link;
    }

    public String getEscudo() {
        return escudo;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
