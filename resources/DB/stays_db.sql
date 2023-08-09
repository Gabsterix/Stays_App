CREATE TABLE user(
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  firstname TEXT NOT NULL,
  lastname TEXT NOT NULL,
  email TEXT NOT NULL,
  mobile TEXT NOT NULL,
  password TEXT NOT NULL,
  image BLOB NOT NULL
);

CREATE TABLE hotel_image(
  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  image BLOB NOT NULL,
  hotel_holel_id INTEGER NOT NULL,
  CONSTRAINT hotel_image FOREIGN KEY (hotel_holel_id) REFERENCES hotel (holel_id)
);

CREATE TABLE property_review(
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  description TEXT,
  rating REAL,
  user_id INTEGER NOT NULL,
  CONSTRAINT user_property_review FOREIGN KEY (user_id) REFERENCES user (id)
);

CREATE TABLE booking(
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  start_date TEXT,
  end_date TEXT,
  no_of_days INTEGER,
  user_id INTEGER NOT NULL,
  availablity_availability_id INTEGER,
  CONSTRAINT user_booking FOREIGN KEY (user_id) REFERENCES user (id),
  CONSTRAINT availablity_booking
    FOREIGN KEY (availablity_availability_id)
      REFERENCES availablity (availability_id)
);

CREATE TABLE hotel(
  holel_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  hotel_name TEXT NOT NULL,
  number_of_rooms TEXT NOT NULL,
  number_of_bathrooms TEXT NOT NULL,
  room_type TEXT,
  star_rating REAL NOT NULL,
  swimming_pool_status TEXT NOT NULL,
  child_facilities TEXT NOT NULL,
  cost_per_night REAL NOT NULL DEFAULT 00.00
);

CREATE TABLE cabin(
  cabin_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  country TEXT,
  location TEXT,
  house_no TEXT,
  address_line TEXT,
  postcode TEXT,
  number_of_rooms TEXT NOT NULL,
  number_of_bathrooms TEXT NOT NULL,
  number_of_toilets TEXT NOT NULL,
  child_friendly TEXT NOT NULL DEFAULT No,
  rental_type TEXT NOT NULL DEFAULT Short-term,
  disability_friendly TEXT NOT NULL DEFAULT Yes,
  multi_share TEXT NOT NULL DEFAULT No,
  rate REAL NOT NULL DEFAULT 00.00,
  description TEXT
);

CREATE TABLE beach(
  beach_house_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  country TEXT,
  location TEXT,
  house_no TEXT,
  address TEXT,
  postcode TEXT,
  no_of_rooms TEXT NOT NULL DEFAULT 1,
  no_of_bathrooms TEXT NOT NULL DEFAULT 1,
  no_of_toilet TEXT NOT NULL DEFAULT 1,
  rental_type TEXT NOT NULL DEFAULT Short-Term
);

CREATE TABLE camping(
  camp_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  country TEXT,
  location TEXT,
  van_tent_no TEXT,
  address TEXT,
  postcode TEXT,
  no_available TEXT NOT NULL DEFAULT 1,
  no_of_bathrooms TEXT NOT NULL DEFAULT 1,
  no_of_toilet TEXT NOT NULL DEFAULT 1,
  rental_type TEXT NOT NULL DEFAULT Short-Term,
  disability_friendly TEXT NOT NULL DEFAULT Yes
);

CREATE TABLE camp_image(
  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  image BLOB,
  image_uri TEXT NOT NULL,
  camping_camp_id INTEGER NOT NULL,
  CONSTRAINT camping_camp_image
    FOREIGN KEY (camping_camp_id) REFERENCES camping (camp_id)
);

CREATE TABLE beach_image(
  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  image BLOB NOT NULL,
  beach_beach_house_id INTEGER NOT NULL,
  CONSTRAINT beach_beach_image
    FOREIGN KEY (beach_beach_house_id) REFERENCES beach (beach_house_id)
);

