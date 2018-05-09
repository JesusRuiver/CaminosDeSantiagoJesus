package jesus.example.org.caminosdesantiagojesus;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnGestionMunicipios;

    private Button btnInsertar;
    private Button btnActualizar;
    private Button btnBuscar;

    private EditText txtId;
    private EditText txtNombreMunicipio;
    private EditText txtHabitantes;
    private EditText txtDescripcion;

    private CaminoDeSantiagoBD contenedorDatos;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);




    }

    public void lanzarGestionMunicipios(View view){

        Intent i = new Intent(this, GestionMunicipios.class);
        startActivity(i);
    }
}
