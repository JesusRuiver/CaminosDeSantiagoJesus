package jesus.example.org.caminosdesantiagojesus;

import android.content.Context;
import android.database.Cursor;

/**
 * Created by JesúsRuiver on 09/05/2018.
 */

public class AdaptadorCaminoDeSantiagoBD {

    protected Cursor cursor;

    public AdaptadorCaminoDeSantiagoBD(Context contexto,  Cursor cursor) {
        this.cursor = cursor;
    }
}