CREATE TABLE cabin_image(
  _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  image BLOB NOT NULL,
  cabin_cabin_id INTEGER NOT NULL,
  CONSTRAINT cabin_cabin_image
    FOREIGN KEY (cabin_cabin_id) REFERENCES cabin (cabin_id)
);

CREATE TABLE availablity(
  availability_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  property_id INTEGER NOT NULL,
  start_date DATE,
  end_date DATE,
  no_of_days INTEGER,
  availability_status TEXT
);


-- Existing records in the hotel table
INSERT INTO hotel (hotel_name, number_of_rooms, number_of_bathrooms, room_type, star_rating, swimming_pool_status, child_facilities, cost_per_night, country, location, house_no, address, postcode)
VALUES
('Hilton Hotel', '300', '350', 'Luxury', 4.8, 'Yes', 'Yes', 250.00, 'USA', 'New York', '123', 'Broadway Avenue', '10001'),
('Marriott Hotel', '200', '250', 'Deluxe', 4.5, 'Yes', 'Yes', 200.00, 'Ghana', 'Accra', '456', 'Airport City Street', 'GA8 78D'),
('Ritz-Carlton', '150', '200', 'Suite', 4.9, 'Yes', 'Yes', 350.00, 'UK', 'London', '789', 'Market Street', 'SW15 3AP'),
('Sheraton Hotel', '100', '120', 'Standard', 4.0, 'Yes', 'Yes', 150.00, 'Canada', 'Toronto', '987', 'Queen Street', 'M5V 2H1');

INSERT INTO hotel_image (image, image_uri, hotel_holel_id)
VALUES
  (null, 'https://drive.google.com/file/d/1JTwmIRA9wTGZ0_qzJoX82KbqVagu8_6-/view?usp=drive_link', 1),
  (null, 'https://drive.google.com/file/d/1ke5JFaiByCLYN26n2poUkGnierIiw7v-/view?usp=drive_link', 1),
  (null, 'https://drive.google.com/file/d/1C0b4tI3IZ0eMlOJlWC1-bTIIwyFy9NVV/view?usp=drive_link', 1),
  (null, 'https://drive.google.com/file/d/14Qju20ISuU9Dx7wMvROV5IC8AfPGxQap/view?usp=drive_link', 1),
  (null, 'https://drive.google.com/file/d/1Q-mjZU5ddzcU75gmbnKGMSPz0iK_3AuR/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1_0nl-Um93uNw3P5GU-mkXHDx02knDVbF/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1r-BYEckvQ-Z2CwarhwGVznARTnWaENct/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1HZyuu-V_E2vBkqnhT9Z_mGsXgdDTR-u-/view?usp=drive_link', 2);
  
-- Existing records in the cabin table
INSERT INTO cabin (country, location, house_no, address_line, postcode, number_of_rooms, number_of_bathrooms, number_of_toilets, child_friendly, rental_type, disability_friendly, multi_share, rate, description)
VALUES
  ('USA', 'Yellowstone National Park', '123', 'Forest Road', '12345', '3', '2', '2', 'No', 'Short-term', 'Yes', 'No', 250.00, 'Cozy cabin in a serene forest setting.'),
  ('Canada', 'Banff National Park', '456', 'Mountain View Drive', '67890', '2', '1', '1', 'Yes', 'Short-term', 'Yes', 'No', 180.00, 'Charming cabin with stunning mountain views.'),
  ('Norway', 'Lofoten Islands', '789', 'Fjord Street', '54321', '4', '3', '2', 'Yes', 'Long-term', 'Yes', 'Yes', 300.00, 'Spacious cabin overlooking the breathtaking fjords.'),
  ('Switzerland', 'Zermatt', '321', 'Alpine Avenue', '98765', '5', '4', '3', 'Yes', 'Short-term', 'No', 'Yes', 400.00, 'Luxurious cabin in the heart of the Swiss Alps.');
  

