package com.example.stays.Models;

import java.util.ArrayList;

public class PropertyData {

    public static ArrayList<PropertyDataModel> getList(){

        ArrayList<PropertyDataModel> propertyList = new ArrayList<>();
//        propertyList.add(new Property("1961 Forest Road", "4.5", "200.00", "23", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link"));
//        propertyList.add(new Property("233 Mountain View Drive", "4.8", "150.00", "43", "https://drive.google.com/file/d/1hT_m7nKMXLPxSjclCBJsi91ubWjNFs4t/view?usp=drive_link"));
//        propertyList.add(new Property("01 Fjord Street",  "4.7", "180.00", "13", "https://drive.google.com/file/d/1p60ZZXTHpTyB4UoKqCV7TpRqGyVWZGkR/view?usp=drive_link"));
//        propertyList.add(new Property("100 Alpine Avenue", "3.8", "100.00", "9", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link"));
//        propertyList.add(new Property("33 Beach Villa Road",  "4.9", "350.00", "16", "https://drive.google.com/file/d/1bm2snorxQ4LxeR6UhZRC2yC0-URC5MmP/view?usp=drive_link"));
//        propertyList.add(new Property("1099 Patong Beach","4.6", "280.00", "8", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link"));
//        propertyList.add(new Property("22 Paradise Island", "4.8", "420.00", "15", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link"));
//        propertyList.add(new Property("90 Hotel Zone", "4.3", "240.00", "33", "https://drive.google.com/file/d/1tHdCLNacPmlCMjqvDipJOR5dZmP6aIvM/view?usp=drive_link"));
//        propertyList.add(new Property("78 Campground Road","3.5", "60.00", "27", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link"));
//        propertyList.add(new Property("600 Nature Trail","4.0", "80.00", "40", "https://drive.google.com/file/d/1pmarhD_2-oj9nOzjF409JjXW9RppUKL7/view?usp=drive_link"));
//        propertyList.add(new Property("11 Beachside Camping", "4.2", "100.00", "80.9", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link"));
//        propertyList.add(new Property("44 Arctic Circle",  "3.8", "70.00", "51", "https://drive.google.com/file/d/16TOHITqB2jkFVAvfEvCnfIZKAnAN9EED/view?usp=drive_link"));
//        propertyList.add(new Property("2333 La Rambla", "4.7", "300.00", "22", "https://drive.google.com/file/d/1JTwmIRA9wTGZ0_qzJoX82KbqVagu8_6-/view?usp=drive_link"));
//        propertyList.add(new Property("12 Champs-Élysées","4.9", "400.00", "17", "https://drive.google.com/file/d/1Q-mjZU5ddzcU75gmbnKGMSPz0iK_3AuR/view?usp=drive_link"));
//        propertyList.add(new Property("64 Grand Canal", "4.5", "250.00", "7.5", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link"));
//        propertyList.add(new Property("11101 Shibuya Drive, Mandelson Way",  "4.2", "180.00", "2.6", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link"));
//        Other Data Set
//        propertyList.add(new PropertyDataModel("1961 Forest Road", "4.5", "200.00", "23", "R.drawable.cabin_1", "Cabin"));
//        propertyList.add(new PropertyDataModel("233 Mountain View Drive", "4.8", "150.00", "43", "R.drawable.cabin_2", "Cabin"));
//        propertyList.add(new PropertyDataModel("01 Fjord Street",  "4.7", "180.00", "13", "R.drawable.cabin_3", "Cabin"));
//        propertyList.add(new PropertyDataModel("100 Alpine Avenue", "3.8", "100.00", "9", "R.drawable.cabin_4.jpeg", "Cabin"));
//        propertyList.add(new PropertyDataModel("33 Beach Villa Road",  "4.9", "350.00", "16", "R.drawable.beach_1", "Beach"));
//        propertyList.add(new PropertyDataModel("1099 Patong Beach","4.6", "280.00", "8", "R.drawable.beach_2", "Beach"));
//        propertyList.add(new PropertyDataModel("22 Paradise Island", "4.8", "420.00", "15", "R.drawable.beach_3", "Beach"));
//        propertyList.add(new PropertyDataModel("90 Hotel Zone", "4.3", "240.00", "33", "R.drawable.beach_4", "Beach"));
//        propertyList.add(new PropertyDataModel("78 Campground Road","3.5", "60.00", "27", "R.drawable.camp_1", "Camp"));
//        propertyList.add(new PropertyDataModel("600 Nature Trail","4.0", "80.00", "40", "R.drawable.camp_2", "Camp"));
//        propertyList.add(new PropertyDataModel("11 Beachside Camping", "4.2", "100.00", "80.9", "R.drawable.camp_3", "Camp"));
//        propertyList.add(new PropertyDataModel("44 Arctic Circle",  "3.8", "70.00", "51", "R.drawable.camp_4", "Camp"));
//        propertyList.add(new PropertyDataModel("2333 La Rambla", "4.7", "300.00", "22", "R.drawable.hotel_1", "Hotel"));
//        propertyList.add(new PropertyDataModel("12 Champs-Élysées","4.9", "400.00", "17", "R.drawable.hotel_2", "Hotel"));
//        propertyList.add(new PropertyDataModel("64 Grand Canal", "4.5", "250.00", "7.5", "R.drawable.hotel_3", "Hotel"));
//        propertyList.add(new PropertyDataModel("11101 Shibuya Drive, Mandelson Way",  "4.2", "180.00", "2.6", "R.drawable.hotel_4", "Hotel"));
//        Another Dataset
//        propertyList.add(new PropertyDataModel("1961 Forest Road", "4.5", "200.00", "23", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Cabin"));
//        propertyList.add(new PropertyDataModel("233 Mountain View Drive", "4.8", "150.00", "43", "https://drive.google.com/file/d/1hT_m7nKMXLPxSjclCBJsi91ubWjNFs4t/view?usp=drive_link", "Cabin"));
//        propertyList.add(new PropertyDataModel("01 Fjord Street",  "4.7", "180.00", "13", "https://drive.google.com/file/d/1p60ZZXTHpTyB4UoKqCV7TpRqGyVWZGkR/view?usp=drive_link", "Cabin"));
//        propertyList.add(new PropertyDataModel("100 Alpine Avenue", "3.8", "100.00", "9", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Cabin"));
//        propertyList.add(new PropertyDataModel("33 Beach Villa Road",  "4.9", "350.00", "16", "https://drive.google.com/file/d/1bm2snorxQ4LxeR6UhZRC2yC0-URC5MmP/view?usp=drive_link", "Beach"));
//        propertyList.add(new PropertyDataModel("1099 Patong Beach","4.6", "280.00", "8", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Beach"));
//        propertyList.add(new PropertyDataModel("22 Paradise Island", "4.8", "420.00", "15", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Beach"));
//        propertyList.add(new PropertyDataModel("90 Hotel Zone", "4.3", "240.00", "33", "https://drive.google.com/file/d/1tHdCLNacPmlCMjqvDipJOR5dZmP6aIvM/view?usp=drive_link", "Beach"));
//        propertyList.add(new PropertyDataModel("78 Campground Road","3.5", "60.00", "27", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Camp"));
//        propertyList.add(new PropertyDataModel("600 Nature Trail","4.0", "80.00", "40", "https://drive.google.com/file/d/1pmarhD_2-oj9nOzjF409JjXW9RppUKL7/view?usp=drive_link", "Camp"));
//        propertyList.add(new PropertyDataModel("11 Beachside Camping", "4.2", "100.00", "80.9", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Camp"));
//        propertyList.add(new PropertyDataModel("44 Arctic Circle",  "3.8", "70.00", "51", "https://drive.google.com/file/d/16TOHITqB2jkFVAvfEvCnfIZKAnAN9EED/view?usp=drive_link", "Camp"));
//        propertyList.add(new PropertyDataModel("2333 La Rambla", "4.7", "300.00", "22", "https://drive.google.com/file/d/1JTwmIRA9wTGZ0_qzJoX82KbqVagu8_6-/view?usp=drive_link", "Hotel"));
//        propertyList.add(new PropertyDataModel("12 Champs-Élysées","4.9", "400.00", "17", "https://drive.google.com/file/d/1Q-mjZU5ddzcU75gmbnKGMSPz0iK_3AuR/view?usp=drive_link", "Hotel"));
//        propertyList.add(new PropertyDataModel("64 Grand Canal", "4.5", "250.00", "7.5", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Hotel"));
//        propertyList.add(new PropertyDataModel("11101 Shibuya Drive, Mandelson Way",  "4.2", "180.00", "2.6", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Hotel"));
        //        Another Dataset
        propertyList.add(new PropertyDataModel("1961 Forest Road", "4.5", "20.00", "93.00", "https://www.dropbox.com/scl/fi/y7wqn9yme6ycsfi87jl61/cabin_1.jpeg?rlkey=kh1ba7kabicklwshrthfr3i6s&dl=0", "Cabin"));
        propertyList.add(new PropertyDataModel("233 Mountain View Drive", "4.8", "15.45", "103.00", "https://www.dropbox.com/scl/fi/115f50qg5qmzzq39548re/cabin_2.jpeg?rlkey=xy5sx9d26cu2uhrvr7ckq5ant&dl=0", "Cabin"));
        propertyList.add(new PropertyDataModel("01 Fjord Street",  "4.7", "18", "130.00", "https://www.dropbox.com/scl/fi/mve9rykp1kscnmd30yo98/cabin_3.jpeg?rlkey=940irv3oof20yxcdot2plwhfh&dl=0", "Cabin"));
        propertyList.add(new PropertyDataModel("100 Alpine Avenue", "3.8", "10.67", "99.00", "https://www.dropbox.com/scl/fi/v8y69fpsues6hexu6phme/cabin_4.jpeg?rlkey=bx12u74wdtiwz43hprn6pqpg9&dl=0", "Cabin"));
        propertyList.add(new PropertyDataModel("33 Beach Villa Road",  "4.9", "3.03", "160.00", "https://www.dropbox.com/scl/fi/e3jlaoduyx267rzn27iva/beach_1.jpeg?rlkey=n9k21xvd67cvwf3cyemq56cwx&dl=0", "Beach"));
        propertyList.add(new PropertyDataModel("1099 Patong Beach","4.6", "28.00", "89.00", "https://www.dropbox.com/scl/fi/ptjwvifyuw7ag0yb9sbu2/beach_2.jpeg?rlkey=z3bp7n18wyu7psle1t5qjc9m2&dl=0", "Beach"));
        propertyList.add(new PropertyDataModel("22 Paradise Island", "4.8", "4.20", "150.00", "https://www.dropbox.com/scl/fi/isvvlu5qrrpdl1r261bsb/beach_3.jpeg?rlkey=kwco2lftnmq0jnnhd1d1jv2wx&dl=0", "Beach"));
        propertyList.add(new PropertyDataModel("90 Hotel Zone", "4.3", "2.40", "330", "https://www.dropbox.com/scl/fi/6i2czf3jhyfie4bga0nsi/beach_4.jpeg?rlkey=nn513fvl6nlj26qlnvris781b&dl=0", "Beach"));
        propertyList.add(new PropertyDataModel("78 Campground Road","3.5", "60.00", "27", "https://www.dropbox.com/scl/fi/q2v1mq2w08743qqu0a623/camp_1.jpeg?rlkey=txrh3cihgc2wq036f1qfulqy5&dl=0", "Camp"));
        propertyList.add(new PropertyDataModel("600 Nature Trail","4.0", "80.00", "40", "https://www.dropbox.com/scl/fi/17738zq0paq2nclwv17zx/camp_2.jpeg?rlkey=xgrkukxc2qcggasoochl2cdoa&dl=0", "Camp"));
        propertyList.add(new PropertyDataModel("11 Beachside Camping", "4.2", "100.00", "80.9", "https://www.dropbox.com/scl/fi/mixnysp87qj8vxkg5bxvt/camp_03.jpeg?rlkey=33j1rdfwmd8ht7b2su7lo08id&dl=0", "Camp"));
        propertyList.add(new PropertyDataModel("44 Arctic Circle",  "3.8", "70.00", "51", "https://www.dropbox.com/scl/fi/njk04t6y9etkoziky1v1q/camp_5.jpeg?rlkey=vzkctahrhg61cwpvg9nlzunrr&dl=0", "Camp"));
        propertyList.add(new PropertyDataModel("2333 La Rambla", "4.7", "300.00", "22", "https://www.dropbox.com/scl/fi/wg8hj3h6xlaz26ta3oluf/hotel_1.jpeg?rlkey=syotigomevbjfx5st51vcyfuz&dl=0", "Hotel"));
        propertyList.add(new PropertyDataModel("12 Champs-Élysées","4.9", "400.00", "17", "https://www.dropbox.com/scl/fi/7dmhhpcco6o6nf6x5d4qo/hotel_2.jpeg?rlkey=9zfsa4fe68erl9atvlr5xoiky&dl=0", "Hotel"));
        propertyList.add(new PropertyDataModel("64 Grand Canal", "4.5", "250.00", "7.5", "https://www.dropbox.com/scl/fi/ym4sndacnmpidklx9u283/hotel_3.jpeg?rlkey=5bfvzfuspm6a7tqaiiljsmv2n&dl=0", "Hotel"));
        propertyList.add(new PropertyDataModel("11101 Shibuya Drive, Mandelson Way",  "4.2", "180.00", "2.6", "https://www.dropbox.com/scl/fi/cclwagjxpq4nnner4e35m/hotel_4.jpeg?rlkey=2ulbne0sfomgjommt1ilipxxm&dl=0", "Hotel"));

        return propertyList;


    }


}
