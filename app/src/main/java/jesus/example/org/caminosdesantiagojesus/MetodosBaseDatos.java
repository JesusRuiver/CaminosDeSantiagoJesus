package jesus.example.org.caminosdesantiagojesus;

/**
 * Created by JesúsRuiver on 25/04/2018.
 */

public interface MetodosBaseDatos {

    void crearMunicipio();
    void crearAlbergue();
    void crearMonumento();

    void modificaDatosMunicipio();
    void modificaDatosAlbergue();
    void modificaDatosMonumento();

    void borrarMunicipio();
    void borrarAlbergue();
    void borrarMonumento();

    void cargarMunicipio();
    void cargarAlbergue();
    void cargarMonumento();

    void valoracionAlbergue();


}