INSERT INTO cabin_image (image, image_uri, cabin_cabin_id)
VALUES
  (null, 'https://drive.google.com/file/d/1eI9Af5JJD9_-p-AtfiKUx41TbBd7Ho88/view?usp=drive_link', 3),
  (null, 'https://drive.google.com/file/d/1p60ZZXTHpTyB4UoKqCV7TpRqGyVWZGkR/view?usp=drive_link', 3),
  (null, 'https://drive.google.com/file/d/18VukwNzyyR-kFIiJqsZEHIUk8oVsGu3x/view?usp=drive_link', 3),
  (null, 'https://drive.google.com/file/d/1Du8OOkiHKFG7k6JQQLDd-wdKDhoBNko-/view?usp=drive_link', 3),
  (null, 'https://drive.google.com/file/d/1WdIUtbSTE0c8S5ivqvZQOXP35OKjoGHW/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1OIKKi7Knc3Y_YkUaC2Zd8PU5BrqGHGdA/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1hT_m7nKMXLPxSjclCBJsi91ubWjNFs4t/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1dsbMUJTFuV4TRcTNCDNfZnZDCA0NPANy/view?usp=drive_link', 2);

-- Existing records in the beach property table
INSERT INTO beach (country, location, house_no, address, postcode, no_of_rooms, no_of_bathrooms, no_of_toilet, rental_type, disability_friendly)
VALUES
  ('Maldives', 'Kaafu Atoll', '123', 'Beachfront Villa', '12345', '3', '2', '2', 'Short-Term', 'Yes'),
  ('Greece', 'Santorini', '456', 'Cliffside House', '67890', '2', '1', '1', 'Short-Term', 'No'),
  ('Thailand', 'Phuket', '789', 'Tropical Retreat', '54321', '4', '3', '2', 'Long-Term', 'Yes'),
  ('Australia', 'Gold Coast', '321', 'Surfers Paradise', '98765', '5', '4', '3', 'Short-Term', 'Yes');


INSERT INTO beach_image (image, image_uri, beach_beach_house_id)
VALUES
  (null, 'https://drive.google.com/file/d/1bm2snorxQ4LxeR6UhZRC2yC0-URC5MmP/view?usp=drive_link', 1),
  (null, 'https://drive.google.com/file/d/1-hmCJCuCCqhRvjw-sviaheB4Fyf4JKLV/view?usp=drive_link', 1),
  (null, 'https://drive.google.com/file/d/1XJeMQi0GNeL1Abgb2Vxk-pFiRX7euO3K/view?usp=drive_link', 1),
  (null, 'https://drive.google.com/file/d/1h7oopFIZEC5WucJv-s8MHl6mf-p2S_zB/view?usp=drive_link', 1),
  (null, 'https://drive.google.com/file/d/1tHdCLNacPmlCMjqvDipJOR5dZmP6aIvM/view?usp=drive_link', 4),
  (null, 'https://drive.google.com/file/d/1PYuThtQxMDauIxtRToKDAkLiwFK9k0Uk/view?usp=drive_link', 4),
  (null, 'https://drive.google.com/file/d/1itRtXpktKyz8OTTr_UeNJsPSeOp9BF9D/view?usp=drive_link', 4),
  (null, 'https://drive.google.com/file/d/1Xs7Rf_bL9FZ1MYBQyzZ6MSsH5LNQgmXH/view?usp=drive_link', 4);

-- Existing records in the apartment table
INSERT INTO apartment (country, location, house_no, address, postcode, no_of_rooms, no_of_bathrooms, no_of_toilet, rental_type, disability_friendly, shared_status)
VALUES
  ('USA', 'New York', '123', 'Central Park Avenue', '12345', '3', '2', '2', 'Short-Term', 'Yes', 'Not Allowed'),
  ('UK', 'London', '456', 'Baker Street', '67890', '2', '1', '1', 'Short-Term', 'No', 'Not Allowed'),
  ('Spain', 'Barcelona', '789', 'Rambla Street', '54321', '4', '3', '2', 'Long-Term', 'Yes', 'Not Allowed'),
  ('Canada', 'Toronto', '321', 'King Street', '98765', '5', '4', '3', 'Short-Term', 'Yes', 'Not Allowed');


