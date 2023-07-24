package com.example.stays;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

//    Create variables to hold the database name, table and column names
    public static final String DATABASE_NAME = "stays_db";

    public static String TABLE_NAME = "users";

    public static final String COLUMN_FIRSTNAME = "firstname";

    public static final String COLUMN_LASTNAME = "lasttname";

    public static final String COLUMN_EMAIL = "email";

    public static final String COLUMN_MOBILE = "mobile";

    public static final String COLUMN_PASSWORD = "password";

    String createTableQuery;

//    Constructor class

    public DatabaseHelper(@Nullable Context context) {

        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

//        Create a query string to hold the sql query
        createTableQuery = "CREATE TABLE " + TABLE_NAME +
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



//    Utility Methods
// Method to retrieve user data based on email and password
public boolean validateUser(String user, String password) {
    SQLiteDatabase db = this.getReadableDatabase();

    TABLE_NAME = "users";

    // Define the columns to be returned from the query
    String[] projection = {COLUMN_EMAIL, COLUMN_PASSWORD};

    // Define the WHERE clause to find the user with the given email and password
    String selection = COLUMN_EMAIL + " = ? AND " + COLUMN_PASSWORD + " = ?";
    String[] selectionArgs = {user, password};

    // Execute the query
    Cursor cursor = db.query(
            TABLE_NAME,
            projection,
            selection,
            selectionArgs,
            null,
            null,
            null
    );

    boolean isValidUser = cursor.moveToFirst(); // Check if the cursor contains any rows

    cursor.close();
    db.close();

    return isValidUser;
}




}
