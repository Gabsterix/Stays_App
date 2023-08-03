package com.example.stays;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

//    Create variables to hold the database name, table and column names
    public static final String DATABASE_NAME = "stays_db";

    public static String TABLE_NAME = "user";

    public static String COLUMN_ID = "column_name";

    public static String COLUMN_1 = "column_name";

    public static String COLUMN_2 = "column_name";

    public static String COLUMN_3 = "column_name";

    public static String COLUMN_4 = "column_name";

    public static String COLUMN_5 = "column_name";

    public static String COLUMN_6 = "column_name";

    public static String COLUMN_7 = "column_name";

    public static  String COLUMN_8 = "column_name";

    public static String COLUMN_9 = "column_name";

    public static String COLUMN_10 = "column_name";

    public static String COLUMN_11 = "column_name";

    public static String COLUMN_12 = "column_name";

    public static String COLUMN_13 = "column_name";

    public static String COLUMN_14 = "column_name";

    public static String COLUMN_15 = "column_name";

    public static String COLUMN_16 = "column_name";

    public static String COLUMN_17 = "column_name";

    public static String COLUMN_18 = "column_name";


//    private SQLiteDatabase sqLiteDatabase;

//    Constructor class

    public DatabaseHelper(@Nullable Context context) {

        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

//        Create user table
        createUserTable(sqLiteDatabase);
//        Create Property Table
        createPropertyTable(sqLiteDatabase);
//        Create Property Image Table
        createPropertyImages(sqLiteDatabase);

//        Create Reviews table
        createReviewsTable(sqLiteDatabase);
//        Create the views (All data, Cabin, Camping Site, Beach Front and Hotel
//        1: All Data
        selectPropertyDataView(sqLiteDatabase);
//        2: Cabin
        selectPropertyDataViewBasedOnCabin(sqLiteDatabase);
//        3: Camping Site
        selectPropertyDataViewBasedOnCamping(sqLiteDatabase);
//        4: Beach Front
        selectPropertyDataViewBasedOnBeachFront(sqLiteDatabase);
//        5: Hotel
        selectPropertyDataViewBasedOnHotel(sqLiteDatabase);





//        Create Booking table
//        createBookingTable(sqLiteDatabase);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//        Drop the table if it exists
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

//        Create the database
        onCreate(sqLiteDatabase);
    }



//    ================= Utility Methods ==========================
//    1: Method to add one record into the user table
    public boolean addOneUser(UserModel userModel){

        SQLiteDatabase db = this.getWritableDatabase();
//        Specify the table name
        DatabaseHelper.TABLE_NAME = "user";
//      Specify the columns
        DatabaseHelper.COLUMN_ID = "user_id";
        DatabaseHelper.COLUMN_1 = "firstname";
        DatabaseHelper.COLUMN_2 = "lastname";
        DatabaseHelper.COLUMN_3 = "email";
        DatabaseHelper.COLUMN_4 = "mobile";
        DatabaseHelper.COLUMN_5 = "password";
        DatabaseHelper.COLUMN_6 = "image_uri";
//      Create an object of the Content values class and instantiate it
        ContentValues contentValues = new ContentValues();
//        Place the values into the container
        contentValues.put(DatabaseHelper.COLUMN_ID, userModel.getUser_id());
        contentValues.put(DatabaseHelper.COLUMN_1, userModel.getFirstname());
        contentValues.put(DatabaseHelper.COLUMN_2, userModel.getLastname());
        contentValues.put(DatabaseHelper.COLUMN_3, userModel.getEmail());
        contentValues.put(DatabaseHelper.COLUMN_4, userModel.getMobile());
        contentValues.put(DatabaseHelper.COLUMN_5, userModel.getPassword());
        contentValues.put(DatabaseHelper.COLUMN_6, userModel.getImagePath());
//        Executes the query and stores the result
        long result = db.insert(DatabaseHelper.TABLE_NAME, null, contentValues);
        return result != -1;
    }

//    2: Method to retrieve user data based on email and password
public boolean validateUser(UserModel userModel) {
    SQLiteDatabase db = this.getReadableDatabase();

    // Set table name
    TABLE_NAME = "user";

    // Set the column names
    COLUMN_1 = "email";
    COLUMN_2 = "password";

    // Define the columns to be returned from the query
    String[] projection = {COLUMN_1, COLUMN_2};

    // Define the WHERE clause to find the user with the given email and password
    String selection = COLUMN_1 + " = ? AND " + COLUMN_2 + " = ?";

    // Provide actual email and password values from the userModel to selectionArgs
    String[] selectionArgs = {userModel.getEmail(), userModel.getPassword()};

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
    // db.close(); // Note: Closing the database here might cause issues if this method is called frequently.

    return isValidUser;
}


