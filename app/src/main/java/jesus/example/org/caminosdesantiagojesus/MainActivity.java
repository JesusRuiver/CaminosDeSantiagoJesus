package jesus.example.org.caminosdesantiagojesus;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import jesus.example.org.caminosdesantiagojesus.conexion.ConexionCaminoSantiagoSQLiteHelper;

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


        ConexionCaminoSantiagoSQLiteHelper miConexion =
                new ConexionCaminoSantiagoSQLiteHelper(this, "bdCaminoSantiago", null, 1);


        SQLiteDatabase db = miConexion.getWritableDatabase();
        miConexion.onDowngrade(db, ConexionCaminoSantiagoSQLiteHelper.DATABASE_VERSION, 2);

        miConexion.cargarMunicipio(db);
        miConexion.cargarAlbergue(db);

        miConexion.cerrarConexion(db);



    }

    public void lanzarGestionMunicipios(View view) {

        Intent i = new Intent(this, GestionMunicipios.class);
        startActivity(i);
    }

    public void lanzarConsultaMunicipios(View view) {
        Intent i = new Intent(this, ConsultaMunicipios.class);
        startActivity(i);
    }

}
