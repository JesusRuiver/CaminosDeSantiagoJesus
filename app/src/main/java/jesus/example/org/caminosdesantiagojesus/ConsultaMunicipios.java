package jesus.example.org.caminosdesantiagojesus;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import jesus.example.org.caminosdesantiagojesus.conexion.ConexionCaminoSantiagoSQLiteHelper;

/**
 * Created by JesúsRuiver on 09/05/2018.
 */

public class ConsultaMunicipios extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consulta_municipios);



    }


}
