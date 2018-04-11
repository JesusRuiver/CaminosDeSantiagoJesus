package jesus.example.org.caminosdesantiagojesus;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by JesúsRuiver on 11/04/2018.
 */

public class BaseDatosHelper extends SQLiteOpenHelper{

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "CaminoDeSantiago.db";

    public BaseDatosHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraBaseDatos.SQL_CREATE_MUNICIPIOS);
        db.execSQL(EstructuraBaseDatos.SQL_CREATE_ALBERGUES);

        db.execSQL("INSERT INTO municipio VALUES (null, " + "'Najera', " + " 3000 " + "'Antigua Capital del Reino de Nájera'");
        db.execSQL("INSERT INTO municipio VALUES (null, " + "'Logroño', " + " 120000 " + "'Capital de La Rioja'");

        db.execSQL("INSERT INTO albergue VALUES (null, " + "'Hostal Pepito', " + "'Albergue juvenil o albergue de juventud es un cuerno de establecimiento hostelero, orientado a los jovenes, con precios económicos y el objetivo de promocionar o alentaractividades de intercambio cultural entre promociones de distintos paises. En la mayoriade las ciudades del mundo, principalmente capitales'"
                + " 10 " + " 3 " + " 23.3 " + " 0 ");
        db.execSQL("INSERT INTO albergue VALUES (null, " + "'Hostal Pepito 2', " + "'Hola Caracola'"
                + " 13 " + " 3 " + " 13.3 " + " 0 ");
        db.execSQL("INSERT INTO albergue VALUES (null, " + "'Hostal Pepito 3', " + "'ajldhajfh ñaljkfñla'"
                + " 3 " + " 3 " + " 3.3 " + " 0 ");
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
}
