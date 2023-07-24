COLUMN_NAME
public static final String TABLE_NAME;


//  ==================================================================





TABLE_NAME = "users";

// Create SQL statement
        String createTableSQL = "CREATE TABLE " + TABLE_NAME + " ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "firstname TEXT,"
                + "lastname TEXT,"
                + "email TEXT,"
                + "password TEXT,"
                + "mobile TEXT,"
                + "imagePath BLOB"
                + ");";


TABLE_NAME = "property";

// Create SQL statement
        String createTableSQL = "CREATE TABLE " + TABLE_NAME + " ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "address TEXT,"
                + "postcode TEXT,"
                + "description TEXT,"
                + "rooms INT,"
                + "rental_type TEXT,"
                + "category TEXT,"
                + "availabity TEXT"
                + ");";



// Insert Data into table
    String insertData = "INSERT INTO " + TABLE_NAME + " ("
            + "address, postcode, description, rooms, property_type, category, availability"
            + ") VALUES ("
            + "'123 Mickey Mouse Drive', "
            + "'A0 1DM', "
            + "'Two bedroom semi-detached beach house, with an infinite swimming pool.', "
            + "2, "
            + "'Full Rental/Partial Rental', "
            + "'Beach house', "
            + "'Available'"
            + ");";


TABLE_NAME = "property_images";

// Create SQL statement
        String createTableSQL = "CREATE TABLE " + TABLE_NAME + " ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "imagePath TEXT,"
                + "prop_id INT,"
                + "description TEXT,"
                + "FOREIGN KEY(prop_id) REFERENCES property(_id)"
                + ");";



TABLE_NAME = "booking";

// Create SQL statement
        String createTableSQL = "CREATE TABLE " + TABLE_NAME + " ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "prop_id INT NOT NULL,"
                + "start_date TEXT,"
                + "end_date TEXT,"
                + "no_of_days INT,"
                + "booking_type TEXT,"
                + "cost_per_night TEXT,"
                + " TEXT,"
                + "booking_status TEXT"
                + ");";
