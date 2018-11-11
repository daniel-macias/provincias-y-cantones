package principal;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Collections;
public class Provincia implements Comparator<Canton> {
    private String nombre;
    private Canton cabecera;
    private ArrayList<Canton> listaDeCantones;
    private int poblacion;
    private int area;

    public int compare(Canton o1, Canton o2){
        return o1.getNombre().compareTo(o2.getNombre());
    }

    public int compare2(Canton o1, Canton o2){
        return o2.getNombre().compareTo(o1.getNombre());
    }

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

    public void Ascendingsort(){
        Collections.sort(this.listaDeCantones,this::compare);
    }

    public void Descendingsort(){
        Collections.sort(this.listaDeCantones,this::compare2);
    }


    public ArrayList<Canton> getListaDeCantones() {
        return listaDeCantones;
    }

    public void setListaDeCantones(ArrayList<Canton> listaDeCantones) {
        this.listaDeCantones = listaDeCantones;
    }
}