//      Update method for user details


    private void createUserTable(SQLiteDatabase sqLiteDatabase){

//        PART 1: Set the table and column name
        TABLE_NAME = "user";
        COLUMN_ID = "user_id";
        COLUMN_1 = "firstname";
        COLUMN_2 = "lastname";
        COLUMN_3 = "email";
        COLUMN_4 = "mobile";
        COLUMN_5 = "password";
        COLUMN_6 = "image_uri";

//        PART 2: Create user table structure
        String createUserTableQuery = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_1 + " TEXT, "
                + COLUMN_2 + " TEXT, "
                + COLUMN_3 + " TEXT, "
                + COLUMN_4 + " TEXT, "
                + COLUMN_5 + " TEXT, "
                + COLUMN_6 + " TEXT)";

//        PART 3: Execute the query
        sqLiteDatabase.execSQL(createUserTableQuery);

    }

//    ===================== Property Table ==========================

    private void createPropertyTable(SQLiteDatabase sqLiteDatabase){

//        PART 1: Set the table and column names
        TABLE_NAME = "property";
        COLUMN_ID = "prop_id";
        COLUMN_1 = "property_code";
        COLUMN_2 = "country";
        COLUMN_3 = "location";
        COLUMN_4 = "property_name";
        COLUMN_5 = "building_no";
        COLUMN_6 = "address";
        COLUMN_7 = "postcode";
        COLUMN_8 = "rental_type";
        COLUMN_9 = "child_friendly";
        COLUMN_10 = "disability_friendly";
        COLUMN_11 = "no_rooms";
        COLUMN_12 = "no_bathroom";
        COLUMN_13 = "no_toilets";
        COLUMN_14 = "property_type";
        COLUMN_15 = "star_rating";
        COLUMN_16 = "rate_per_night";
        COLUMN_17 = "mileage";
        COLUMN_18 = "description";

//        PART 2: Create table structure
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_1 + " TEXT, "
                + COLUMN_2 + " TEXT, "
                + COLUMN_3 + " TEXT, "
                + COLUMN_4 + " TEXT, "
                + COLUMN_5 + " TEXT, "
                + COLUMN_6 + " TEXT, "
                + COLUMN_7 + " TEXT, "
                + COLUMN_8 + " TEXT, "
                + COLUMN_9 + " TEXT, "
                + COLUMN_10 + " TEXT, "
                + COLUMN_11 + " INTEGER, "
                + COLUMN_12 + " INTEGER, "
                + COLUMN_13 + " INTEGER, "
                + COLUMN_14 + " TEXT, "
                + COLUMN_15 + " REAL, "
                + COLUMN_16 + " REAL, "
                + COLUMN_17 + " REAL, "
                + COLUMN_18 + " TEXT)";

//        Execute the query
        sqLiteDatabase.execSQL(createTableQuery);

//        PART 3: Insert data into the property table
        String insertDefaultData = "INSERT INTO " + TABLE_NAME + " ("
                + COLUMN_1+ ", "
                + COLUMN_2 + ", "
                + COLUMN_3 + ", "
                + COLUMN_4 + ", "
                + COLUMN_5 + ", "
                + COLUMN_6 + ", "
                + COLUMN_7 + ", "
                + COLUMN_8 + ", "
                + COLUMN_9 + ", "
                + COLUMN_10 + ", "
                + COLUMN_11 + ", "
                + COLUMN_12 + ", "
                + COLUMN_13 + ", "
                + COLUMN_14 + ", "
                + COLUMN_15 + ", "
                + COLUMN_16 + ", "
                + COLUMN_17 + ", "
                + COLUMN_18 + ")"
                + " VALUES "
                + "('CAB000001', 'USA', 'Yellowstone', 'Cabin Retreat', '123', 'Forest Road', '12345', 'Short-Term', 'Yes', 'No', 3, 2, 2, 'Cabin', 4.5, 200.00, 23, 'Cozy cabin in a serene forest setting.'),"
                + "('CAB000002', 'Canada', 'Banff', 'Mountain Lodge', '456', 'Mountain View Drive', '67890', 'Short-Term', 'Yes', 'Yes', 2, 1, 1, 'Cabin', 4.8, 150.00, 43, 'Charming cabin with stunning mountain views.'),"
                + "('CAB000003', 'Norway', 'Lofoten Islands', 'Fjord View Cabin', '789', 'Fjord Street', '54321', 'Short-Term', 'Yes', 'Yes', 4, 3, 2, 'Cabin', 4.7, 180.00, 13, 'Spacious cabin overlooking the breathtaking fjords.'),"
                + "('CAB000004', 'Switzerland', 'Zermatt', 'Alpine Chalet', '321', 'Alpine Avenue', '98765', 'Short-Term', 'Yes', 'No', 1, 1, 1, 'Cabin', 3.8, 100.00, 9, 'Compact studio cabin in the Swiss Alps.'),"
                + "('BEACH000001', 'Maldives', 'Baa Atoll', 'Tropical Paradise Resort', '123', 'Beach Villa Road', '20000', 'Short-Term', 'Yes', 'Yes', 5, 3, 3, 'Beach Front', 4.9, 350.00, 16, 'Luxurious beachfront villa with private pool.'),"
                + "('BEACH000002', 'Thailand', 'Phuket', 'Sandy Beach House', '456', 'Patong Beach', '83150', 'Short-Term', 'Yes', 'Yes', 4, 2, 2, 'Beach Front', 4.6, 280.00, 8, 'Stylish beachfront apartment with ocean view.'),"
                + "('BEACH000003', 'Bahamas', 'Nassau', 'Seaside Getaway', '789', 'Paradise Island', '12345', 'Short-Term', 'Yes', 'Yes', 6, 4, 3, 'Beach Front', 4.8, 420.00, 15, 'Spacious beachfront house with private beach access.'),"
                + "('BEACH000004', 'Mexico', 'Cancun', 'Oceanfront Retreat', '321', 'Hotel Zone', '77500', 'Short-Term', 'Yes', 'Yes', 3, 2, 2, 'Beach Front', 4.3, 240.00, 33, 'Beachfront condo with stunning sunset views.'),"
                + "('CAMP000001', 'Canada', 'Jasper', 'Riverside Campsite', '123', 'Campground Road', 'T0E 1E0', 'Short-Term', 'Yes', 'Yes', 1, 0, 0, 'Camping Site', 3.5, 60.00, 27, 'Scenic camping site amidst nature.'),"
                + "('CAMP000002', 'USA', 'Yosemite', 'Mountain Campground', '456', 'Nature Trail', '95389', 'Short-Term', 'Yes', 'Yes', 2, 0, 0, 'Camping Site', 4.0, 80.00, 40, 'Camping site with breathtaking mountain views.'),"
                + "('CAMP000003', 'Australia', 'Great Ocean Road', 'Beachside Camping', '789', 'Beachside Camping', '3232', 'Short-Term', 'Yes', 'Yes', 3, 0, 0, 'Camping Site', 4.2, 100.00, 80.9, 'Beachside camping experience by the coast.'),"
                + "('CAMP000004', 'Sweden', 'Lapland', 'Arctic Wilderness Camp', '321', 'Arctic Circle', '98107', 'Short-Term', 'Yes', 'Yes', 1, 0, 0, 'Camping Site', 3.8, 70.00, 51, 'Campsite under the northern lights.'),"
                + "('HOTEL000001', 'Spain', 'Barcelona', 'Elegant City Hotel', '123', 'La Rambla', '08002', 'Short-Term', 'Yes', 'Yes', 400, 2, 2, 'Hotel', 4.7, 300.00, 22, 'Elegant hotel in the heart of Barcelona.'),"
                + "('HOTEL000002', 'France', 'Paris', 'Luxury Parisian Hotel', '456', 'Champs-Élysées', '75008', 'Short-Term', 'Yes', 'Yes', 155, 3, 2, 'Hotel', 4.9, 400.00, 17, 'Luxurious hotel with stunning views of Paris.'),"
                + "('HOTEL000003', 'Italy', 'Venice', 'Canal View Hotel', '789', 'Grand Canal', '30100', 'Short-Term', 'Yes', 'Yes', 85, 2, 2, 'Hotel', 4.5, 250.00, 7.5, 'Charming hotel on the banks of the Grand Canal.'),"
                + "('HOTEL000004', 'Japan', 'Tokyo', 'Modern City Hotel', '321', 'Shibuya', '150-0041', 'Short-Term', 'Yes', 'Yes', 120, 1, 1, 'Hotel', 4.2, 180.00, 2.6, 'Modern hotel in the vibrant Shibuya district.');";

//        Execute the insert statement query
        sqLiteDatabase.execSQL(insertDefaultData);

    }