INSERT INTO camp_image (image, image_uri, apartment_apartment_id)
VALUES
  (null, 'https://drive.google.com/file/d/1pmarhD_2-oj9nOzjF409JjXW9RppUKL7/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1uAHzrO5-Vk4jQfqLnuZR9kE8gTuFi7mN/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1AXjuSwxMelgHP7HQFhVGpoqIRpf74YvD/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/1eTyrODKKeYbqMikmZtERY6HtAbNEPmXb/view?usp=drive_link', 2),
  (null, 'https://drive.google.com/file/d/16TOHITqB2jkFVAvfEvCnfIZKAnAN9EED/view?usp=drive_link', 4),
  (null, 'https://drive.google.com/file/d/1-k3mA0I9jm9MMg3SiJATBbia3G1EpFKl/view?usp=drive_link', 4),
  (null, 'https://drive.google.com/file/d/1A13vw-SByIjldjW19FF8a9IFsxylDEYc/view?usp=drive_link', 4),
  (null, 'https://drive.google.com/file/d/1DkQ9G30Q-6AMsKqRb5JvM2evm9pNhaNX/view?usp=drive_link', 4);
  


-- placeholder image

link: https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link



INSERT INTO "cabin_property" ("property_code", "country", "location", "building_no", "address_line", "postcode", "no_rooms", "bathroom", "toilet", "child_friendly", "disability_friendly", "rental_type", "multi_room_share", "rate", "description")
VALUES
  ('CAB-2012378967', 'USA', 'Yellowstone National Park', '123', 'Forest Road', '12345', 3, 2, 2, 'Yes', 'No', 'Short-Term', 'Not Allowed', 250.00, 'Cozy cabin in a serene forest setting.'),
  ('CAB-2010000981', 'Canada', 'Banff National Park', '456', 'Mountain View Drive', '67890', 2, 1, 1, 'Yes', 'Yes', 'Short-Term', 'Not Allowed', 180.00, 'Charming cabin with stunning mountain views.'),
  ('CAB-2012375320', 'Norway', 'Lofoten Islands', '789', 'Fjord Street', '54321', 4, 3, 2, 'Yes', 'Yes', 'Long-Term', 'Allowed', 300.00, 'Spacious cabin overlooking the breathtaking fjords.'),
  ('CAB-2012007217', 'Switzerland', 'Zermatt', '321', 'Alpine Avenue', '98765', 5, 4, 3, 'Yes', 'No', 'Short-Term', 'Allowed', 400.00, 'Luxurious cabin in the heart of the Swiss Alps.');
  
  
  



-- ========================= New Tables ===============================
CREATE TABLE "property" (
	"prop_id"	INTEGER NOT NULL UNIQUE,
	"property_code"	TEXT NOT NULL UNIQUE,
	"country"	TEXT,
	"location"	TEXT,
	"building_no"	TEXT,
	"adddress"	TEXT,
	"postcode"	TEXT,
	"rental_type"	TEXT DEFAULT 'Short-Term',
	"child_friendly"	TEXT DEFAULT 'Yes',
	"disability_friendly"	TEXT DEFAULT 'Yes',
	"no_rooms"	INTEGER DEFAULT 1,
	"no_bathroom"	INTEGER DEFAULT 1,
	"no_toilet"	INTEGER DEFAULT 1,
	"property_type"	TEXT,
	"star_rating"	REAL DEFAULT 00.00,
	"rate_per_night"	REAL DEFAULT 00.00,
	"description"	TEXT,
	PRIMARY KEY("prop_id" AUTOINCREMENT)
);
  
