package jesus.example.org.caminosdesantiagojesus.bbdd;

import java.util.ArrayList;

/**
 * Created by JesúsRuiver on 25/04/2018.
 */

public class Municipio {

    private int idMunicipio;
    private String nombre;
    private int habitantes;
    private String descripcionMunicipio;

    private ArrayList<Albergue> albergues;
    private ArrayList<Monumento> monumentos;

    public Municipio(){

    }

    public Municipio(int idMunicipio, String nombre, int habitantes, String descripcionMunicipio) {
        this.idMunicipio = idMunicipio;
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.descripcionMunicipio = descripcionMunicipio;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getDescripcionMunicipio() {
        return descripcionMunicipio;
    }

    public void setDescripcionMunicipio(String descripcionMunicipio) {
        this.descripcionMunicipio = descripcionMunicipio;
    }
}
