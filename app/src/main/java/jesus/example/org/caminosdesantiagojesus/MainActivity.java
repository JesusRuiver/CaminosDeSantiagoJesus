package jesus.example.org.caminosdesantiagojesus;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Button btnGestionMunicipios;

    private Button btnInsertar;
    private Button btnActualizar;
    private Button btnBuscar;

    private EditText txtNombreMunicipio;
    private EditText txtHabitantes;
    private EditText txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        txtNombreMunicipio = (EditText) findViewById(R.id.nombre_municipio);
        txtHabitantes = (EditText)findViewById(R.id.habitantes_municipio);
        txtDescripcion = (EditText)findViewById(R.id.descripcion_municipio);


    }

    public void lanzarGestionMunicipios(View view){

        Intent i = new Intent(this, GestionMunicipios.class);
        startActivity(i);
    }

    public void lanzarConsultaMunicipios(View view){
        Intent i = new Intent(this, ConsultaMunicipios.class);
        startActivity(i);
    }


}
