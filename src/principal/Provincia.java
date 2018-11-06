package principal;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private Canton cabecera;
    private ArrayList<Canton> listaDeCantones;

    public Provincia(String nombre){
        this.nombre = nombre;
        listaDeCantones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Canton getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cantonABuscar) { //Cabecera ya debe existir para poder ponerse aquí
        for(Canton cnt : listaDeCantones){
            if(cantonABuscar.equals(cnt.getNombre())){
                this.cabecera = cnt;
                break;
            }
        }
    }

    public ArrayList<Canton> getListaDeCantones() {
        return listaDeCantones;
    }

    public void setListaDeCantones(ArrayList<Canton> listaDeCantones) {
        this.listaDeCantones = listaDeCantones;
    }
}
