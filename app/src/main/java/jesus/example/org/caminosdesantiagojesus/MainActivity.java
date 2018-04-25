package jesus.example.org.caminosdesantiagojesus;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnGestionMunicipios;

    private Button btnInsertar;
    private Button btnActualizar;
    private Button btnBuscar;

    private EditText txtId;
    private EditText txtNombreMunicipio;
    private EditText txtHabitantes;
    private EditText txtDescripcion;

    private BaseDatosHelper contenedorDatos;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

           contenedorDatos = new BaseDatosHelper(MainActivity.this);

            contenedorDatos.muestraDatos();

            /*btnInsertar = (Button) findViewById(R.id.btnInsertar);
            btnActualizar = (Button) findViewById(R.id.btnActualizar);
            btnBuscar = (Button) findViewById(R.id.btnBuscar);

            txtId = (EditText) findViewById(R.id.id_municipio);
            txtNombreMunicipio = (EditText) findViewById(R.id.nombre_municipio);
            txtHabitantes = (EditText) findViewById(R.id.habitantes_municipio);
            txtDescripcion = (EditText) findViewById(R.id.descripcion_municipio);

            final BaseDatosHelper helper = new BaseDatosHelper(this);


            btnInsertar.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    SQLiteDatabase db = helper.getWritableDatabase();

                    ContentValues values = new ContentValues();
                    values.put(EstructuraBaseDatos.COLUMN_ID_MUNICIPIO, txtId.getText().toString());
                    values.put(EstructuraBaseDatos.COLUMN_NOMBRE_MUNICIPIO, txtNombreMunicipio.getText().toString());
                    values.put(EstructuraBaseDatos.COLUMN_HABITANTES, txtHabitantes.getText().toString());
                    values.put(EstructuraBaseDatos.COLUMN_DESCRIPCION_MUNICIPIO, txtDescripcion.getText().toString());

                    long newRowid = db.insert(EstructuraBaseDatos.TABLE_MUNICIPIO,null,values);

                    Toast.makeText(getApplicationContext(), "Registro guardado con clarve: " + newRowid, Toast.LENGTH_LONG).show();
                }
            });

            btnActualizar.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                }
            });

            btnBuscar.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                }
            });*/
    }

    public void lanzarGestionMunicipios(View view){

        Intent i = new Intent(this, GestionMunicipios.class);
        startActivity(i);
    }
}
