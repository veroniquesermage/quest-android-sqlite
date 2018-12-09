package fr.wildcodeschool.roomreservation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 4;
    public static final String DATABASE_NAME = "database.db";

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PERSON_ENTRIES);
        db.execSQL(SQL_CREATE_ROOM_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_PERSON_ENTRIES);
        db.execSQL(SQL_DELETE_ROOM_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public static final String SQL_CREATE_PERSON_ENTRIES =
            "CREATE TABLE " + DBContract.PersonEntry.TABLE_NAME + " (" +
                    DBContract.PersonEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DBContract.PersonEntry.COLUMN_NAME_LASTNAME + " TEXT," +
                    DBContract.PersonEntry.COLUMN_NAME_FIRSTNAME + " TEXT);";

    public static final String SQL_CREATE_ROOM_ENTRIES =
            "CREATE TABLE " + DBContract.RoomEntry.TABLE_NAME + " (" +
                    DBContract.RoomEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DBContract.RoomEntry.COLUMN_NAME_NAME + " TEXT);";



    public static final String SQL_DELETE_PERSON_ENTRIES =
            "DROP TABLE IF EXISTS " + DBContract.PersonEntry.TABLE_NAME;

    public static final String SQL_DELETE_ROOM_ENTRIES =
            "DROP TABLE IF EXISTS " + DBContract.RoomEntry.TABLE_NAME;
}
