CREATE TABLE user(
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  firstname TEXT NOT NULL,
  lastname TEXT NOT NULL,
  email TEXT NOT NULL,
  mobile TEXT NOT NULL,
  password TEXT NOT NULL,
  image BLOB NOT NULL
);

CREATE TABLE property(
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  house_number TEXT,
  address_line1 TEXT,
  postcode TEXT,
  description TEXT,
  number_of_rooms INTEGER DEFAULT 1,
  rental_type TEXT,
  rate REAL DEFAULT 00.00,
  category TEXT NOT NULL
);

INSERT INTO property (house_number, address_line1, postcode, description, number_of_rooms, rental_type, rate, category)
VALUES
('1', 'Main Street', 'ABC123', 'Cozy cabin in the woods', 2, 'Long-term', 100.00, 'cabin'),
('456', 'Park Avenue', 'XYZ456', 'Luxury hotel with stunning views', 4, 'Short-term', 200.00, 'hotel'),
('789', 'Grove Road', 'LMN789', 'Beachfront property with ocean view', 1, 'Long-term', 75.00, 'beach'),
('101', 'Oak Lane', 'DEF101', 'Charming campsite by the river', 3, 'Short-term', 150.00, 'camping'),
('222', 'Cedar Street', 'PQR222', 'Spacious cabin in the mountains', 5, 'Short-term', 300.00, 'cabin'),
('303', 'Elm Avenue', 'UVW333', 'Modern hotel in the city center', 300, 'Short-term', 120.00, 'hotel'),
('444', 'Maple Road', 'HIJ444', 'Beachfront villa with private beach', 4, 'Short-term', 180.00, 'beach'),
('515', 'Birch Court', 'STU555', 'Rustic campsite near the forest', 1, 'Long-term', 90.00, 'camping'),
('66', 'Willow Lane', 'NOP666', 'Cozy cabin retreat in the wilderness', 6, 'Short-term', 250.00, 'cabin'),
('907', 'Pine Drive', 'GHI777', 'Luxury beachfront resort', 7, 'Short-term', 400.00, 'beach');

CREATE TABLE property_facility(
  id INTEGER NOT NULL,
  no_of_bathroom INTEGER,
  no_of_toilet INTEGER,
  generator_availability TEXT,
  property_id INTEGER NOT NULL,
  PRIMARY KEY(id, property_id),
  CONSTRAINT property_property_facility
    FOREIGN KEY (property_id) REFERENCES property (id)
);

CREATE TABLE property_image(
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  image BLOB NOT NULL,
  property_id INTEGER NOT NULL,
  CONSTRAINT property_property_image
    FOREIGN KEY (property_id) REFERENCES property (id)
);

CREATE TABLE property_review(
  id INTEGER NOT NULL,
  description TEXT,
  rating REAL,
  user_id INTEGER NOT NULL,
  property_id INTEGER NOT NULL,
  PRIMARY KEY(id, user_id, property_id),
  CONSTRAINT user_property_review FOREIGN KEY (user_id) REFERENCES user (id),
  CONSTRAINT property_property_review
    FOREIGN KEY (property_id) REFERENCES property (id)
);

CREATE TABLE booking(
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  start_date TEXT,
  end_date TEXT,
  no_of_days INTEGER,
  property_id INTEGER NOT NULL,
  user_id INTEGER NOT NULL,
  CONSTRAINT property_booking FOREIGN KEY (property_id) REFERENCES property (id),
  CONSTRAINT user_booking FOREIGN KEY (user_id) REFERENCES user (id)
);
