package jesus.example.org.caminosdesantiagojesus;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by JesúsRuiver on 11/04/2018.
 */

public class CaminoDeSantiagoBD extends SQLiteOpenHelper implements MetodosBaseDatos{

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "CaminoDeSantiago.db";

    public CaminoDeSantiagoBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {

        //Creamos las dos tablas

        db.execSQL(EstructuraBaseDatos.SQL_CREATE_MUNICIPIOS);
        db.execSQL(EstructuraBaseDatos.SQL_CREATE_ALBERGUES);

        //Insertamos los municipio
        db.execSQL("INSERT INTO municipio VALUES (null, 'Najera', 26300, 'Antigua capital del Reino de Nájera')");
        db.execSQL("INSERT INTO municipio VALUES (null, 'Logroño',120000, 'Capital de La Rioja')");

        //Insertamos los albergues
        db.execSQL("INSERT INTO albergue VALUES (null, 'Hostal Pepito','Albergue juvenil o albergue de juventud es un cuerno de establecimiento hostelero, or" +
                        "ientado a los jovenes, con precios económicos y el objetivo de promocionar o alentaractividades de intercambio cultural entre promociones de " +
                        "distintos paises. En la mayoriade las ciudades del mundo, principalmente capitales',10,3,23.3,0)");

        db.execSQL("INSERT INTO albergue VALUES (null,'Hostal Pepito 2','Hola Caracola',13,3,13.3,0)");

        db.execSQL("INSERT INTO albergue VALUES (null,'Hostal Pepito 3','ajldhajfh ñaljkfñla',3,3,,3.3,0)");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(EstructuraBaseDatos.SQL_DELETE_MUNICIPIOS);
        db.execSQL(EstructuraBaseDatos.SQL_DELETE_ALBERGUES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    @Override
    public void crearMunicipio() {

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
    public void cargarMunicipio() {

    }

    @Override
    public void cargarAlbergue() {

    }

    @Override
    public void cargarMonumento() {

    }

    @Override
    public void valoracionAlbergue() {

    }
}
