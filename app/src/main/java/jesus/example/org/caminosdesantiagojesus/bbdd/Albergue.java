package jesus.example.org.caminosdesantiagojesus.bbdd;

/**
 * Created by JesúsRuiver on 25/04/2018.
 */

public class Albergue {

    private int idAlbergue;
    private String nombreAlbergue;
    private String descripcionAlbergue;
    private int valoracionAlbergue;
    private int votos;
    private double precio;
    private int idMunicipio;

    public Albergue(){

    }

    public Albergue(int idAlbergue, String nombreAlbergue, String descripcionAlbergue, int valoracionAlbergue, int votos, double precio, int idMunicipio) {
        this.idAlbergue = idAlbergue;
        this.nombreAlbergue = nombreAlbergue;
        this.descripcionAlbergue = descripcionAlbergue;
        this.valoracionAlbergue = valoracionAlbergue;
        this.votos = votos;
        this.precio = precio;
        this.idMunicipio = idMunicipio;
    }

    public int getIdAlbergue() {
        return idAlbergue;
    }

    public void setIdAlbergue(int idAlbergue) {
        this.idAlbergue = idAlbergue;
    }

    public String getNombreAlbergue() {
        return nombreAlbergue;
    }

    public void setNombreAlbergue(String nombreAlbergue) {
        this.nombreAlbergue = nombreAlbergue;
    }

    public String getDescripcionAlbergue() {
        return descripcionAlbergue;
    }

    public void setDescripcionAlbergue(String descripcionAlbergue) {
        this.descripcionAlbergue = descripcionAlbergue;
    }

    public int getValoracionAlbergue() {
        return valoracionAlbergue;
    }

    public void setValoracionAlbergue(int valoracionAlbergue) {
        this.valoracionAlbergue = valoracionAlbergue;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
}
