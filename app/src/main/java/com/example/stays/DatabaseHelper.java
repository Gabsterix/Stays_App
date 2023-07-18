package com.example.stays;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

//    Create variables to hold the database name, table and column names
    public static final String DATABASE_NAME = "stays_db";

    public static final String TABLE_NAME = "users";

    public static final String COLUMN_FIRSTNAME = "firstname";

    public static final String COLUMN_LASTNAME = "lasttname";

    public static final String COLUMN_EMAIL = "email";

    public static final String COLUMN_MOBILE = "mobile";

    public static final String COLUMN_PASSWORD = "password";

//    Constructor class

    public DatabaseHelper(@Nullable Context context) {

        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

//        Create a query string to hold the sql query
        String createTableQuery = "CREATE TABLE " + TABLE_NAME +
                " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_FIRSTNAME + " TEXT, " +
                COLUMN_LASTNAME + " TEXT, " +
                COLUMN_EMAIL + " TEXT, " +
                COLUMN_MOBILE + " TEXT, " +
                COLUMN_PASSWORD + " TEXT)";
//        Execute the query
        sqLiteDatabase.execSQL(createTableQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//        Drop the table if it exists
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

//        Create the database
        onCreate(sqLiteDatabase);
    }
}