INSERT INTO "property" ("property_code", "country", "location", "property_name", "building_no", "adddress", "postcode", "rental_type", "child_friendly", "disability_friendly", "no_rooms", "no_bathroom", "no_toilet", "property_type", "star_rating", "rate_per_night", "description")
VALUES
  -- Cabin 1
  ('CAB000001', 'USA', 'Yellowstone', 'Cabin Retreat', '123', 'Forest Road', '12345', 'Short-Term', 'Yes', 'No', 3, 2, 2, 'Cabin', 4.5, 200.00, 'Cozy cabin in a serene forest setting.'),
  -- Cabin 2
  ('CAB000002', 'Canada', 'Banff', 'Mountain Lodge', '456', 'Mountain View Drive', '67890', 'Short-Term', 'Yes', 'Yes', 2, 1, 1, 'Cabin', 4.8, 150.00, 'Charming cabin with stunning mountain views.'),
  -- Cabin 3
  ('CAB000003', 'Norway', 'Lofoten Islands', 'Fjord View Cabin', '789', 'Fjord Street', '54321', 'Short-Term', 'Yes', 'Yes', 4, 3, 2, 'Cabin', 4.7, 180.00, 'Spacious cabin overlooking the breathtaking fjords.'),
  -- Cabin 4
  ('CAB000004', 'Switzerland', 'Zermatt', 'Alpine Chalet', '321', 'Alpine Avenue', '98765', 'Short-Term', 'Yes', 'No', 1, 1, 1, 'Cabin', 3.8, 100.00, 'Compact studio cabin in the Swiss Alps.'),
  
  -- Beach Front 1
  ('BEACH000001', 'Maldives', 'Baa Atoll', 'Tropical Paradise Resort', '123', 'Beach Villa Road', '20000', 'Short-Term', 'Yes', 'Yes', 5, 3, 3, 'Beach Front', 4.9, 350.00, 'Luxurious beachfront villa with private pool.'),
  -- Beach Front 2
  ('BEACH000002', 'Thailand', 'Phuket', 'Sandy Beach House', '456', 'Patong Beach', '83150', 'Short-Term', 'Yes', 'Yes', 4, 2, 2, 'Beach Front', 4.6, 280.00, 'Stylish beachfront apartment with ocean view.'),
  -- Beach Front 3
  ('BEACH000003', 'Bahamas', 'Nassau', 'Seaside Getaway', '789', 'Paradise Island', '12345', 'Short-Term', 'Yes', 'Yes', 6, 4, 3, 'Beach Front', 4.8, 420.00, 'Spacious beachfront house with private beach access.'),
  -- Beach Front 4
  ('BEACH000004', 'Mexico', 'Cancun', 'Oceanfront Retreat', '321', 'Hotel Zone', '77500', 'Short-Term', 'Yes', 'Yes', 3, 2, 2, 'Beach Front', 4.3, 240.00, 'Beachfront condo with stunning sunset views.'),
  
  -- Camping Site 1
  ('CAMP000001', 'Canada', 'Jasper', 'Riverside Campsite', '123', 'Campground Road', 'T0E 1E0', 'Short-Term', 'Yes', 'Yes', 1, 0, 0, 'Camping Site', 3.5, 60.00, 'Scenic camping site amidst nature.'),
  -- Camping Site 2
  ('CAMP000002', 'USA', 'Yosemite', 'Mountain Campground', '456', 'Nature Trail', '95389', 'Short-Term', 'Yes', 'Yes', 2, 0, 0, 'Camping Site', 4.0, 80.00, 'Camping site with breathtaking mountain views.'),
  -- Camping Site 3
  ('CAMP000003', 'Australia', 'Great Ocean Road', 'Beachside Camping', '789', 'Beachside Camping', '3232', 'Short-Term', 'Yes', 'Yes', 3, 0, 0, 'Camping Site', 4.2, 100.00, 'Beachside camping experience by the coast.'),
  -- Camping Site 4
  ('CAMP000004', 'Sweden', 'Lapland', 'Arctic Wilderness Camp', '321', 'Arctic Circle', '98107', 'Short-Term', 'Yes', 'Yes', 1, 0, 0, 'Camping Site', 3.8, 70.00, 'Campsite under the northern lights.'),
  
  -- Hotel 1
  ('HOTEL000001', 'Spain', 'Barcelona', 'Elegant City Hotel', '123', 'La Rambla', '08002', 'Short-Term', 'Yes', 'Yes', 400, 2, 2, 'Hotel', 4.7, 300.00, 'Elegant hotel in the heart of Barcelona.'),
  -- Hotel 2
  ('HOTEL000002', 'France', 'Paris', 'Luxury Parisian Hotel', '456', 'Champs-Élysées', '75008', 'Short-Term', 'Yes', 'Yes', 155, 3, 2, 'Hotel', 4.9, 400.00, 'Luxurious hotel with stunning views of Paris.'),
  -- Hotel 3
  ('HOTEL000003', 'Italy', 'Venice', 'Canal View Hotel', '789', 'Grand Canal', '30100', 'Short-Term', 'Yes', 'Yes', 85, 2, 2, 'Hotel', 4.5, 250.00, 'Charming hotel on the banks of the Grand Canal.'),
  -- Hotel 4
  ('HOTEL000004', 'Japan', 'Tokyo', 'Modern City Hotel', '321', 'Shibuya', '150-0041', 'Short-Term', 'Yes', 'Yes', 120, 1, 1, 'Hotel', 4.2, 180.00, 'Modern hotel in the vibrant Shibuya district.');
  
  
  
  
  
