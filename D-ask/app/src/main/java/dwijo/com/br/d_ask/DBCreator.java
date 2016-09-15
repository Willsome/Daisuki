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

    private static String USER =
            "CREATE TABLE USER{"+ "iduser integer primary key ,"+"name text"+ "email text"+"phone int"+
                    "userpoints int"+"}";
    private static String QUESTION =
            "CREATE TABLE QUESTION{"+ "idquestion integer primary key ,"+"iduser int"+ "question text"+"text string"+
                    "idarea int"+"}";
    private static String TAG =
            "CREATE TABLE TAG{"+ "idtag integer primary key ,"+"nametag text"+ "description text"+"}";
    private static String MEDAL =
            "CREATE TABLE MEDAL{"+ "idmedal integer primary key ,"+"namedal text"+ "descriptionmedal text"+"}";
    private static String ANSWER =
            "CREATE TABLE ANSWER{"+ "idanswer integer primary key ,"+"iduser int"+ "idquestion int"+"text string"+
                    "hate int"+"}";
    private static String AREA =
            "CREATE TABLE AREA{"+ "idarea integer primary key ,"+"namearea text"+ "descriptionarea text"+"}";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(USER);
        db.execSQL(QUESTION);
        db.execSQL(TAG);
        db.execSQL(MEDAL);
        db.execSQL(ANSWER);
        db.execSQL(AREA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldversion, int newversion) {

    }
    public DBCreator(Context context) {

        super(context, DB_NAME, null, DB_VERSION);
    }
}