//    ===================== End of Property Table ===================

//    ============= Start of Property Image Table ===================

    private void createPropertyImages(SQLiteDatabase sqLiteDatabase){

//        PART 1: Set table and column names
        TABLE_NAME = "property_image";
        COLUMN_ID = "image_id";
        COLUMN_1 = "image_uri";
        COLUMN_2 = "prop_id_fk";

//        PART 2: Create table structure
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_1 + " TEXT, "
                + COLUMN_2 + " INTEGER)";

//        Execute the create table query
        sqLiteDatabase.execSQL(createTableQuery);

//        PART 3: Insert data into the table
        String insertDefaultData = "INSERT INTO " + TABLE_NAME + " ("
                + COLUMN_1+ ", "
                + COLUMN_2 + ")"
                + " VALUES "
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 1),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 1),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 1),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 1),"
                + "('https://drive.google.com/file/d/1OIKKi7Knc3Y_YkUaC2Zd8PU5BrqGHGdA/view?usp=drive_link', 2),"
                + "('https://drive.google.com/file/d/1hT_m7nKMXLPxSjclCBJsi91ubWjNFs4t/view?usp=drive_link', 2),"
                + "('https://drive.google.com/file/d/1dsbMUJTFuV4TRcTNCDNfZnZDCA0NPANy/view?usp=drive_link', 2),"
                + "('https://drive.google.com/file/d/1eI9Af5JJD9_-p-AtfiKUx41TbBd7Ho88/view?usp=drive_link', 2),"
                + "('https://drive.google.com/file/d/1p60ZZXTHpTyB4UoKqCV7TpRqGyVWZGkR/view?usp=drive_link', 3),"
                + "('https://drive.google.com/file/d/18VukwNzyyR-kFIiJqsZEHIUk8oVsGu3x/view?usp=drive_link', 3),"
                + "('https://drive.google.com/file/d/1Du8OOkiHKFG7k6JQQLDd-wdKDhoBNko-/view?usp=drive_link', 3),"
                + "('https://drive.google.com/file/d/1eI9Af5JJD9_-p-AtfiKUx41TbBd7Ho88/view?usp=drive_link', 3),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 4),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 4),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 4),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 4),"
                + "('https://drive.google.com/file/d/1bm2snorxQ4LxeR6UhZRC2yC0-URC5MmP/view?usp=drive_link', 5),"
                + "('https://drive.google.com/file/d/1-hmCJCuCCqhRvjw-sviaheB4Fyf4JKLV/view?usp=drive_link', 5),"
                + "('https://drive.google.com/file/d/1XJeMQi0GNeL1Abgb2Vxk-pFiRX7euO3K/view?usp=drive_link', 5),"
                + "('https://drive.google.com/file/d/1h7oopFIZEC5WucJv-s8MHl6mf-p2S_zB/view?usp=drive_link', 5),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 6),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 6),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 6),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 6),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 7),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 7),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 7),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 7),"
                + "('https://drive.google.com/file/d/1tHdCLNacPmlCMjqvDipJOR5dZmP6aIvM/view?usp=drive_link', 8),"
                + "('https://drive.google.com/file/d/1PYuThtQxMDauIxtRToKDAkLiwFK9k0Uk/view?usp=drive_link', 8),"
                + "('https://drive.google.com/file/d/1itRtXpktKyz8OTTr_UeNJsPSeOp9BF9D/view?usp=drive_link', 8),"
                + "('https://drive.google.com/file/d/1Xs7Rf_bL9FZ1MYBQyzZ6MSsH5LNQgmXH/view?usp=drive_link', 8),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 9),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 9),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 9),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 9),"
                + "('https://drive.google.com/file/d/1pmarhD_2-oj9nOzjF409JjXW9RppUKL7/view?usp=drive_link', 10),"
                + "('https://drive.google.com/file/d/1uAHzrO5-Vk4jQfqLnuZR9kE8gTuFi7mN/view?usp=drive_link', 10),"
                + "('https://drive.google.com/file/d/1AXjuSwxMelgHP7HQFhVGpoqIRpf74YvD/view?usp=drive_link', 10),"
                + "('https://drive.google.com/file/d/1eTyrODKKeYbqMikmZtERY6HtAbNEPmXb/view?usp=drive_link', 10),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11),"
                + "('https://drive.google.com/file/d/16TOHITqB2jkFVAvfEvCnfIZKAnAN9EED/view?usp=drive_link', 12),"
                + "('https://drive.google.com/file/d/1-k3mA0I9jm9MMg3SiJATBbia3G1EpFKl/view?usp=drive_link', 12),"
                + "('https://drive.google.com/file/d/1A13vw-SByIjldjW19FF8a9IFsxylDEYc/view?usp=drive_link', 12),"
                + "('https://drive.google.com/file/d/1DkQ9G30Q-6AMsKqRb5JvM2evm9pNhaNX/view?usp=drive_link', 12),"
                + "('https://drive.google.com/file/d/1JTwmIRA9wTGZ0_qzJoX82KbqVagu8_6-/view?usp=drive_link', 13),"
                + "('https://drive.google.com/file/d/1ke5JFaiByCLYN26n2poUkGnierIiw7v-/view?usp=drive_link', 13),"
                + "('https://drive.google.com/file/d/1C0b4tI3IZ0eMlOJlWC1-bTIIwyFy9NVV/view?usp=drive_link', 13),"
                + "('https://drive.google.com/file/d/14Qju20ISuU9Dx7wMvROV5IC8AfPGxQap/view?usp=drive_link', 13),"
                + "('https://drive.google.com/file/d/1Q-mjZU5ddzcU75gmbnKGMSPz0iK_3AuR/view?usp=drive_link', 14),"
                + "('https://drive.google.com/file/d/1_0nl-Um93uNw3P5GU-mkXHDx02knDVbF/view?usp=drive_link', 14),"
                + "('https://drive.google.com/file/d/1r-BYEckvQ-Z2CwarhwGVznARTnWaENct/view?usp=drive_link', 14),"
                + "('https://drive.google.com/file/d/1HZyuu-V_E2vBkqnhT9Z_mGsXgdDTR-u-/view?usp=drive_link', 14),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 15),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 15),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 15),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 15),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16),"
                + "('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16);";

