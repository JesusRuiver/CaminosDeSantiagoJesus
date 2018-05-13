package jesus.example.org.caminosdesantiagojesus.conexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

import jesus.example.org.caminosdesantiagojesus.MetodosBaseDatos;

/**
 * Created by JesúsRuiver on 11/04/2018.
 */

public class ConexionCaminoSantiagoSQLiteHelper extends SQLiteOpenHelper implements MetodosBaseDatos {

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "CaminoDeSantiago.db";

    public ConexionCaminoSantiagoSQLiteHelper(Context context, String nomDb, Object o, int i) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public void onCreate(SQLiteDatabase db) {

        //Creamos las dos tablas
        db.execSQL(EstructuraBaseDatos.SQL_CREATE_MUNICIPIOS);
        db.execSQL(EstructuraBaseDatos.SQL_CREATE_ALBERGUES);
        db.execSQL(EstructuraBaseDatos.SQL_CREATE_MONUMENTOS);
    }

    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int nuevaVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraBaseDatos.SQL_DELETE_MUNICIPIOS);
        db.execSQL(EstructuraBaseDatos.SQL_DELETE_ALBERGUES);
        db.execSQL(EstructuraBaseDatos.SQL_DELETE_MONUMENTOS);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int versionAntigua, int nuevaVersion) {
        onUpgrade(db, versionAntigua, nuevaVersion);
    }

    @Override
    public void crearMunicipio(SQLiteDatabase db, String nombreMun, int numHabitantes, String descripcion) {
        db.execSQL("INSERT INTO municipio VALUES " + "(" + null + "," + "'" + nombreMun + "'" + "," + numHabitantes + "," + "'" + descripcion + "'" + ")");

    }

    @Override
    public void crearAlbergue() {

    }

    @Override
    public void crearMonumento() {

    }

    @Override
    public void modificaDatosMunicipio() {

    }

    @Override
    public void modificaDatosAlbergue() {

    }

    @Override
    public void modificaDatosMonumento() {

    }

    @Override
    public void borrarMunicipio() {

    }

    @Override
    public void borrarAlbergue() {

    }

    @Override
    public void borrarMonumento() {

    }

    @Override
    public void cargarMunicipio(SQLiteDatabase db) {

        db.execSQL("INSERT INTO municipio VALUES (null, 'Najera', 26300, 'Antigua capital del Reino de Nájera')");
        db.execSQL("INSERT INTO municipio VALUES (null, 'Logroño',120000, 'Capital de La Rioja')");


    }

    @Override
    public void cargarAlbergue(SQLiteDatabase db) {

        db.execSQL("INSERT INTO albergue VALUES (null, 'Hostal Pepito','Albergue juvenil o albergue de juventud es un cuerno de establecimiento hostelero, or" +
                "ientado a los jovenes, con precios económicos y el objetivo de promocionar o alentaractividades de intercambio cultural entre promociones de " +
                "distintos paises. En la mayoriade las ciudades del mundo, principalmente capitales',10,3,23.3,0)");

        db.execSQL("INSERT INTO albergue VALUES (null,'Hostal Pepito 2','Hola Caracola',13,3,13.3,0)");

        db.execSQL("INSERT INTO albergue VALUES (null,'Hostal Pepito 3','ajldhajfh ñaljkfñla',3,3,3.3,0)");
    }

    @Override
    public void cargarMonumento() {

    }

    @Override
    public void valoracionAlbergue() {

    }

    @Override
    public void cerrarConexion(SQLiteDatabase db) {
        db.close();
    }
}
