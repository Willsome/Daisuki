package dwijo.com.br.d_ask;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by EMERSON on 24/08/2016.
 */
public class DBCreator extends SQLiteOpenHelper {
    private static String DB_NAME = "DB_DASK";
    private static int DB_VERSION= 1;

    private static String TABLE_USERS =
            "CREATE TABLE users{"+ "password integer primary key ,"+"nome text"+ "email text"+"}";


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL(TABLE_USERS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldversion, int newversion) {

    }
    public DBCreator(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
}