('CAB000001', 'USA', 'Yellowstone', 'Cabin Retreat', '123', 'Forest Road', '12345', 'Short-Term', 'Yes', 'No', 3, 2, 2, 'Cabin', 4.5, 200.00, 'Cozy cabin in a serene forest setting.'),
('CAB000002', 'Canada', 'Banff', 'Mountain Lodge', '456', 'Mountain View Drive', '67890', 'Short-Term', 'Yes', 'Yes', 2, 1, 1, 'Cabin', 4.8, 150.00, 'Charming cabin with stunning mountain views.'),
('CAB000003', 'Norway', 'Lofoten Islands', 'Fjord View Cabin', '789', 'Fjord Street', '54321', 'Short-Term', 'Yes', 'Yes', 4, 3, 2, 'Cabin', 4.7, 180.00, 'Spacious cabin overlooking the breathtaking fjords.'),
('CAB000004', 'Switzerland', 'Zermatt', 'Alpine Chalet', '321', 'Alpine Avenue', '98765', 'Short-Term', 'Yes', 'No', 1, 1, 1, 'Cabin', 3.8, 100.00, 'Compact studio cabin in the Swiss Alps.'),
('BEACH000001', 'Maldives', 'Baa Atoll', 'Tropical Paradise Resort', '123', 'Beach Villa Road', '20000', 'Short-Term', 'Yes', 'Yes', 5, 3, 3, 'Beach Front', 4.9, 350.00, 'Luxurious beachfront villa with private pool.'),
('BEACH000002', 'Thailand', 'Phuket', 'Sandy Beach House', '456', 'Patong Beach', '83150', 'Short-Term', 'Yes', 'Yes', 4, 2, 2, 'Beach Front', 4.6, 280.00, 'Stylish beachfront apartment with ocean view.'),
('BEACH000003', 'Bahamas', 'Nassau', 'Seaside Getaway', '789', 'Paradise Island', '12345', 'Short-Term', 'Yes', 'Yes', 6, 4, 3, 'Beach Front', 4.8, 420.00, 'Spacious beachfront house with private beach access.'),
('BEACH000004', 'Mexico', 'Cancun', 'Oceanfront Retreat', '321', 'Hotel Zone', '77500', 'Short-Term', 'Yes', 'Yes', 3, 2, 2, 'Beach Front', 4.3, 240.00, 'Beachfront condo with stunning sunset views.'),
('CAMP000001', 'Canada', 'Jasper', 'Riverside Campsite', '123', 'Campground Road', 'T0E 1E0', 'Short-Term', 'Yes', 'Yes', 1, 0, 0, 'Camping Site', 3.5, 60.00, 'Scenic camping site amidst nature.'),
('CAMP000002', 'USA', 'Yosemite', 'Mountain Campground', '456', 'Nature Trail', '95389', 'Short-Term', 'Yes', 'Yes', 2, 0, 0, 'Camping Site', 4.0, 80.00, 'Camping site with breathtaking mountain views.'),
('CAMP000003', 'Australia', 'Great Ocean Road', 'Beachside Camping', '789', 'Beachside Camping', '3232', 'Short-Term', 'Yes', 'Yes', 3, 0, 0, 'Camping Site', 4.2, 100.00, 'Beachside camping experience by the coast.'),
('CAMP000004', 'Sweden', 'Lapland', 'Arctic Wilderness Camp', '321', 'Arctic Circle', '98107', 'Short-Term', 'Yes', 'Yes', 1, 0, 0, 'Camping Site', 3.8, 70.00, 'Campsite under the northern lights.'),
('HOTEL000001', 'Spain', 'Barcelona', 'Elegant City Hotel', '123', 'La Rambla', '08002', 'Short-Term', 'Yes', 'Yes', 400, 2, 2, 'Hotel', 4.7, 300.00, 'Elegant hotel in the heart of Barcelona.'),
('HOTEL000002', 'France', 'Paris', 'Luxury Parisian Hotel', '456', 'Champs-Élysées', '75008', 'Short-Term', 'Yes', 'Yes', 155, 3, 2, 'Hotel', 4.9, 400.00, 'Luxurious hotel with stunning views of Paris.'),
('HOTEL000003', 'Italy', 'Venice', 'Canal View Hotel', '789', 'Grand Canal', '30100', 'Short-Term', 'Yes', 'Yes', 85, 2, 2, 'Hotel', 4.5, 250.00, 'Charming hotel on the banks of the Grand Canal.'),
('HOTEL000004', 'Japan', 'Tokyo', 'Modern City Hotel', '321', 'Shibuya', '150-0041', 'Short-Term', 'Yes', 'Yes', 120, 1, 1, 'Hotel', 4.2, 180.00, 'Modern hotel in the vibrant Shibuya district.');