//        Execute insert query
        sqLiteDatabase.execSQL(insertDefaultData);

    }

//    ===================== End of Property Image Table =============================

//    ================= Property Reviews =========================

    private void createReviewsTable(SQLiteDatabase sqLiteDatabase){

//        PART 1: Set the table and column names
        TABLE_NAME = "review";
        COLUMN_ID = "review_id";
        COLUMN_1 = "description";
        COLUMN_2 = "rating";
        COLUMN_3 = "customer_name";
        COLUMN_4 = "avatar_uri";
        COLUMN_5 = "property_id_fk";

//        PART 2: Create table structure
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_1 + " TEXT, "
                + COLUMN_2 + " REAL, "
                + COLUMN_3 + " TEXT, "
                + COLUMN_4 + " TEXT, "
                + COLUMN_5 + " INTEGER)";
//        Execute the create table query
        sqLiteDatabase.execSQL(createTableQuery);

//        PART 3: Insert the data into the table
        String insertDefaultData = "INSERT INTO " + TABLE_NAME + " ("
                + COLUMN_1 + ", "
                + COLUMN_2 + ", "
                + COLUMN_3 + ", "
                + COLUMN_4 + ", "
                + COLUMN_5 + ")"
                + " VALUES "
                + "('Great experience! Friendly staff and excellent amenities.', 4.5, 'John Doe', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 13),"
                + "('The property was clean and well-maintained. Highly recommended.', 4.8, 'Jane Smith', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 2),"
                + "('Average stay. The room was small and noisy.', 3.2, 'David Johnson', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16),"
                + "('Wonderful location with beautiful views.', 4.7, 'Emily Brown', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 7),"
                + "('Not what I expected. Disappointed with the service.', 2.5, 'Michael Wilson', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 4),"
                + "('The property was outdated and needs renovation.', 3.0, 'Laura Anderson', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 7),"
                + "('Absolutely loved it! Will definitely come back.', 5.0, 'Sarah Lee', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 14),"
                + "('Friendly staff, but the food options were limited.', 4.0, 'Robert Taylor', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 13),"
                + "('Good value for money. Clean and comfortable rooms.', 4.3, 'Jennifer Martinez', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 8),"
                + "('Enjoyed the pool and spa facilities. Great for families.', 4.6, 'Christopher Davis', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16),"
                + "('The property had a nice ambiance and helpful staff.', 4.4, 'Elizabeth Clark', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 5),"
                + "('Not suitable for disabled guests. Limited accessibility.', 2.8, 'William Miller', 'https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11);";
//        Execute the insert statement
        sqLiteDatabase.execSQL(insertDefaultData);

    }
