package jesus.example.org.caminosdesantiagojesus;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import jesus.example.org.caminosdesantiagojesus.conexion.ConexionCaminoSantiagoSQLiteHelper;

/**
 * Created by JesúsRuiver on 25/04/2018.
 */

public class GestionMunicipios extends AppCompatActivity {

    private EditText txtNombreMunicipio;
    private EditText txtHabitantes;
    private EditText txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_municipios);


    }


}
