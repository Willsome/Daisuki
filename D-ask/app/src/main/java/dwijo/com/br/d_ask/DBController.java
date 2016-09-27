package dwijo.com.br.d_ask;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;


/**
 * Created by EMERSON on 26/08/2016.
 */
public class DBController {
    private static DBCreator dbCreator =null;
    private String nome;

    public DBController(Context context) {
        if (dbCreator == null){
            dbCreator = new DBCreator(context);
        }
    }
    /**
     LEMBRE DE FAZER AS TABELAS DIREITO
     AQUI PODEMOS CRIAR OS MÉTODOS COMO LISTAR ADICIONAR E FAZER TAL COISA
     LEMBRA DE FAZER UM DIAGRAMA DE CLASSES TBM
     * */
    public void addUsers(String nome) {
        this.nome = nome;
        String sql = "INSERT INTO users (nome) VALUES ("+nome+")";
        SQLiteDatabase db =dbCreator.getWritableDatabase();
        db.execSQL(sql);


    }
    public ArrayList<String> getallUsers(){
        SQLiteDatabase db = dbCreator.getReadableDatabase();
        String sql = "select nome from USER";
        Cursor cursor = db.rawQuery(sql,null);
        ArrayList<String> Users = null;
        if (cursor != null && cursor.moveToFirst()){
            Users = new ArrayList<String>();
            do {
                Users.add(cursor.getString(0));

            }while(cursor.moveToNext());


        }
        return Users;
    };
}
