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

    private ListView listView;
    private ArrayList<String> listado;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consulta_municipios);

        listView = (ListView)findViewById(R.id.lista_municipios);

        cargarMunicipios();

    }

    private ArrayList<String> listaMunicipios(){

        ArrayList<String> datos = new ArrayList<String>();
        ConexionCaminoSantiagoSQLiteHelper caminoHelper = new ConexionCaminoSantiagoSQLiteHelper(this,"ConsultaMunicipios",null,1);
        SQLiteDatabase db = caminoHelper.getReadableDatabase();

        String sql = "select * from municipio";
        Cursor c = db.rawQuery(sql,null);

        if (c.moveToFirst()){
            do{
                String linea = c.getInt(0) + "" + c.getString(1) + "" + c.getInt(2) + "" + c.getString(3);

              datos.add(linea);

            }while(c.moveToNext());
        }
        db.close();
        return datos;
    }

    public void cargarMunicipios(){

       listado = listaMunicipios();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.consulta_municipios);

        listView.setAdapter(adapter);


    }
}
