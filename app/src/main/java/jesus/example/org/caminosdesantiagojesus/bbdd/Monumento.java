package jesus.example.org.caminosdesantiagojesus.bbdd;

public class Monumento {

    private int idMonumento;
    private String nombreMonumento;
    private String descripcionMonumeto;
    private int idMunicipio;

    public Monumento() {
    }

    public Monumento(int idMonumento, String nombreMonumento, String descripcionMonumeto, int idMunicipio) {
        this.idMonumento = idMonumento;
        this.nombreMonumento = nombreMonumento;
        this.descripcionMonumeto = descripcionMonumeto;
        this.idMunicipio = idMunicipio;
    }

    public int getIdMonumento() {
        return idMonumento;
    }

    public void setIdMonumento(int idMonumento) {
        this.idMonumento = idMonumento;
    }

    public String getNombreMonumento() {
        return nombreMonumento;
    }

    public void setNombreMonumento(String nombreMonumento) {
        this.nombreMonumento = nombreMonumento;
    }

    public String getDescripcionMonumeto() {
        return descripcionMonumeto;
    }

    public void setDescripcionMonumeto(String descripcionMonumeto) {
        this.descripcionMonumeto = descripcionMonumeto;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
}