//    ================ End of Property Reviews Table =============

//    Create a Views for getting the data
    private void selectPropertyDataView(SQLiteDatabase sqLiteDatabase){

        String VIEW_NAME = "property_property_image_view";

//        Create the query string
        String createViewQuery = "CREATE VIEW " + VIEW_NAME + " AS "
                + "SELECT p.*, pi.image_id, pi.image_uri "
                + "FROM 'property' p "
                + "LEFT JOIN 'property_image' pi "
                + "ON p.prop_id = pi.prop_id_fk";

//        Execute the query
        sqLiteDatabase.execSQL(createViewQuery);

    }

    private void selectPropertyDataViewBasedOnCabin(SQLiteDatabase sqLiteDatabase){

//        Create the view name
        String VIEW_NAME = "property_property_image_by_cabin_view";
        String SEARCH_PARAM = "Cabin";

//        Create the query string
        String selectPropertyDataByTypeQuery = "CREATE VIEW " + VIEW_NAME + " AS "
                + "SELECT p.*, pi.image_id, pi.image_uri "
                + "FROM 'property' p "
                + "LEFT JOIN 'property_image' pi "
                + "ON p.prop_id = pi.prop_id_fk "
                + "WHERE p.property_type = "
                + "'" + SEARCH_PARAM + "';";
//        Execute the query
        sqLiteDatabase.execSQL(selectPropertyDataByTypeQuery);

    }

    private void selectPropertyDataViewBasedOnCamping(SQLiteDatabase sqLiteDatabase){

//        Create the view name
        String VIEW_NAME = "property_property_image_by_camping_view";
        String SEARCH_PARAM = "Camping Site";

//        Create the query string
        String selectPropertyDataByTypeQuery = "CREATE VIEW " + VIEW_NAME + " AS "
                + "SELECT p.*, pi.image_id, pi.image_uri "
                + "FROM 'property' p "
                + "LEFT JOIN 'property_image' pi "
                + "ON p.prop_id = pi.prop_id_fk "
                + "WHERE p.property_type = "
                + "'" + SEARCH_PARAM + "';";
//        Execute the query
        sqLiteDatabase.execSQL(selectPropertyDataByTypeQuery);

    }


    private void selectPropertyDataViewBasedOnHotel(SQLiteDatabase sqLiteDatabase){

//        Create the view name
        String VIEW_NAME = "property_property_image_by_hotel_view";
        String SEARCH_PARAM = "Hotel";

//        Create the query string
        String selectPropertyDataByTypeQuery = "CREATE VIEW " + VIEW_NAME + " AS "
                + "SELECT p.*, pi.image_id, pi.image_uri "
                + "FROM 'property' p "
                + "LEFT JOIN 'property_image' pi "
                + "ON p.prop_id = pi.prop_id_fk "
                + "WHERE p.property_type = "
                + "'" + SEARCH_PARAM + "';";
//        Execute the query
        sqLiteDatabase.execSQL(selectPropertyDataByTypeQuery);

    }

    private void selectPropertyDataViewBasedOnBeachFront(SQLiteDatabase sqLiteDatabase){

//        Create the view name
        String VIEW_NAME = "property_property_image_by_beach_view";
        String SEARCH_PARAM = "Beach Front";

//        Create the query string
        String selectPropertyDataByTypeQuery = "CREATE VIEW " + VIEW_NAME + " AS "
                + "SELECT p.*, pi.image_id, pi.image_uri "
                + "FROM 'property' p "
                + "LEFT JOIN 'property_image' pi "
                + "ON p.prop_id = pi.prop_id_fk "
                + "WHERE p.property_type = "
                + "'" + SEARCH_PARAM + "';";
//        Execute the query
        sqLiteDatabase.execSQL(selectPropertyDataByTypeQuery);

    }



//    Final Bracket
}
