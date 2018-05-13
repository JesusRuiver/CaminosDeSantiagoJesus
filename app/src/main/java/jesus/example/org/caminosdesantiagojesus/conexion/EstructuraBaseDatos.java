package jesus.example.org.caminosdesantiagojesus.conexion;

/**
 * Created by JesúsRuiver on 11/04/2018.
 */

public class EstructuraBaseDatos {

    private EstructuraBaseDatos() {
    }

    /* Definimos los contenidos de las tablas */

    public static final String TABLE_MUNICIPIO = "municipio";
    public static final String COLUMN_ID_MUNICIPIO = "ID";
    public static final String COLUMN_NOMBRE_MUNICIPIO = "NOMBRE";
    public static final String COLUMN_HABITANTES = "HABITANTES";
    public static final String COLUMN_DESCRIPCION_MUNICIPIO = "DESCRIPCIÓN MUNICIPIOS";

    public static final String TABLE_ALBERGUE = "albergue";
    public static final String COLUMN_ID_ALBERGUE = "ID ALBERGUE";
    public static final String COLUMN_NOMBRE_ALBERGUE = "NOMBRE";
    public static final String COLUMN_DESCRIPCION_ALBERGUE = "DESCRIPCIÓN ALBERGUE";
    public static final String COLUMN_VALORACION = "VALORACIÓN";
    public static final String COLUMN_VOTOS = "VOTOS";
    public static final String COLUMN_PRECIO = "PRECIO";
    public static final String COLUMN_ID_MUNICIPIO_DEL_ALBERGUE = "ID MUNICIPIO";


    public static final String TABLE_MONUMENTO = "monumento";
    public static final String COLUMN_ID_MONUMENTO = "ID MONUMENTO";
    public static final String COLUMN_NOMBRE_MONUMENTO = "NOMBRE";
    public static final String COLUMN_DESCRIPCION_MONUMENTO = "DESCRIPCIÓN MONUMENTO";
    public static final String COLUMN_ID_MUNICIPIO_DEL_MONUMENTO = "ID MUNICIPIO";


    private static final String TEXT_TYPE = " TEXT";
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String REAL_TYPE = " REAL";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_MUNICIPIOS = ("Create table municipio(_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, habitantes INTEGER, descripcionMunicipio TEXT)");

            /*"CREATE TABLE " + EstructuraBaseDatos.TABLE_MUNICIPIO + " (" +
                    EstructuraBaseDatos.COLUMN_ID_MUNICIPIO + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBaseDatos.COLUMN_NOMBRE_MUNICIPIO + TEXT_TYPE + COMMA_SEP +
                    EstructuraBaseDatos.COLUMN_HABITANTES + INTEGER_TYPE + COMMA_SEP +
                    EstructuraBaseDatos.COLUMN_DESCRIPCION_MUNICIPIO + TEXT_TYPE + " )";*/

    public static final String SQL_CREATE_ALBERGUES = ("Create table albergue (_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, descripcion TEXT, valoracionSum INTEGER, votos INTEGER, precio REAL, id_Municipio INTEGER)");



            /*"CREATE TABLE " + EstructuraBaseDatos.TABLE_ALBERGUE + " (" +
                    EstructuraBaseDatos.COLUMN_ID_ALBERGUE + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EstructuraBaseDatos.COLUMN_NOMBRE_ALBERGUE + TEXT_TYPE + COMMA_SEP +
                    EstructuraBaseDatos.COLUMN_DESCRIPCION_ALBERGUE + TEXT_TYPE + COMMA_SEP +
                    EstructuraBaseDatos.COLUMN_VALORACION + INTEGER_TYPE + COMMA_SEP +
                    EstructuraBaseDatos.COLUMN_VOTOS + INTEGER_TYPE + COMMA_SEP +
                    EstructuraBaseDatos.COLUMN_PRECIO + REAL_TYPE + COMMA_SEP +
                    EstructuraBaseDatos.COLUMN_ID_MUNICIPIO_DEL_ALBERGUE + INTEGER_TYPE + " )";*/

    public static final String SQL_CREATE_MONUMENTOS = ("Create table monumento (_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, descripcion TEXT, id_Municipio INTEGER)");

    public static final String SQL_DELETE_MUNICIPIOS =
            "DROP TABLE IF EXISTS " + EstructuraBaseDatos.TABLE_MUNICIPIO;

    public static final String SQL_DELETE_ALBERGUES =
            "DROP TABLE IF EXISTS " + EstructuraBaseDatos.TABLE_ALBERGUE;

    public static final String SQL_DELETE_MONUMENTOS =
            "DROP TABLE IF EXISTS " + EstructuraBaseDatos.TABLE_MONUMENTO;
}
