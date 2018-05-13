package jesus.example.org.caminosdesantiagojesus;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by JesúsRuiver on 25/04/2018.
 */

public interface MetodosBaseDatos {

    void crearMunicipio(SQLiteDatabase db);
    void crearAlbergue();
    void crearMonumento();

    void modificaDatosMunicipio();
    void modificaDatosAlbergue();
    void modificaDatosMonumento();

    void borrarMunicipio();
    void borrarAlbergue();
    void borrarMonumento();

    void cargarMunicipio(SQLiteDatabase db);
    void cargarAlbergue(SQLiteDatabase db);
    void cargarMonumento();

    void valoracionAlbergue();

    void cerrarConexion(SQLiteDatabase db);


}