INSERT INTO "image" ("image_uri", "prop_id_fk")
VALUES
  -- Cabin 1 Images
  ('https://example.com/cabin1_image1.jpg', 1),
  ('https://example.com/cabin1_image2.jpg', 1),
  ('https://example.com/cabin1_image3.jpg', 1),
  ('https://example.com/cabin1_image4.jpg', 1),
  
  -- Cabin 2 Images
  ('https://example.com/cabin2_image1.jpg', 2),
  ('https://example.com/cabin2_image2.jpg', 2),
  ('https://example.com/cabin2_image3.jpg', 2),
  ('https://example.com/cabin2_image4.jpg', 2),
  
    -- Cabin 3 Images
  ('https://example.com/cabin1_image1.jpg', 3),
  ('https://example.com/cabin1_image2.jpg', 3),
  ('https://example.com/cabin1_image3.jpg', 3),
  ('https://example.com/cabin1_image4.jpg', 3),
  
  -- Cabin 4 Images
  ('https://example.com/cabin2_image1.jpg', 4),
  ('https://example.com/cabin2_image2.jpg', 4),
  ('https://example.com/cabin2_image3.jpg', 4),
  ('https://example.com/cabin2_image4.jpg', 4),
  
  -- Beach Front 1 Images
  ('https://example.com/beach1_image1.jpg', 5),
  ('https://example.com/beach1_image2.jpg', 5),
  ('https://example.com/beach1_image3.jpg', 5),
  ('https://example.com/beach1_image4.jpg', 5),
  
  -- Beach Front 2 Images
  ('https://example.com/beach2_image1.jpg', 6),
  ('https://example.com/beach2_image2.jpg', 6),
  ('https://example.com/beach2_image3.jpg', 6),
  ('https://example.com/beach2_image4.jpg', 6),
  
    -- Beach Front 3 Images
  ('https://example.com/beach1_image1.jpg', 7),
  ('https://example.com/beach1_image2.jpg', 7),
  ('https://example.com/beach1_image3.jpg', 7),
  ('https://example.com/beach1_image4.jpg', 7),
  
  -- Beach Front 4 Images
  ('https://example.com/beach2_image1.jpg', 8),
  ('https://example.com/beach2_image2.jpg', 8),
  ('https://example.com/beach2_image3.jpg', 8),
  ('https://example.com/beach2_image4.jpg', 8),
  
  -- Camping Site 1 Images
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 9),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 9),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 9),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 9),
  
  -- Camping Site 2 Images
  ('https://drive.google.com/file/d/1pmarhD_2-oj9nOzjF409JjXW9RppUKL7/view?usp=drive_link', 10),
  ('https://drive.google.com/file/d/1uAHzrO5-Vk4jQfqLnuZR9kE8gTuFi7mN/view?usp=drive_link', 10),
  ('https://drive.google.com/file/d/1AXjuSwxMelgHP7HQFhVGpoqIRpf74YvD/view?usp=drive_link', 10),
  ('https://drive.google.com/file/d/1eTyrODKKeYbqMikmZtERY6HtAbNEPmXb/view?usp=drive_link', 10),
  
    -- Camping Site 3 Images
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 11),
  
  -- Camping Site 4 Images
  ('https://drive.google.com/file/d/16TOHITqB2jkFVAvfEvCnfIZKAnAN9EED/view?usp=drive_link', 12),
  ('https://drive.google.com/file/d/1-k3mA0I9jm9MMg3SiJATBbia3G1EpFKl/view?usp=drive_link', 12),
  ('https://drive.google.com/file/d/1A13vw-SByIjldjW19FF8a9IFsxylDEYc/view?usp=drive_link', 12),
  ('https://drive.google.com/file/d/1DkQ9G30Q-6AMsKqRb5JvM2evm9pNhaNX/view?usp=drive_link', 12),
  
  -- Hotel 1 Images
  ('https://drive.google.com/file/d/1JTwmIRA9wTGZ0_qzJoX82KbqVagu8_6-/view?usp=drive_link', 13),
  ('https://drive.google.com/file/d/1ke5JFaiByCLYN26n2poUkGnierIiw7v-/view?usp=drive_link', 13),
  ('https://drive.google.com/file/d/1C0b4tI3IZ0eMlOJlWC1-bTIIwyFy9NVV/view?usp=drive_link', 13),
  ('https://drive.google.com/file/d/14Qju20ISuU9Dx7wMvROV5IC8AfPGxQap/view?usp=drive_link', 13),
  
  -- Hotel 2 Images
  ('https://drive.google.com/file/d/1Q-mjZU5ddzcU75gmbnKGMSPz0iK_3AuR/view?usp=drive_link', 14),
  ('https://drive.google.com/file/d/1_0nl-Um93uNw3P5GU-mkXHDx02knDVbF/view?usp=drive_link', 14),
  ('https://drive.google.com/file/d/1r-BYEckvQ-Z2CwarhwGVznARTnWaENct/view?usp=drive_link', 14),
  ('https://drive.google.com/file/d/1HZyuu-V_E2vBkqnhT9Z_mGsXgdDTR-u-/view?usp=drive_link', 14),
  
    -- Hotel 3 Images
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 15),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 15),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 15),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 15),
  
  -- Hotel 4 Images
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16),
  ('https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link', 16);




  









-- Entering records in the reviews table
INSERT INTO property_review (description, rating, user_id)
VALUES 
  ('Great hotel!', 4.5, 1),
  ('Amazing place!', 5.0, 2),
  ('Average experience.', 3.2, 3);
  
  






